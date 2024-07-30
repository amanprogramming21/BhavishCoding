import java.util.Scanner;

public class Exersice_six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("eg: Enter 1 for question 1 [their are total 9]: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("\n\t\tAnswer-1");
                float[] FLE = {45.7f, 63.2f, 22.2f, 232f, 234.2f};
                float sum = 0;
                for (float v : FLE) {
                    System.out.println("Value stored in array: " + v);
                }
                for (float element : FLE) {
                    sum = sum + element;
                }
                System.out.println("\n Sum of all value of array is: " + sum);
                break;
            case 2:
                System.out.println("\n\t\tAnswer-2");
                float[] ca = {23.4f, 324.3f, 675.6f, 743.5f, 2434.3f};
                float num = 2434.3f;
                boolean s = false;
                for (float sa : ca) {
                    if (num == sa) {
                        s = true;
                        break;
                    }
                }
                if (s) {
                    System.out.println(num + " is in array");
                } else {
                    System.out.println("not in array");
                }
                break;

            case 3:
                float[] FL = {45.7f, 63.2f, 22.2f, 232f, 234.2f};
                float sum2 = 0;
                for (float v : FL) {
                    System.out.println("Value stored in array: " + v);
                }
                for (float element : FL) {
                    sum2 = sum2 + element;
                }
                System.out.println("\n Average of value in array is: " + sum2 / FL.length);
                break;

            case 4:
                int[][] mat1 = {{1, 2, 3}, {4, 5, 6}};
                int[][] mat2 = {{7, 8, 9}, {10, 11, 12}};
                int[][] result = {{0, 0, 0}, {0, 0, 0}};

                for (int i2 = 0; i2 < mat1.length; i2++) {
                    for (int j2 = 0; j2 < mat1[i2].length; j2++) {
                        System.out.format("Setting value for i=%d and j=%d\n", i2, j2);
                        result[i2][j2] = mat1[i2][j2] + mat2[i2][j2];
                    }
                }

                for (int i2 = 0; i2 < mat1.length; i2++) {
                    for (int j2 = 0; j2 < mat1[i2].length; j2++) {
                        System.out.print(result[i2][j2] + " ");
                        result[i2][j2] = mat1[i2][j2] + mat2[i2][j2];
                    }
                    System.out.println(" ");
                }
                break;

            case 5:
                int[] er = {12, 22, 24, 41, 459, 40};
                int n = Math.floorDiv(er.length, 2);
                int temp;
                for (int l = 0; l < n; l++) {
                    temp = er[l];
                    er[l] = er[er.length - l - 1];
                    er[er.length - l - 1] = temp;
                }

                for (int p : er) {
                    System.out.print(p + ", ");
                }
                break;

            case 6:
            int [] mx = {1,21,3,4,5,6};
            int max = Integer.MIN_VALUE;
            for (int e : mx){
                if(e>max){
                    max = e;
                }
            }
            System.out.println("The maximum value inside the array is: "+max);
            break;

            case 7:
                int [] mn = {1,21,3,4,5,62};
                int min = Integer.MAX_VALUE;
                for (int el: mn){
                    if(el<min){
                        min = el;
                    }
                }
                System.out.println("The minimum value inside the array is: "+ min);
                break;

            case 8 :
                boolean sorted = true;
                int [] ms = {1,4,23,52,2};
                for (int lo=0;lo<ms.length-1;lo++){
                    if(ms[lo] > ms[lo+1]){
                        sorted = false;
                        break;
                    }
                }
                if(sorted){
                    System.out.println("Array is sorted");
                }
                else {
                    System.out.println("Array is not sorted");
                }
                break;
            default:
                System.out.println("\n\t\t\tInvalid value please restart the program");
                break;
        }
    }
}