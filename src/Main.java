import java.util.Scanner;
//Java program to convert Kilometers to miles.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Kilometers ");
        double kilo = sc.nextDouble();
        double miles = kilo * 0.621371;
        System.out.println(kilo + " kilometers in Miles is " + miles + " miles");
    }
}