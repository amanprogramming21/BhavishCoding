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

        for (int i = 0; i < num_time; i++) {
            System.out.print(a[i] + " ");
        }

        float sum = 0;
//        float product = 0;
//        float difference = 0;
//        float module = 0;

        Scanner operator = new Scanner(System.in);
        System.out.print("What would you like to do? [+ , - , * , / ]: ");
        String op = operator.next();

        if(op.equals("+")){
            for (float v : a) {
                sum = v + sum;
            }
            System.out.println("Sum : "+sum);
        }

   /*     if(op.equals("-")){
            for (float v : a) {
                difference = v - difference;
            }
            System.out.println("Difference : "+difference);
        }
        if(op.equals("*")){
            for (float v : a) {
                product = v * product;
            }
            System.out.println("Product: "+product);
        }
        if(op.equals("%")){
            for (float v : a) {
                module = v % module;
            }
            System.out.println("Module: "+module);
        }
*/
    }
}