
import java.util.Scanner;
public class MainClass {
   public static Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
       int d = getNumberFromScanner("Введите число в пределах от 5 до 10", 5, 10);
       System.out.println("d = " + d);
   }

   public static int getNumberFromScanner(String message, int min, int max) {
       int x;
       do {
           System.out.println(message);
           x = sc.nextInt();
       } while (x < min || x > max);
       return x;
   }
}