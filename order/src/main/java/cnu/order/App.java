package cnu.order;

import java.util.*;

public class App {

    public static void main(String[] args) {

        OrderDAO dao = new OrderDAO();
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
                System.out.print("Order ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Customer Name: ");
                String cname = sc.nextLine();

                System.out.print("Food Item: ");
                String food = sc.nextLine();

                System.out.print("Quantity: ");
                int qty = sc.nextInt();

                System.out.print("Total Amount: ");
                double amt = sc.nextDouble();
                sc.nextLine();

                System.out.print("Order Date: ");
                String date = sc.nextLine();

                System.out.print("Order Status: ");
                String status = sc.nextLine();

                dao.saveOrder(
                        new Order(id, cname, food,
                                qty, amt, date, status));

                break;

            case 2:
                List<Order> list = dao.getAllOrders();

                for (Order o : list) {
                    System.out.println(o);
                }
                break;

            case 3:
                System.out.print("Enter Order ID: ");
                int uid = sc.nextInt();

                Order ord = dao.getOrder(uid);

                if (ord != null) {

                    sc.nextLine();

                    System.out.print("New Customer Name: ");
                    ord.setCustomername(sc.nextLine());

                    System.out.print("New Food Item: ");
                    ord.setFooditem(sc.nextLine());

                    System.out.print("New Quantity: ");
                    ord.setQuantity(sc.nextInt());

                    System.out.print("New Total Amount: ");
                    ord.setTotalamt(sc.nextDouble());
                    sc.nextLine();

                    System.out.print("New Order Date: ");
                    ord.setOrderdate(sc.nextLine());

                    System.out.print("New Order Status: ");
                    ord.setOrderstatus(sc.nextLine());

                    dao.updateOrder(ord);
                } else {
                    System.out.println("Order not found.");
                }
                break;

            case 4:
                System.out.print("Enter Order ID: ");
                dao.deleteOrder(sc.nextInt());
                break;

            case 5:
                sc.close();
                System.exit(0);
            }
        }
    }
}