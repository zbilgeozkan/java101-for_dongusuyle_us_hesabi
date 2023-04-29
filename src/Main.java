import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int base, exponent, result = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen üssü alınacak sayıyı giriniz: ");
        base = input.nextInt();
        System.out.print("Lütfen üs olacak sayıyı giriniz: ");
        exponent = input.nextInt();

       for (int i = 1; i <= exponent; i++) {
           result = result * base;
       }

        System.out.println("Sonuç: " + result);
    }
}