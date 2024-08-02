import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number will you operate: ");
        int num_time = scanner.nextInt();

        System.out.println("Enter " + num_time + " digits: ");

        int[] uarray = new int[num_time];

        for (int i = 0; i < num_time; i++) {
            uarray[i] = scanner.nextInt();
        }

        System.out.println("Values user entered");

        for (int i = 0; i < num_time; i++) {
            System.out.print(uarray[i] + ", ");
        }

        int sum = 0;
        int product = 0;
        int difference;

        Scanner operator = new Scanner(System.in);
        System.out.println("\n\nWhat would you like to do? [+ , - , * , / ]: ");
        String op = operator.next();

        if (op.equals("+")) {
            for (int v : uarray) {
                sum = v + sum;
            }
            System.out.println("Sum : " + sum);
        }

        if (op.equals("-")) {
            boolean sorted = true;
            for (int lo = 0; lo < uarray.length - 1; lo++) {
                if (uarray[lo] > uarray[lo + 1]) {
                    sorted = false;
                    break;
                }
            }
            if (sorted) {
                System.out.println("Array is sorted");
                difference = uarray[1] - uarray[0];
                for (int i = 2; i < uarray.length; i++) {
                    difference = Math.min(difference, uarray[i] - uarray[i - 1]);
                }
                System.out.println("Difference between the values of array: " + difference);
            } else {
                System.out.println("Array is not sorted");
                System.out.println("Apologies but the values of array cannot be cancelled with each other");
            }
        }

        if (op.equals("*")) {
            for (int j : uarray) {
                product *= j;
            }

            System.out.println("\n\nProduct of all value stored in Array: " + product);
        }

        if (op.equals("/")) {
            System.out.print("\n\nYou can't divide all the values of array with each other but can divide them other value you want: ");
            int userinput = scanner.nextInt();
            System.out.println("\n\nUpdated array: ");
            for (int i = 0; i < num_time; i++) {
                System.out.print(uarray[i]/userinput + ", ");
            }
        }
    }
}
