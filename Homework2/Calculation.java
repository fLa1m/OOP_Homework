public class Calculation implements Operations {
    private double a;
    private double b;
    private String operation;
    private double result;

    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        return a / b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Calculation [a=" + a + ", b=" + b + ", operation=" + operation + ", result=" + result + "]";
    }

    public boolean checkZero(double b, String op) {
        if (b == 0 && op.equals("/")) {
            return false;
        } else {
            return true;
        }
    }
}
