package uni.v3;

import uni.v3.operation.AddOperation;
import uni.v3.operation.DivOperation;
import uni.v3.operation.MulOperation;
import uni.v3.operation.SubOperation;

import java.io.IOException;

//Main class is the coordinator now...
public class Main {

    //SOLID principal
    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();


        double result = 0;

        if (operator.equals("add")) {
            AddOperation addOperation = new AddOperation();
            result =addOperation.execute(numbers);
        } else if (operator.equals("sub")) {
            SubOperation subOperation = new SubOperation();
            result = subOperation.execute(numbers);
        } else if (operator.equals("mul")) {
            MulOperation mulOperation = new MulOperation();
            result = mulOperation.execute(numbers);
        } else if (operator.equals("div")) {
            DivOperation divOperation = new DivOperation();
            result = divOperation.execute(numbers);
        }

        System.out.println(result);
    }
}
