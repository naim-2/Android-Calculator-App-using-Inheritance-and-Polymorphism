package mooc.vandy.java4android.calculator.logic;

public class Operation {
    private int argumentOne = 0;
    private int argumentTwo = 0;
    private String output = "";

    public Operation(int mArgumentOne, int mArgumentTwo) {
        this.argumentOne = mArgumentOne;
        this.argumentTwo = mArgumentTwo;
    }

    //getters methods
    public int getArgumentOne(){
        return this.argumentOne;
    }
    public int getArgumentTwo(){
        return this.argumentTwo;
    }
    public String getOutput(){
        return this.output;
    }
}
