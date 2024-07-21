import java.util.Scanner;

public class Exersice_four {
    public static void main(String[] args) {
        /* Question-1 Ans: ERROR */

        /* Question-2 */
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String Student_name = name.nextLine();

        System.out.println("Enter your marks out of 100");
        Scanner marks = new Scanner(System.in);

        System.out.print("Mathematics: ");
        float maths = marks.nextFloat();
        System.out.print("English: ");
        float eng = marks.nextFloat();
        System.out.print("Chemistry: ");
        float chem = marks.nextFloat();
        System.out.print("Physics: ");
        float phy = marks.nextFloat();
        System.out.print("Computers: ");
        float comp = marks.nextFloat();

        float num_sum = maths+eng+chem+phy+comp;
        float percentage = (num_sum/500) * 100;

        System.out.println(Student_name + " your percentage is " + percentage);

        if (percentage > 40.0){
            System.out.println(Student_name + " you haved passed the exam");
        }

        else {
            System.out.println(Student_name + " you are failed the exam");
        }
    }
}
