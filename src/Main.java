import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

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

        while(true) {
            char operator;
            while (true) {
                System.out.print("Lütfen bir işlem girin (+, -, *, /, %) veya sonucu görmek için '=' girin: ");
                operator = scanner.next().charAt(0);

                if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%' || operator == '='){

                    break;
                }
                else {
                    System.out.println("Hatalı işlem girdiniz!");
                }
            }
            if (operator == '='){
                System.out.println("İşlem sonucunuz: " + result);
                break;
            }

            double number;

            while(true) {
                System.out.print("Lütfen bir sonraki sayıyı girin: ");
                try {
                    number = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Hatalı sayısal değer girdiniz!");
                    scanner.next();
                }
            }
            switch (operator) {
                case '+' -> result = calculator.add(result, number);
                case '-' -> result = calculator.subtract(result, number);
                case '*' -> result = calculator.multiply(result, number);
                case '/' -> result = calculator.divide(result, number);
                case '%' -> result = calculator.getRemainder(result, number);
            }

            System.out.println("Mevcut sonuç: " + result);

        }
        scanner.close();
    }
}
