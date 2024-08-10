import java.util.Scanner;

public class Exercise_seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number out of 9 to run question: ");
        int scc = sc.nextInt();

        switch (scc) {
            case 1:
                System.out.println("\n\t\tAnswer-1");
                Scanner an = new Scanner(System.in);
                System.out.print("\nEnter any number to generate it's table: ");
                int ann = an.nextInt();

                for (int i = 0; i < 11; i++) {
                    System.out.println(ann + " * " + i + " = " + ann * i);
                }
                break;

            case 2:
                System.out.println("\n\t\tAnswer-2");
                Scanner pak = new Scanner(System.in);
                System.out.print("\nEnter number of row: ");
                int prow = pak.nextInt();

                for (int i = 1; i <= prow; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                System.out.println("\n\t\tAnswer-3");
                Scanner recuser = new Scanner(System.in);
                System.out.print("\nEnter a number : ");
                int RU = recuser.nextInt();

                System.out.println("Sum of first " + RU + " natural number is: " + calcsum(RU));
                break;

            case 4:
                System.out.println("\n\t\tAnswer-4");
                Scanner par = new Scanner(System.in);
                System.out.print("\nEnter number of row: ");
                int prow1 = par.nextInt();

                for (int i = prow1; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;

            case 5:
                System.out.println("\n\t\tAnswer-5");
                Scanner userend0 = new Scanner(System.in);
                System.out.print("Calculate fibonacci series upto how many terms? : ");
                int UE0 = userend0.nextInt();
                int a = 0, b = 1;

                for (int i = 1; i < UE0; i++) {
                    System.out.print(a + ", ");

                    int c = a + b;
                    a = b;
                    b = c;
                }
                break;

            case 6:
                if (args.length == 0) {
                    System.out.println("User is required to enter number as argument: ");
                    return;
                }

                double sum = 0.0;
                for (String arg : args) {
                    try {
                        sum += Double.parseDouble(arg);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid numbers: " + arg);
                        return;
                    }
                }

                double average = sum / args.length;
                System.out.println("The average is: " + average);
                break;

            case 7:
                System.out.println("\n\t\tAnswer-7");
                Scanner forrep = new Scanner(System.in);
                System.out.print("Enter number to repeat: ");
                int FR = forrep.nextInt();
                System.out.print("How many times? : ");
                int R = forrep.nextInt();
                repeat(FR, R);
                break;

            case 8:
                System.out.println("\n\t\tAnswer-8");
                Scanner userend1 = new Scanner(System.in);
                System.out.print("Enter temperature [NOTE: it will be stored as celsius to convert into fahrenheit]: ");
                double UE1 = userend1.nextDouble();

                double fdeg = (UE1 * 1.8)+32;

                System.out.println("User: " + UE1 + "\nconverted to Fahrenheit: " + fdeg);
                break;

            case 9:
                System.out.println("\n\t\tAnswer-9");
                Scanner j2 = new Scanner(System.in);
                System.out.print("Enter number : ");
                int j3 = j2.nextInt();

                for (int i = 0; i < j3; i++) {
                    System.out.print(j3 + " ");
                }
                break;
            default:
                System.out.println("\n\tInvalid Value entered");
                break;
        }
    }

    private static void repeat(int i, int i1) {
        if(i1 == 0){
            return;
        }

        System.out.println(i);
        repeat(i , i1 - 1 );
    }

    public static int calcsum(int n){
        return (n<=1) ? n:n+calcsum(n-1);
    }
}