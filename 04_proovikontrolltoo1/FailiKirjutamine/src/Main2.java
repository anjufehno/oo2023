import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main2 {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter(new FileWriter("valjund1.txt"));
        pw.println("tereteretere");
        pw.print("Juku");
        pw.print("Kuku");
        pw.println("Mari");
        pw.print("Uus rida");
        pw.close();
    }
}