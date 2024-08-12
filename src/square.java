//Exercise-8 Question-3

import java.util.Scanner;

public class square {
    static void Area(){
        Scanner length = new Scanner(System.in);
        System.out.print("Enter length of Square: ");
        int lenth = length.nextInt();

        int area = lenth * lenth ;

        System.out.println(area);
    }

    static void Perimeter() {
        Scanner length = new Scanner(System.in);
        System.out.print("Enter length of Square: ");
        int lenth = length.nextInt();

        int perimeter = lenth + lenth + lenth + lenth;

        System.out.println(perimeter);
    }
    
    public static void main(String[] args) {
        Scanner Userchoice = new Scanner(System.in);
        System.out.print("1 for area & 2 for perimeter: ");
        int UC = Userchoice.nextInt();

        switch (UC) {
            case 1:
                Area();
                break;
            case 2:
                Perimeter();
                break;
            default:
                System.out.println("Invalid value");
        }
    }
}
