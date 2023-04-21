import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> xCoords = new ArrayList<>(Arrays.asList(1.5, 2.5, 3.5));
        List<Double> yCoords = new ArrayList<>(Arrays.asList(3.5, 4.5, 5.5));
        Kolmnurg kolmnurg = new Kolmnurg(xCoords, yCoords);
        System.out.println(kolmnurg.xCoords);
        System.out.println(kolmnurg.yCoords);
    }
}
