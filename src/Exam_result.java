//it stores the marks of multiple students and print them
import java.util.Scanner;

public class Exam_result {
    public static void main(String[] args) {
        Scanner SN = new Scanner(System.in);
        System.out.print("How many student: ");
        int sn = SN.nextInt();

        Scanner sc = new Scanner(System.in);
        String[] SNames = new String[sn];

        for (int i = 0; i < SNames.length; i++) {
            System.out.print("Enter Student name: ");
            SNames[i] = sc.nextLine();

            Scanner subM = new Scanner(System.in);

            System.out.println("Enter the marks of five subjects:");
            System.out.print("English: ");
            float sub1 = subM.nextFloat();
            System.out.print("Mathematics: ");
            float sub2 = subM.nextFloat();
            System.out.print("Physics: ");
            float sub3 = subM.nextFloat();
            System.out.print("Chemistry: ");
            float sub4 = subM.nextFloat();
            System.out.print("Computers: ");
            float sub5 = subM.nextFloat();

            float total = sub1 + sub2 + sub3 + sub4 + sub5;
            float average = total / 5.0f;
            float percentage = (total / 500.0f) * 100.0f;

//========================Final Output==========================

            for (String sName : SNames) {
                System.out.println("Student name: " + sName + " your exam result details are: ");

                char grade;
                if (average >= 90) {
                    grade = 'A';
                } else if (average >= 80 && average < 90) {
                    grade = 'B';
                } else if (average >= 70 && average < 80) {
                    grade = 'C';
                } else if (average >= 60 && average < 70) {
                    grade = 'D';
                } else {
                    grade = 'E';
                }

                System.out.println("\nThe Total marks   = " + total + "/500.0");
                System.out.println("The Average marks = " + average);
                System.out.println("The Percentage    = " + percentage + "%");
                System.out.println("The Grade         = '" + grade + "'");
            }
        }
    }
}
