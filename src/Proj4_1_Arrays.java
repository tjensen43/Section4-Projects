import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] intArray = new int[5];
        System.out.println("Enter 5 integers");
        for(int i = 0; i < intArray.length; i++) {
            System.out.println("Next integer:");
            intArray[i] = keyboard.nextInt();

        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i] * 2);
        }
    }

}
