import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Random_number_generator {
    public static void main(String[] args) {
        Scanner UC = new Scanner(System.in);
        System.out.print("Enter how many number you want to generate: ");
        int UC1 = UC.nextInt();
        while(UC1 >= 0) {
            Random random = new Random();
            int x = random.nextInt();

            System.out.println(x);
            --UC1;
        }
    }
}
