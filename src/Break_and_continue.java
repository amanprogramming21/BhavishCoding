public class Break_and_continue {
    public static void main(String[] args) {
        int i=0;
        int j=10;
        for(i = 0;i<=j;i++) {
            System.out.println(i);
            if(i==5) {
                break;
            }
        }
        System.out.println("For loop ended do-while started");
        do{
            j--;
            if(j==2){
                break;
            }
            System.out.println(j);
        }while(j>=i);
    }
}
