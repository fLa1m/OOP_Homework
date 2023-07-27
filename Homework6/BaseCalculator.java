package Homework6;

public class BaseCalculator implements BaseOperation {

    @Override
    public Double sum(Values<? extends Number> numbers) {
        return numbers.getLeftValue().doubleValue() + numbers.getRightValue().doubleValue();
    }

    @Override
    public Double sub(Values<? extends Number> numbers) {
        return numbers.getLeftValue().doubleValue() - numbers.getRightValue().doubleValue();
    }

    @Override
    public Double mult(Values<? extends Number> numbers) {
        return numbers.getLeftValue().doubleValue() * numbers.getRightValue().doubleValue();
    }

    @Override
    public Double div(Values<? extends Number> numbers) {
        if (numbers.getRightValue().intValue() == 0) {
            return null;
        }
        return numbers.getLeftValue().doubleValue() / numbers.getRightValue().doubleValue();
    }

}
