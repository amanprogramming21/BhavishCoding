import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        System.out.print("choose which to run:\n\t1 for while\n\t2 for do-while\n\t3 for for\n\t\ttype: ");
        int choose = choice.nextInt();
        System.out.println("Make sure program file is opened to see the code");
        switch (choose) {
            case 1:
                Scanner initialpoint1 = new Scanner(System.in);
                System.out.println("User is required to entered a initial number:");
                int IP1 = initialpoint1.nextInt();
                Scanner endpoint1 = new Scanner(System.in);
                System.out.println("User is required to entered a final number: ");
                int FP1 = endpoint1.nextInt();
                while (IP1 <= FP1) {
                    System.out.println(IP1);
                    IP1 = IP1 + 1;
                }
                break;
            case 2:
                Scanner initialpoint2 = new Scanner(System.in);
                System.out.println("User is required to entered a initial number:");
                int IP2 = initialpoint2.nextInt();
                Scanner endpoint2 = new Scanner(System.in);
                System.out.println("User is required to entered a final number: ");
                int FP2 = endpoint2.nextInt();
                do {
                    System.out.println(IP2);
                    IP2 = IP2 + 1;
                } while (IP2 <= FP2);
                break;
            case 3:
                Scanner initialpoint3 = new Scanner(System.in);
                System.out.println("User is required to entered a initial number:");
                int IP3 = initialpoint3.nextInt();
                Scanner endpoint3 = new Scanner(System.in);
                System.out.println("User is required to entered a final number: ");
                int FP3 = endpoint3.nextInt();
                for(IP3=IP3;IP3<=FP3;IP3++){
                    System.out.println(IP3);
                }
                break;
        }
    }
}