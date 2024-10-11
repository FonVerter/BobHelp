import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class BobHelp {


    public static void main(String[] args) throws IOException {


        FileReader fileReader = new FileReader("\\D:\\test\\text1.txt");
        FileWriter fileWriter = new FileWriter("\\D:\\test\\text2.txt");


        while (fileReader.ready()) {
            int symbol = fileReader.read();
            fileWriter.write(symbol);

        }

        fileReader.close();
        fileWriter.close();

        LinkedList <String> linkedList = new LinkedList<>();

    }


}
