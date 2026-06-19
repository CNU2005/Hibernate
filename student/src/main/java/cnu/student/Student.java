package cnu.student;

import javax.persistence.*;

@Entity
public class Student {
	@Id
	private int studentid;
	private String studentname;
	private String email;
	private String course;
	private int age;
	public Student() {}
	public Student(int studentid,String studentname,String email,String course,int age) {
    	this.studentid=studentid;
        this.studentname=studentname;
        this.email=email;
        this.course=course;
        this.age=age;
    }

    public int getId() {
        return studentid;
    }

    public void setId(int id) {
        this.studentid=id;
    }

    public String getName() {
        return studentname;
    }

    public void setName(String name) {
        this.studentname=name;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=email;
    }
    
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course=course;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }
   
    

    @Override
    public String toString() {
    	return "Student [id=" + studentid +
    		       ", name=" + studentname +
    		       ", email=" + email +
    		       ", course=" + course +
    		       ", age=" + age + "]";
    }

}
