package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide extends Operation{
    // TODO - add your solution here.
    //constructor with values inheriting from Operation class
    public Divide(int argumentOne, int argumentTwo) {
        super(argumentOne, argumentTwo);
    }

    //return result
    public String getOutput() {
        return ((super.getArgumentOne() / super.getArgumentTwo()) + " R: " + (super.getArgumentOne() % super.getArgumentTwo()));
    }
}
