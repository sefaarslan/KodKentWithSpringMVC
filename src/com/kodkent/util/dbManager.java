package com.kodkent.util;

import java.lang.reflect.Field;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

public class dbManager<T> implements Icrud<T>{
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean save(T t) {
		  try{
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.saveOrUpdate(t);
		         
		        return true;
		     }catch(Exception ex){
		        
		//load the logs      
		      return false;
		     }
	}


	@Override
	public boolean delete(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<T> list(T t) {
		
		        List<T> listem;
		        try{
					Session currentSession = sessionFactory.getCurrentSession();

		            Criteria cr = currentSession.createCriteria(t.getClass());
		            listem = cr.list();
		           
		            return listem;
		            }catch(Exception ex){
		        		//load the logs      

		            return null;
		            }

	}

	@Override
	public T find(int id, T t) {
		 List<T> listem;
	        try{
	        	Session currentSession = sessionFactory.getCurrentSession();
	        Criteria cr = currentSession.createCriteria(t.getClass());
	        cr.add(Restrictions.eq("id", id));
	        
	        listem = cr.list();
	        
	        return (T)listem.get(0);
	        }catch(Exception ex){
	         
	        return null;
	        }

	}

	@Override
	public List<T> search(String column, String value, T t) {
		 List<T> listem;
	        try{
	        	Session currentSession = sessionFactory.getCurrentSession();

	        Criteria cr = currentSession.createCriteria(t.getClass());
	        cr.add(Restrictions.like(column, "%"+value+"%"));
	        listem = cr.list();
	        
	        return listem;
	        }catch(Exception ex){
	               
	        return null;
	        }
	}

	@Override
	public List<T> search(T t) {
		 List<T> listem;
         Class tm = t.getClass();
         Field[] sl = tm.getDeclaredFields();
        try{
        	Session currentSession = sessionFactory.getCurrentSession();
        Criteria cr = currentSession.createCriteria(t.getClass());
            for (int i = 0; i < sl.length; i++) {
                if(sl[i]!=null) 
                cr.add(Restrictions.like(sl[i].getName(), "%"+sl[i]+"%"));
            }
 
        listem = cr.list();
        
        return listem;
        }catch(Exception ex){
              
        return null;
        }
    }

	

	
}
