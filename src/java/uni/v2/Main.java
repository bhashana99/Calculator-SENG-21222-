package uni.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    //SOLID principal
    public static void main(String[] args) throws IOException {

        //Make sure to validate the arguments before using
        if (args.length == 0) {
            System.out.println("Please Provide the operation as an argument");
            return;
        }

        //another validation that we could do to these args?
        //add, sub, mul, div
        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div"))) {
            System.out.println("Please provide add,sub,mul or div as the operator argument");
            return;
        }

        //read the number text file
        List<String> numbersStr = Files.readAllLines(
                Paths.get("D:\\UOK\\Academic\\Year 2\\constraction\\Calculator-SENG-21222-\\numbers.txt")
        );

        System.out.println(numbersStr.get(1));

        double number1 = Double.parseDouble(numbersStr.get(0));
        double number2 = Double.parseDouble(numbersStr.get(1));
        double result = 0;

        if (operator.equals("add")) {
            result = number1 + number2;
        } else if (operator.equals("sub")) {
            result = number1 - number2;
        } else if (operator.equals("mul")) {
            result = number1 * number2;
        } else if (operator.equals("div")) {
            result = number1 / number2;
        }

        System.out.println(result);
    }
}
