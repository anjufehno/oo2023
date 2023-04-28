import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int a = k.nextInt();
        int b = k.nextInt();
        System.out.println(a * b);

        main1();
        main2();
    }

    public static void main1() {
        Scanner slovo = new Scanner(System.in);
        String slovo1 = slovo.nextLine();
        System.out.println(slovo1 + " privet");
    }

    public static void main2() {
        Scanner d = new Scanner(System.in);
        int a = d.nextInt();
        int b = d.nextInt();
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
