import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Double> kiirus = new ArrayList<>();
    static List<Double> keskmineKiirus = new ArrayList<>();
    private static double arv;

    public static void main(String[] args) {
        new Main(40);
        loik();
    }
    Main(double arv) {
            this.arv = arv;
        }

        public static void loik() { // 2 kilometrit loik
            double loig = 2.0;
                double aeg = loig / arv;
                double keskmine = loig/aeg;
                keskmineKiirus.add(aeg);
                System.out.println(keskmine + " km/h");
        }
    }
