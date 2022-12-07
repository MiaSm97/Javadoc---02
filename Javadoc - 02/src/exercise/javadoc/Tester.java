package exercise.javadoc;
/**
 * @author Mia Smaldone
 * Main Class "Tester"
 * I'm going to print ArithmeticOperators methods
 */
public class Tester {
    public static void main(String[] args) {
        /**
         * Created ArithmeticOperators object
         * called back its methods
         * assigned values to parameters
         * num1 = 10, num2 = 5
         */
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        System.out.println(arithmeticOperators.sum(10, 5));
        System.out.println(arithmeticOperators.sub(10, 5));
        System.out.println(arithmeticOperators.mul(10, 5));
        System.out.println(arithmeticOperators.div(10, 5));
    }
}
    /*create a class called Tester that has the main method where you:
        create a new ArithmeticOperators object
        print in console the result of the 4 methods invocations, passing them (as params) int numbers as you like
        add Javadoc comments to:
        the 2 classes with a short description and the author
        the 5 methods with a short description, the parameters and the return value
        create a folder called GeneratedJavadoc under the main project folder
        generate the Javadoc file using the IntelliJ Javadoc plugin right inside the newly created folder
        explore the freshly generated Javadoc*/