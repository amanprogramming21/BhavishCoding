import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner name = new Scanner(System.in);
        Scanner marks_and_percentage = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String n_name = name.nextLine();
        System.out.println("Enter your Marks:");
        System.out.println("Mathematics:");
        float maths = marks_and_percentage.nextFloat();
        System.out.println("English:");
        float eng = marks_and_percentage.nextFloat();
        System.out.println("Java programing:");
        float JP = marks_and_percentage.nextFloat();
        System.out.println("Physics:");
        float phy = marks_and_percentage.nextFloat();
        System.out.println("Chemistry:");
        float chem = marks_and_percentage.nextFloat();
        float num_sum = maths + eng + JP + phy + chem;
        float percentage = (num_sum / 500) * 100;

        System.out.println("Your percentage: " + percentage);

        if (percentage > 90 && percentage < 100) {
            System.out.println(n_name + " according to your percentage your grades are A");
            System.out.println("Excellent!!");
        }
        if (percentage < 90 && percentage > 80){
            System.out.println(n_name + " according to your percentage your grades are B");
            System.out.println("Good,but need improvement!");
        }
        if (percentage < 80 && percentage > 70){
            System.out.println(n_name + " according to your percentage your grades are C");
            System.out.println("Good, but a lot of hard work need to be done!");
        }
        if (percentage < 70 && percentage > 60){
            System.out.println(n_name + " according to your percentage your grades are D");
            System.out.println("You're passed but need to study a lot!");
        }
        if (percentage < 60 && percentage > 50) {
            System.out.println(n_name + " according to your percentage your grades are E");
            System.out.println("You're are barely passed pay attention on studies!");
        }
        if  (percentage < 50 && percentage > 0) {
            System.out.println(n_name + " according to your percentage your grades are F");
            System.out.println("You're are failed Study again for Re-tests . Pay attention on Studies");
        }
        if (percentage > 100) {
            System.out.println(n_name + " you entered wrong values please re-run the program and enter valid value due to your percentage is "+percentage);
        }
    }
}
