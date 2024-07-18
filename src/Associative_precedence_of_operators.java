public class Associative_precedence_of_operators {
    public static void main(String[] args) {
        //Associative
        int a = 60/5 - 30*2;
        /*
         = 12 - 60
         = -48
         */
        //Precedence
        int b = 60*5 - 30/2;
        /*
        =300 - 15
        =285
        */
        System.out.println(a);
        System.out.println(b);
    }
}