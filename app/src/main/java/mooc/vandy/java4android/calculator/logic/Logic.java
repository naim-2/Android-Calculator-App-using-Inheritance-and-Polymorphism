package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }



    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here.
        //store the child classes as an object of the parent class
        Operation[] operations = new Operation[]
                {
                        new Add(argumentOne, argumentTwo),
                        new Subtract(argumentOne, argumentTwo),
                        new Multiply(argumentOne, argumentTwo),
                        new Divide(argumentOne, argumentTwo)
                };
        //perform the operation using polymorphism
        mOut.print(operations[operation - 1].getOutput());
    }
}
