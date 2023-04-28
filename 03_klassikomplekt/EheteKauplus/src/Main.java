import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Piercing klient1 = new Piercing("Kevin", 24);// Создаем первого клиента класса Tattoo, даем ему имя и возраст
        klient1.vanemKuiKaheksateist(); // Запускаем метод, которые знает имя и возрат первого клиента (проверяет возраст),
        // как видно перед именем Метода, у нас стоит имя объекта klient1 - где и записано имя и возраст клиента!
        System.out.println(klient1.kasOnKaheksateist());
            if (klient1.vanus >= 18) { // Если клиенту 18 лет и старше, то предлагаем купить украшение
                System.out.println("Vali palun ehte, meie kaupluses on ringid, sirged ehted ja teised!");
                EhteKauplus ehted1 = new EhteKauplus(Arrays.asList("Valge ring")); // Создаем ссылку на класс
                // и придумываем бижутерию, и записываем её названием с помощью метода Arrays.asList
                System.out.println(ehted1.checkCena());
                System.out.println(ehted1.pokupka());
            }
        Piercing klient2 = new Piercing("Lisa" , 19); // Создаем второго клиента класса Tattoo, даем ему имя и возраст
        klient2.vanemKuiKaheksateist(); // Тут всё тоже самое
        System.out.println(klient2.kasOnKaheksateist());
        if (klient2.vanus >= 18) {
            System.out.println("Vali palun ehte, meie kauplus on ringid, sirged ehted ja teise!");
            EhteKauplus ehted2 = new EhteKauplus(Arrays.asList("Must ring")); // Второе украшение
            System.out.println(ehted2.checkCena());
            System.out.println(ehted2.pokupka());
        }
    }
}