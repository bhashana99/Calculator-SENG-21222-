package uni.v3;

public class CommandLineInputs {

    private String[] args;

    //Constructor of the class
    public CommandLineInputs(String[] arguments ){
        this.args = arguments;
    }
    public String getOperator(){
        //Make sure to validate the arguments before using
        if (args.length == 0) {
            System.out.println("Please Provide the operation as an argument");
            return "";  // will change future
        }

        //another validation that we could do to these args?
        //add, sub, mul, div
        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div"))) {
            System.out.println("Please provide add,sub,mul or div as the operator argument");
            return ""; //will change future
        }

        return operator;
    }
}
