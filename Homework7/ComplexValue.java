package Homework7;

public class ComplexValue<T extends Number> extends Values<T> {

    @Override
    public String toString() {
        return "[" + super.getLeftValue() + " + " + super.getRightValue() + "i]";
    }

}
