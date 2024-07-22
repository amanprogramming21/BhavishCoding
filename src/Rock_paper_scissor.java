import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissor {
    public static void main(String[] args) {
        Scanner userintake = new Scanner(System.in);
        System.out.print("Enter 1 for rock ,2 for paper ,3 for scissor : ");
        int userchoice =userintake.nextInt();

        Random random = new Random();
        int computerchoice = random.nextInt(4);

        if(userchoice == computerchoice) {
            System.out.println("Draw");
        }
        else if (userchoice == 1 && computerchoice == 3 || userchoice == 2 && computerchoice == 1 || userchoice == 3 && computerchoice== 2) {
            System.out.println("User win!");
        }

        else {
            System.out.println("Computer win!");
        }
        System.out.println("Computer choice: " + computerchoice);
    }
}
