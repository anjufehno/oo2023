import java.util.ArrayList;
import java.util.List;

public class Maanteloig{
    //static List<Double> kiirus2 = new ArrayList<>();
    //static List<Double> keskmineKiirus = new ArrayList<>();

    public static void main(String[] args) {
        double kiirus=20.0;
        double kiirus1=30.0;
        double[] keskmineKiirus = { 20.0, 30.0, 40.0, 50.0};
        double keskmine=kiirus3(kiirus,kiirus1);
        double keskmine1=keskmine3(keskmineKiirus);
        //double summa=0;
        double kiirusedSumma = 0;
        int loik = 0;
        double keskminek=kiirusedSumma/loik;


    }
    public static double kiirus3(double kiirus, double kiirus1) {
        double summa = kiirus + kiirus1;
        double keskmine = summa / 2;
        System.out.println(keskmine + " km/h");
        return summa;
    }
    public static double keskmine3(double[] keskmineKiirus) {
        double kokku = keskmineKiirus.length;
        double summa = 0;
        for (int i = 0; i < keskmineKiirus.length; i++) {
            summa += keskmineKiirus[i];
        }
        double keskmine1 = summa / kokku;
        System.out.println(keskmine1 + " km/h");
        return kokku;
    }
}


