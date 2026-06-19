package cnu.book;

import java.util.*;

public class App {

    public static void main(String[] args) {

        BookDAO dao = new BookDAO();
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
                    System.out.print("Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title: ");
                    String title = sc.nextLine();

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    System.out.print("Category: ");
                    String category = sc.nextLine();

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    System.out.print("Available Copies: ");
                    int copies = sc.nextInt();

                    dao.saveBook(
                            new Book(id, title, author,
                                    category, price, copies));

                    break;

                case 2:
                    List<Book> list = dao.getAllBooks();

                    for (Book b : list) {
                        System.out.println(b);
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int uid = sc.nextInt();

                    Book bk = dao.getBook(uid);

                    if (bk != null) {
                        sc.nextLine();

                        System.out.print("New Title: ");
                        bk.setTitle(sc.nextLine());

                        System.out.print("New Author: ");
                        bk.setAuthor(sc.nextLine());

                        System.out.print("New Category: ");
                        bk.setCategory(sc.nextLine());

                        System.out.print("New Price: ");
                        bk.setPrice(sc.nextDouble());

                        System.out.print("New Available Copies: ");
                        bk.setAvailablecopies(sc.nextInt());

                        dao.updateBook(bk);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    dao.deleteBook(sc.nextInt());
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