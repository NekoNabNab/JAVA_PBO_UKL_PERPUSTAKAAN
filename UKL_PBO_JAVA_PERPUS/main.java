package UKL_PBO_JAVA_PERPUS;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        menu Menu = new menu();
        book Book = new book();
        boolean status;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the library!");
        System.out.print("Input ID    = ");
        Integer ID = input.nextInt();
        if (ID.equals(1)) {
            Member member1 = new Member();
            member1.student();
            member1.librarian();
            Menu.menu1();

            Integer menuu = input.nextInt();
            if (menuu.equals(1) && (status = true)) {
                Book.listBook();

                System.out.print("Input Book Code = ");
                Integer code = input.nextInt();
                if (code.equals(001)) {
                    Book.book1();
                    Book.borrowed();
                    status = false;

                    Book.menu2();
                    Integer returnn = input.nextInt();
                    Book.returned();
                    Book.quit();

                } else if (code.equals(002)) {
                    Book.book2();
                    Book.borrowed();
                    status = false;

                    Book.menu2();
                    Integer returnn = input.nextInt();
                    Book.returned();
                    Book.quit();

                } else if (code.equals(003)) {
                    Book.book3();
                    Book.borrowed();
                    status = false;

                    Book.menu2();
                    Integer returnn = input.nextInt();

                    Book.returned();
                    Book.quit();
                } else {
                    System.out.println("Book not found");
                }
            } else if (menuu.equals(1) && (status = false)) {
                System.out.println("You Cannot Borrow the Book!");
                status = false;
            } else if (menuu.equals(2)) {
                System.out.println("You have no book to return");
                status = true;
            } else if (menuu.equals(3)) {
                Book.quit();
            }
        } else {
            System.out.println("Person not found");
        }
    }
}