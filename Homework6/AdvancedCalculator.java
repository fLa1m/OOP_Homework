package Homework6;

public class AdvancedCalculator extends BaseCalculator implements AdvancedOperation {

    @Override
    public Double exp(Values<? extends Number> numbers) {
        return Math.pow(numbers.getLeftValue().doubleValue(), numbers.getRightValue().doubleValue());
    }

    @Override
    public Double root(Values<? extends Number> numbers) {
        if (numbers.getRightValue().intValue() == 0) {
            return null;
        }
        return Math.pow(numbers.getLeftValue().doubleValue(), 1 / numbers.getRightValue().doubleValue());
    }

}
