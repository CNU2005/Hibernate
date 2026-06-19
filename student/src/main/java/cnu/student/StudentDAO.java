package cnu.student;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class StudentDAO {
	 private static final SessionFactory factory =
	            new Configuration().configure().buildSessionFactory();
	 public void saveStudent(Student student)
	 {
		 Session session=factory.openSession();
		 Transaction tx=session.beginTransaction();
		 session.persist(student);
		 tx.commit();
	     session.close();
		 
	 }
	 public List<Student> getAllStudents(){
		 Session session=factory.openSession();
		 List<Student> list=session.createQuery("From Student",Student.class).list();
		 session.close();
		 return list;
	 }
	 public Student getStudent(int id)
	 {
		 Session session=factory.openSession();
		 Student std=session.get(Student.class,id);
		 session.close();
		 return std;
	 }
	 public void updateStudent(Student student) {
	        Session session = factory.openSession();
	        Transaction tx = session.beginTransaction();
	        session.merge(student);
	        tx.commit();
	        session.close();
	    }
	 public void deleteStudent(int id) {
	        Session session = factory.openSession();
	        Transaction tx = session.beginTransaction();
	        Student std = session.get(Student.class, id);
	        if (std != null) {
	            session.remove(std);
	        }
	        tx.commit();
	        session.close();
	    }
	 
	
}
