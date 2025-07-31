import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.println("-------------------------------");
    System.out.println("Hesap Makinesine Hoş Geldiniz!");
    System.out.println("-------------------------------");

    double result = 0;
    boolean isFirstNumberReceived = false;

    while(!isFirstNumberReceived) {
        System.out.print("\nLütfen bir sayı girin: ");
        try {
            result = scanner.nextDouble();
            isFirstNumberReceived = true;
        } catch (InputMismatchException e) {
            System.out.println("Hatalı sayısal değer girdiniz!");
            scanner.next();
        }
    }



    scanner.close();
 }
}

