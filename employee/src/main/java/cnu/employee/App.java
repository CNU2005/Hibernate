package cnu.employee;

import java.util.*;

public class App {
    public static void main(String[] args) {

        EmployeeDAO dao = new EmployeeDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Insert");
            System.out.println("2.View");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Exit");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Emp ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Dept: ");
                    String dept = sc.nextLine();

                    System.out.print("Salary: ");
                    double sal = sc.nextDouble();
                    sc.nextLine(); // Consume Enter

                    System.out.print("Join Date: ");
                    String date = sc.nextLine();

                    dao.saveemployee(new Employee(id, name, dept, sal, date));
                    break;

                case 2:
                    List<Employee> list = dao.getAllEmployees();

                    for (Employee e : list) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    System.out.print("Enter Emp ID: ");
                    id = sc.nextInt();

                    Employee st = dao.getEmployee(id);

                    if (st != null) {
                        sc.nextLine();

                        System.out.print("New Name: ");
                        st.setname(sc.nextLine());

                        System.out.print("New Dept: ");
                        st.setdept(sc.nextLine());

                        System.out.print("New Salary: ");
                        st.setsal(sc.nextDouble());
                        sc.nextLine(); // Consume Enter

                        System.out.print("New Join Date: ");
                        st.setdate(sc.nextLine());

                        dao.updateEmployee(st);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Emp ID: ");
                    dao.deleteEmployee(sc.nextInt());
                    break;

                case 5:
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}