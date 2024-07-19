import java.util.Scanner;

public class Exercise_two {
    public static void main(String[] args) {
        /* Question-1 */
        float a = 7/4f *9/2f;
        System.out.println("Ans1 " + a);

        /* Question-2 */
        char grades = 'A';
        grades = (char)(grades + 8);
        System.out.println("Ans2 " + grades);

        //Decrypting
        grades = (char) (grades - 8);
        System.out.println("\t " + grades);

        /* Question-3 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ans3 Enter number");
        int b = sc.nextInt();
        System.out.println(b>8);

        /* Question-4 */
        float c = 2, s = 2, v = 8, u = 2;
        float exp = (v*v - u*u) / (2*c*s);
        System.out.println("Ans-4 " + exp);

        /* Question-5 */
        int d = 7 * 49/7 + 35/7;
        System.out.println("Ans-5 " + d);
    }
}
