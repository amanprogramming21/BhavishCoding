public class Method_two {
    static void String(){
        System.out.println("\n\nHey this is an an String though I don't how to print multiple of me");
    }
    static void changes_n_array(int [] arr){
        arr[0] =18;
    }
    public static void main(String[] args) {
        String();
        int [] array = {2,4,6,8,10,2,14,16};
        changes_n_array(array);
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
