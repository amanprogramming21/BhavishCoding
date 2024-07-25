import java.util.Scanner;

public class Exercise_five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("eg: Enter 1 for question 1 [their are total 9]: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                /* Question - 1 */
                System.out.println("\t\tAnswer-1");
                int n = 4;
                for (int i = n; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;

            case 2:
                /* Question - 2 */
                System.out.println("\n\t\tAnswer-2");
                int sum = 0;
                int n1 = 3;
                for (int i = 0; i < n1; i++) {
                    sum = sum + (2 * n1);
                }
                System.out.println("sum:" + sum);
                break;

            case 3:
                /* Question - 3 */
                System.out.println("\n\t\tAnswer-3");
                Scanner User1 = new Scanner(System.in);
                System.out.print("Enter number to generate table: ");
                int n2 = User1.nextInt();
                for (int i2 = 1; i2 < 11; i2++) {
                    System.out.print("\n" + n2 + " * " + i2 + " = " + n2 * i2);
                }
                break;

            case 4:
                /* Question - 4 */
                System.out.println("\n\t\tAnswer-4");
                Scanner User2 = new Scanner(System.in);
                System.out.print("Enter the number to generate table: ");
                int n3 = User2.nextInt();
                for (int i3 = 10; i3 > 0; i3--) {
                    System.out.print("\n" + n3 + " * " + i3 + " = " + n3 * i3);
                }
                break;

            case 5:
                /* Question - 5 */
                System.out.println("\n\t\tAnswer-5");
                Scanner nfour = new Scanner(System.in);
                System.out.print("Enter a non-negative integer: ");
                int n4 = nfour.nextInt();
                int factorial = 1;
                for (int i4 = 1; i4 <= n4; i4++) {
                    factorial *= i4;
                }
                System.out.println("Factorial of " + n4 + " is " + factorial);
                break;

            case 6:
                System.out.println("\n\t\tAnswer-6");
                int n5 = 5;
                int i5 = 0;
                while (n5 >= i5) {
                    n5--;
                    System.out.println("5");
                }
                break;

            case 7:
                System.out.println("\n\t\tAnswer-7");
                int n6 = 5;
                int i6 = 0;
                while (n6 >= i6) {
                    n6--;
                    System.out.println("1");
                }
                break;

            case 8:
                System.out.println("\n\t\tAnswer-8");
                System.out.println("True every kind/type of loop can perform same type of condition if we want it's like changing the phrase but the our results will be same");
                break;

            case 9:
                int sum2 = 0;
                System.out.println("\n\t\tAnswer-9");
                Scanner User3 = new Scanner(System.in);
                System.out.print("Enter number to generate table: ");
                int n7 = User3.nextInt();
                for (int i7 = 1; i7 < 11; i7++) {
                    System.out.print("\n" + n7 + " * " + i7 + " = " + n7 * i7);
                    sum2 += n7 * i7;
                }
                System.out.println("\n\nSum of all product for the table of " + n7 + " is: " + sum2);
                break;
        }
    }
}