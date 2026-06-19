package cnu.student;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {

        StudentDAO dao=new StudentDAO();
        Scanner sc=new Scanner(System.in);

        while(true) {

            System.out.println("\n1.Insert");
            System.out.println("2.View");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Exit");

            int ch=sc.nextInt();

            switch(ch) {

            case 1:
                System.out.print("Student ID: ");
                int id=sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name=sc.nextLine();

                System.out.print("Email: ");
                String email=sc.nextLine();

                System.out.print("Course: ");
                String course=sc.nextLine();

                System.out.print("Age: ");
                int age=sc.nextInt();

                dao.saveStudent(new Student(id,name,email,course,age));
                break;

            case 2:
                List<Student> list=dao.getAllStudents();
                for(Student s:list) {
                    System.out.println(s);
                }
                break;

            case 3:
                System.out.print("Enter Student ID: ");
                int uid=sc.nextInt();

                Student st=dao.getStudent(uid);

                if(st!=null) {
                    sc.nextLine();

                    System.out.print("New Name: ");
                    st.setName(sc.nextLine());

                    System.out.print("New Email: ");
                    st.setEmail(sc.nextLine());

                    System.out.print("New Course: ");
                    st.setCourse(sc.nextLine());

                    System.out.print("New Age: ");
                    st.setAge(sc.nextInt());

                    dao.updateStudent(st);
                }
                break;

            case 4:
                System.out.print("Enter Student ID: ");
                dao.deleteStudent(sc.nextInt());
                break;

            case 5:
                sc.close();
                System.exit(0);
            }
        }
    }
}
