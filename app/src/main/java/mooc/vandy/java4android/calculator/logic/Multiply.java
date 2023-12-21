package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply extends Operation{
    // TODO - add your solution here.
    //constructor with values inheriting from Operation class
    public Multiply(int argumentOne, int argumentTwo) {
        super(argumentOne, argumentTwo);
    }

    //return result
    public String getOutput() {
        return String.valueOf(super.getArgumentOne() * super.getArgumentTwo());
    }
}
