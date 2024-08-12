//Exercise-8 Question-1
import java.util.Scanner;

public class employee {
    static void property() {
        System.out.println("Properly Property!");
    }

    static void getsalary() {
        System.out.println("150000 per month");
    }

    static void string() {
        System.out.println("It's an String");
    }

    static void getname() {
        string();
    }

    static void setname() {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter name : ");
        String b = a.nextLine();
        System.out.println(b);
    }

    public static void main(String[] args) {
        property();
        getname();
        setname();
        getsalary();
        string();
    }
}