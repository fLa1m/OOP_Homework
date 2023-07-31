package Homework7;

public class Values<T extends Number> {
    private T leftValue;
    private T rightValue;

    public Values() {
    }

    public T getLeftValue() {
        return leftValue;
    }

    public void setLeftValue(T leftValue) {
        this.leftValue = leftValue;
    }

    public T getRightValue() {
        return rightValue;
    }

    public void setRightValue(T rightValue) {
        this.rightValue = rightValue;
    }

    @Override
    public String toString() {
        return "Values [leftValue=" + leftValue + ", rightValue=" + rightValue + "]";
    }

}
