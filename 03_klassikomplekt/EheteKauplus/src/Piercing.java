
public class Piercing {
    String klientid; // Объект класса Стринг, который записывает имя клиентов
    boolean lubatudvanus; // Объект, который выдает разрешние на татту
    int vanus; // Объект, который записывает возраст клиента
    public Piercing(String klientid, int vanus) { // Ключевое слово this - это установление значения, new - создание нового объекта
        this.klientid = klientid;
        this.vanus = vanus;
        this.lubatudvanus = false;
    }
    public void vanemKuiKaheksateist(){ // метод проверки возраста
        if ((vanus >= 18) && (vanus <= 110))  {
            System.out.println();
            System.out.println("Kõik on korras!");
            this.lubatudvanus = true;
        } else {
            System.out.println("Sa oled liiga noor!");
            this.lubatudvanus = false;
        }
    }
    public String kasOnKaheksateist() { // метод который проверяет разрешение на татту
        if (lubatudvanus) {
            return klientid + ", sa void piercing teha!";
        } else {
            return klientid + ", sa ei saa piercing teha!";
        }
    }
}
