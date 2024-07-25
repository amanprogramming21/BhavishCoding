public class Array {
    public static void main(String[] args) {
        int [] marks = new int[5];
        System.out.println("Enter number to store in array");

        marks[0] = 50;
        marks[1] = 40;
        marks[2] = 30;
        marks[3] = 20;
        marks[4] = 10;

        for (int element : marks) {
            System.out.println(element);
        }
}
}
