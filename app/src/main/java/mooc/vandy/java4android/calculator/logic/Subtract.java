package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract extends Operation{
    // TODO - add your solution here.

    //constructor with values inheriting from Operation class
    public Subtract(int argumentOne, int argumentTwo) {
        super(argumentOne, argumentTwo);
    }

    //return result
    public String getOutput() {
        return String.valueOf(super.getArgumentOne() - super.getArgumentTwo());
    }
}
