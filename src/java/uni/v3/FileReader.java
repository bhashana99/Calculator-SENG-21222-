package uni.v3;


import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    public Double[] getNumbers() throws IOException { //will change the method signature too...!

        //read the number text file
        List<String> numbersStr = Files.readAllLines(
                Paths.get("D:\\UOK\\Academic\\Year 2\\constraction\\Calculator-SENG-21222-\\numbers.txt")
        );

        System.out.println(numbersStr.get(1));

        double number1 = Double.parseDouble(numbersStr.get(0));
        double number2 = Double.parseDouble(numbersStr.get(1));

        return new Double[]{number1,number2};
    }
}
