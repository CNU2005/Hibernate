package cnu.employee;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;


public class EmployeeDAO {
	private static final SessionFactory factory= new Configuration().configure().buildSessionFactory();
	public void saveemployee(Employee emp)
	{
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		s.persist(emp);
		tx.commit();
		s.close();
	}
	public List<Employee> getAllEmployees()
	{
		Session s=factory.openSession();
		List<Employee> emps=s.createQuery("From Employee",Employee.class).list();
		s.close();
		return emps;
		
	}
	public Employee getEmployee(int id) {
		Session s=factory.openSession();
		Employee emp=s.get(Employee.class, id);
		s.close();
		return emp;
	}
	public void updateEmployee(Employee emp) {
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		s.merge(emp);
		tx.commit();
		s.close();
		
		}
	public void deleteEmployee(int id) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Employee emp = session.get(Employee.class, id);
        if (emp != null) {
            session.remove(emp);
        }
        tx.commit();
        session.close();
    } 
	
	

}
