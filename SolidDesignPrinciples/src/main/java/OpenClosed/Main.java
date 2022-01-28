package OpenClosed;

import java.security.InvalidParameterException;

interface IOperation {
    void performOperation();
}

interface ICalculator {
    void calculate(IOperation operation);
}

public class Main {

}

class Addition implements IOperation {
    private final double firstOperand;
    private final double secondOperand;
    private double result = 0.0;

    public Addition(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    //Setters and getters

    @Override
    public void performOperation() {
        result = firstOperand + secondOperand;
    }
}

class Substraction implements IOperation {
    private final double firstOperand;
    private final double secondOperand;
    private double result = 0.0;

    public Substraction(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    //Setters and getters

    @Override
    public void performOperation() {
        result = firstOperand - secondOperand;
    }
}

class SimpleCalculator implements ICalculator {
    @Override
    public void calculate(IOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Some message");
        }

        operation.performOperation();
    }
}

//   Now we can add as many operations as we want without changing the original module code. Any new operation will fit in easily. e.g. multiplication operation will be written like this and will work correctly.
class Multiplication implements IOperation {
    private final double firstOperand;
    private final double secondOperand;
    private double result = 0.0;

    public Multiplication(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    //Setters and getters

    @Override
    public void performOperation() {
        result = firstOperand * secondOperand;
    }
}