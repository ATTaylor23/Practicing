import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//WHAT IN THE FLYING FUCK

public class CSVReader {

    public static void main(String[] args) throws FileNotFoundException {

        List<String[]> customersInfo = getAsListOfStringArrays("MOCK_DATA.csv");

        for(String[] row: customersInfo){
            System.out.println(Arrays.toString(row));
        }

    }

    public static List<String[]> getAsListOfStringArrays(String pathToCSVFile) throws FileNotFoundException {

        List<String[]> list = new ArrayList<>();

        Scanner scanner = new Scanner(new File(pathToCSVFile));

        while(scanner.hasNextLine()){
            String[] eachRow = scanner.nextLine().split(",");
            list.add(eachRow);
        }
        return list;
    }
}
