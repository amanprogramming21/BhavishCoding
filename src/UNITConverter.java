import java.util.Scanner;

public class UNITConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Kilometers: ");
        double kilometer = sc.nextDouble();

        double meter = kilometer * 1000.0;
        double centimeter = kilometer * 100000.0;
        double millimeter = kilometer * 1000000.0;

        System.out.println("Distance in Kilometers  = " + kilometer);
        System.out.println("Distance in Meters      = " + meter);
        System.out.println("Distance in Centimeters = " + centimeter);
        System.out.println("Distance in Millimeters = " + millimeter);
    }
}