import java.util.List;

public class EhteKauplus {

    List<String> ehted; // Список товаров (бижутерий)
    int hind;
    public EhteKauplus (List<String> ehted) { // Метод с помощью которго, мы будем сами вписывать название
        // бижутерии
        this.ehted = ehted;
    }

    public String pokupka() {
        return "Aitah ostu eest!";
    }
    public String checkCena() {
        return "Hind on: " + ((int) (Math.random() * 50) + 10)+ " €";
    }
}