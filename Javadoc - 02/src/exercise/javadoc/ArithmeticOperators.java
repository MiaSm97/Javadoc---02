package exercise.javadoc;
/**
  * @author Mia Smaldone
  * Created a class with four arithmetic methods in it
 */
public class ArithmeticOperators {
    /**
     *
     * @param num1 10
     * @param num2 5
     * @return sum (10 + 5)
     */
    public int sum(int num1, int num2){
        return num1 + num2;
    }
    /**
     *
     * @param num1 10
     * @param num2 5
     * @return subtraction (10 - 5)
     */
    public int sub(int num1, int num2){
        return num1 - num2;
    }
    /**
     *
     * @param num1 10
     * @param num2 5
     * @return multiplication (10 * 5)
     */
    public int mul(int num1, int num2){
        return num1 * num2;
    }
    /**
     *
     * @param num1 10
     * @param num2 5
     * @return division (10 / 5)
     */
    public int div(int num1, int num2){
        return num1 / num2;
    }
}
   /* have a quick look at the Java arithmetic operators
        create a class called ArithmeticOperators that has 4 methods:
        sum() method that takes 2 int parameters as input called num1 and num2 and returns their summation int
        sub() method that takes 2 int parameters as input called num1 and num2 and returns their subtraction int
        mul() method that takes 2 int parameters as input called num1 and num2 and returns their multiplication int
        div() method that takes 2 int parameters as input called num1 and num2 and returns their division int
        create a class called Tester that has the main method where you:
        create a new ArithmeticOperators object
        print in console the result of the 4 methods invocations, passing them (as params) int numbers as you like
        add Javadoc comments to:
        the 2 classes with a short description and the author
        the 5 methods with a short description, the parameters and the return value
        create a folder called GeneratedJavadoc under the main project folder
        generate the Javadoc file using the IntelliJ Javadoc plugin right inside the newly created folder
        explore the freshly generated Javadoc*/