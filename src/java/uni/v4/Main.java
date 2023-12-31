package uni.v4;

import uni.v4.operation.*;

import java.io.IOException;

//LISKOV Substitution principle
public class Main {

    //SOLID principal
    public static void main(String[] args) throws IOException {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();


        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance(operator);

        Double result = operation.execute(numbers);

        UI ui = new UI();
        ui.showMessage("The result is "+ result);
    }
}
