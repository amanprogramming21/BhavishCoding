import java.util.Scanner;

public class Exersice_four {
    public static void main(String[] args) {
        Scanner Quest_choose = new Scanner(System.in);
        System.out.print("Out of 6 which Question which you want to\n\ttype according to question number [eg:1 for question-1]\n\ttype > ");
        int QTC = Quest_choose.nextInt();
        switch (QTC) {
            case 1:
                /* Question-1 Ans: ERROR */
                System.out.println("Answer: ERROR due to condition is a = 11 instead of a == 11");
                break;

            case 2:
                /* Question-2 */
                System.out.println("\t\t\tAnswer 2");
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
                float num_sum = maths + eng + chem + phy + comp;
                float percentage = (num_sum / 500) * 100;

                System.out.println(Student_name + " your percentage is " + percentage);

                if (percentage > 40.0) {
                System.out.println(Student_name + " you haved passed the exam");
                } else {
                    System.out.println(Student_name + " you are failed the exam");
                }
                break;

            case 3:
                /* Question-3 */
                System.out.println("\t\t\tAnswer-3");
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your income in Lakhs per annum");
                float tax = 0;
                float income = sc.nextFloat();
                if(income<=2.5){
                    tax = tax + 0;
                }
                else if(income>2.5f && income <= 5f){
                    tax = tax + 0.05f * (income - 2.5f);
                }
                else if(income>5f && income <= 10.0f){
                    tax = tax + 0.05f * (5.0f - 2.5f);
                    tax = tax + 0.2f * (income - 5f);
                }
                else if(income>10.0f){
                    tax = tax + 0.05f * (5.0f - 2.5f);
                    tax = tax + 0.2f * (10.0f - 5f);
                    tax = tax + 0.3f * (income - 10.0f);
                }

                System.out.println("The total tax paid by the employee is: " + tax);
                break;

            case 4:
                /* Question-4 */
                System.out.println("\t\t\tAnswer 4 ");
                Scanner C_day = new Scanner(System.in);
                System.out.println("Enter number to select the day:\n\t1 for Monday\n\t2 for Tuesday\n\t3 for Wednesday \n\t4 for Thursday\n\t5 for Friday\n\t6 for Saturday\n\t7 for Sunday");
                int day = C_day.nextInt();
                switch (day) {
                    case 1:
                        System.out.println("You selected Monday");
                        break;
                        case 2:
                            System.out.println("You selected Tuesday");
                            break;
                            case 3:
                                System.out.println("You selected Wednesday");
                                break;
                                case 4:
                                    System.out.println("You selected Thursday");
                                    break;
                                    case 5:
                                        System.out.println("You selected Friday");
                                        break;
                                        case 6:
                                            System.out.println("You selected Saturday");
                                            break;
                                            case 7:
                                                System.out.println("You selected Sunday");
                                                break;
                    default:
                        System.out.println("Invalid value detected");
                        break;
                }
            case 5:
                /* Question-5 */
                System.out.println("\t\t\tAnswer 5");
                Scanner yearen = new Scanner(System.in);
                System.out.print("Enter year: ");
                int year = yearen.nextInt();
                if (year % 4 == 0){
                    System.out.println("It's a leap year");
                }
                else{
                    System.out.println("Not a leap year");
                }
                break;
            case 6:
                /* Question-6 */
                System.out.println("\t\t\tAnswer 6");
                Scanner weben = new Scanner(System.in);
                System.out.println("Enter website address:");
                String webadd = weben.nextLine();
                if(webadd.endsWith(".com")){
                    System.out.println("it's an .com site");
                    System.out.println("it's an commercial site");
            }
                if(webadd.endsWith(".org")){
                    System.out.println("it's an .org site");
                    System.out.println("it's an organization site");
                }
                if(webadd.endsWith((".in"))){
                    System.out.println("it's an .in site");
                    System.out.println("it's an indian site");
                }
                default:
                    System.out.println("End of program || you may have entered invalid value");
        }
    }
}
