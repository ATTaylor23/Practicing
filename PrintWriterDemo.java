import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("students.txt");
        PrintWriter pw = new PrintWriter(file);

        pw.print("Name\t"); pw.print("ID\t"); pw.println("Online");
        pw.println("Zuhra\t");  pw.print(543 + "\t"); pw.println(true);
        pw.println("Shukurjan\t");    pw.print(3242 + "\t"); pw.println(false);
        pw.println("Zak\t");  pw.print(213 + "\t"); pw.println(false);
        pw.println("Olga\t"); pw.print(764 + "\t"); pw.println(true);

        pw.close();

    }
}
