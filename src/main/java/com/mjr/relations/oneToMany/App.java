package com.mjr.relations.oneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    
    	/*
    	Profesor profesor = new Profesor();
    	
    	profesor.setNombre("Marcelo");
    	
    	CorreoElectronico email1=new CorreoElectronico();
    	email1.setProfesor(profesor);
    	email1.setDirección("mrodriguez@intel.sv.com");

    	CorreoElectronico email2=new CorreoElectronico();
    	email1.setProfesor(profesor);
    	email2.setDirección("mrodriguez@docker.sv.com");
    		
    	*/
    		
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session= factory.openSession();
        		
        Mentor men1 = new Mentor();
        Mentor men2 = new Mentor();
        
        men1.setNombre("Ilan bluestone");
        men2.setNombre("Armin");
        
        
        Modulo mod1 = new  Modulo();
        Modulo mod2 = new  Modulo();
        
        
        mod1.setNombre("Matematica");
        mod2.setNombre("Fisica");
        
        mod1.getMentores().add(men1);
        mod1.getMentores().add(men2);
        
        mod2.getMentores().add(men2);
        
        men1.getModulos().add(mod1);
        men1.getModulos().add(mod2);
        
        
        session.save(mod1);
        session.save(mod2);
        
        session.save(men1);
        session.save(men2);
        
        
        session.beginTransaction();
        
        
        
        session.getTransaction().commit();

    
    
    }
}
