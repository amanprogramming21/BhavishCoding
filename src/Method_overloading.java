public class Method_overloading {
    static void foo(){
        System.out.println("Nice to meet you!");
    }
    static void foo(int a , int b){
        System.out.println("Nice to meet you! " + a + b);
    }
    public static void main(String[] args) {
        foo();
        foo(173098,123);
    }
}
