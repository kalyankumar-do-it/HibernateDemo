package com.techjs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techjs.entity.StudentEntity;

public class HibernateDemo 
{

	public static void main(String[] args) 
	{
         StudentEntity studentEntity = new StudentEntity();
         studentEntity.setId(1002);
         studentEntity.setFirstName("Sandeep");
         studentEntity.setSecondName("Kumar");
         
         Configuration config = new Configuration().configure();
         config.addAnnotatedClass(StudentEntity.class);
         
         SessionFactory sf = config.buildSessionFactory();
         Session session = sf.openSession();
         
         Transaction ts = session.beginTransaction();
         session.save(studentEntity);
         ts.commit();
         
         session.close();
         sf.close();

	}

}
