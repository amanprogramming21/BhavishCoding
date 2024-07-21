import com.sun.security.jgss.GSSUtil;

//import java.util.Scanner;
public class S_Strings {
    public static void main(String[] args) {
//        int a  = 6;
//        float b= 5.6454f;
        String name = "Phone";
        System.out.print("The object is : ");
        System.out.println(name);
//        System.out.printf("The value of a is %d and b is %f",a,b);
//        System.out.format("The value of a is %d and b is %f",a,b);
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        System.out.println(str);
//        Scanner sc2 = new Scanner(System.in);
//        String str2 = sc2.nextLine();
//        System.out.println(str2);
        int len = name.length();
        System.out.println(len);
        String lower = name.toLowerCase();
        System.out.println(lower);
        String upper = name.toUpperCase();
        System.out.println(upper);

        String NTS = "      Device      ";
        System.out.println(NTS.trim());

        System.out.println(name.substring(2,4));

        System.out.println(name.replace('e','k'));

        System.out.println(name.replace("one","two"));

        System.out.println(name.startsWith("Ph"));

        System.out.println(name.endsWith("s"));

        System.out.println(name.charAt(4));

        System.out.println(name.indexOf('o'));

        System.out.println(NTS.lastIndexOf('c'));

        System.out.println(NTS.equals("Devices"));

        System.out.println(name.equalsIgnoreCase("PhOnE"));

        System.out.println("This is an escape sequence \"\" double quote");
    }
}
