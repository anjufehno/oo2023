import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("lugemine.txt"));
        String rida = br.readLine();
        while (rida != null){
            System.out.println(rida);
            String[] tykeldus = rida.split("u");
            System.out.println(Arrays.toString(tykeldus));
            rida = br.readLine();
        }
    }
}