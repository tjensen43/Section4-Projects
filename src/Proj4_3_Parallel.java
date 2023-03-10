import java.util.ArrayList;
import java.util.Scanner;
public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> namesList = new ArrayList<>();
        int[] ageArray = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name");
            namesList.add(keyboard.nextLine());
            System.out.println("Enter age");
            ageArray[i] = keyboard.nextInt();
            keyboard.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(namesList.get(i) + " | " + ageArray[i]);
        }


    }
}
