import java.util.ArrayList;
import java.util.List;

public class Keskmine {

    List<Double> kiirus = new ArrayList<>();
    List<Double> keskmineKiirus = new ArrayList<>();


    public Keskmine(double arv) {
        kiirus.add(arv);
    }

    public void loik() { // 2 kilometrit loik
        double loig = 2.0;
        for (int i = keskmineKiirus.size(); i < kiirus.size() - 2; i++) {
            double aeg = loig / kiirus.get(i);
            double keskmine = aeg / loig;
            keskmineKiirus.add(aeg);
        }
    }
}