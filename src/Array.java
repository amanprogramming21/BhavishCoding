import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] marks = new int[5];
        System.out.println("Enter number to store in array");

        marks[0] = 50;
        marks[1] = 40;
        marks[2] = 30;
        marks[3] = 20;
        marks[4] = 10;

        for (int element : marks) {
            System.out.println(element);
        }

        System.out.println("\n\t\tUser Input");

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number will you enter: ");
        int n = scanner.nextInt();

        System.out.println("Great! enter " + n + "float :");

        float[] a = new float[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextFloat();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
