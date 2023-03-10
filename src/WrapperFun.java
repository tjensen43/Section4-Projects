import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {
        ArrayList<String> piAL = new ArrayList<>();
        piAL.add("3.14159");
        double piDub = Double.parseDouble(piAL.get(0));
        System.out.println(piDub);


    }
}
