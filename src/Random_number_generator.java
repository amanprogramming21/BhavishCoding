import java.util.Random;
import java.util.random.RandomGenerator;

public class Random_number_generator {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();

        System.out.println(x);
    }
}
