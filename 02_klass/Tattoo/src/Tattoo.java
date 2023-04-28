import java.util.Date;

public class Tattoo {
    String klientid; // Объект класса Стринг, который записывает имя клиентов
    boolean vanus; // Объект, который выдает разрешние на татту
    Date data; // Объект класса Date, который записывает день в который клиент пришел
    int vanuss; // Объект, который записывает возраст клиента
    public static void main(String[] args) {
        Tattoo klient1 = new Tattoo("Katrin", 16); // Создаем первого клиента класса Tattoo, даем ему имя и возраст
        klient1.vanemKuiKaheksateist(); // Запускаем метод, которые знает имя и возрат первого клиента (проверяет возраст),
        // как видно перед именем Метода, у нас стоит имя объекта klient1 - где и записано имя и возраст клиента!
        System.out.println(klient1.kasOnKaheksateist());
        Tattoo klient2 = new Tattoo("Misha" , 18); // Создаем второго клиента класса Tattoo, даем ему имя и возраст
        klient2.vanemKuiKaheksateist(); // Тут всё тоже самое
        System.out.println(klient2.kasOnKaheksateist());
    }
    public Tattoo(String klientid, int vanuss) { // Ключевое слово this - это установление значения, new - создание нового объекта
        this.data = new Date();
        this.klientid = klientid;
        this.vanuss = vanuss;
        this.vanus = false;
    }
    public void vanemKuiKaheksateist(){ // метод проверки возраста
        if (vanuss >= 18)  {
            System.out.println("Kõik on korras!");
            this.vanus = true;
        } else {
            System.out.println("Вы слишком малы!");
            this.vanus = false;
        }
    }
    public String kasOnKaheksateist() { // метод который проверяет разрешение на татту
        if (vanus) {
            return klientid + ", sa void tattoo teha!";
        } else {
            return klientid + ", sa ei saa tattoo teha!";
        }
    }
}
