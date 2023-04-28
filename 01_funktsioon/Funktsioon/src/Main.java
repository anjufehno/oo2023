import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String hinnang = temperatuuriHinnang(-2.5);
        String hinnang2 = temperatuuriHinnang(5.7);

        double summa = arvutaTaksoMaksumus(3);
        System.out.println(summa);
        double summa2 = arvutaTaksoMaksumus(4.5);
        System.out.println(summa2);
    }

        private static double arvutaTaksoMaksumus(double tunnid) {
            return 3+0.8*tunnid;
        }

        private static String temperatuuriHinnang(double temp) {
        if (temp < 0) {
            return "On jaas";
        } else {
            return "On veesi";
        }
    }
    }
