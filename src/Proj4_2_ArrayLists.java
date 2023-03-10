import java.util.ArrayList;
import java.util.Scanner;
public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        double userNum = 0;
        System.out.println("Enter integers, enter a negative integer to stop loop");
        while(userNum >= 0) {
            System.out.println("Next integer:\t");
            doubleArrayList.add(userNum);
            userNum = keyboard.nextInt();
        }
        System.out.println(doubleArrayList.size());
        for(int i = doubleArrayList.size() - 1; i >= 0; i--) {
            System.out.println(i);
        }

        }
    }
