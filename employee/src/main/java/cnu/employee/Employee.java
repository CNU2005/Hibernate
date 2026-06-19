package cnu.employee;

import javax.persistence.*;

@Entity
public class Employee {
	@Id
	private int empid;
	private String empname;
	private String dept;
	private double sal;
	private String joindate;
	public Employee() {}
	public Employee(int id,String name,String dept,double sal,String date) {
		this.empid=id;
		this.empname=name;
		this.dept=dept;
		this.sal=sal;
		this.joindate=date;
	}
	public int getid() {
		return empid;
	}
	public void setid(int id) {
		this.empid=id;
	}
	public String getname() {
		return empname;
	}
	public void setname(String name) {
		this.empname=name;
	}
	public String getdept() {
		return dept;
	}
	public void setdept(String dept) {
		this.dept=dept;
	}
	public double getsal() {
		return sal;
	}
	public void setsal(double  sal) {
		this.sal=sal;
	}
	public String getdate() {
		return joindate;
	}
	public void setdate(String date) {
		this.joindate=date;
	}
	@Override
    public String toString() {
    	return "Employee [id=" + empid +
    		       ", name=" + empname +
    		       ", dept=" + dept +
    		       ", sal=" + sal +
    		       ", joindate=" + joindate + "]";
    }

}
