import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number will you operate: ");
        int num_time = scanner.nextInt();

        System.out.println("Enter " + num_time + " float digits: ");

        float[] a= new float[num_time];

        for (int i = 0; i < num_time; i++) {
            a[i] = scanner.nextFloat();
        }

        System.out.println();

        for (int i = 0; i < num_time; i++) {
            System.out.print(a[i] + " ");
        }

//        float sum = 0;
//
//        Scanner operator = new Scanner(System.in);
//        System.out.println("\nWhat would you like to do? [+ , - , * , / ]: ");
//        String op = operator.next();
//
//        if(op.equals("+")){
//            for (float v : a) {
//                sum = v + sum;
//            }
//            System.out.println("Sum : "+sum);
//        }

//        float product;

        for (float d : a) {
            System.out.println("\n\nd = " + d);
            float new_a = d * a[0];
            System.out.println("\nNew-a: "+new_a);
        }
    }
}