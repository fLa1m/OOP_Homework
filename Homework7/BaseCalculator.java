package Homework7;

public class BaseCalculator implements BaseOperation, BaseComplexOperation {

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

    @Override
    public ComplexValue<? extends Number> sum(ComplexValue<? extends Number> complex1,
            ComplexValue<? extends Number> complex2) {
        ComplexValue<Double> result = new ComplexValue<>();
        result.setLeftValue(complex1.getLeftValue().doubleValue() + complex2.getLeftValue().doubleValue());
        result.setRightValue(complex1.getRightValue().doubleValue() + complex2.getRightValue().doubleValue());
        return result;
    }

    @Override
    public ComplexValue<? extends Number> sub(ComplexValue<? extends Number> complex1,
            ComplexValue<? extends Number> complex2) {
        ComplexValue<Double> result = new ComplexValue<>();
        result.setLeftValue(complex1.getLeftValue().doubleValue() - complex2.getLeftValue().doubleValue());
        result.setRightValue(complex1.getRightValue().doubleValue() - complex2.getRightValue().doubleValue());
        return result;
    }

    @Override
    public ComplexValue<? extends Number> mult(ComplexValue<? extends Number> complex1,
            ComplexValue<? extends Number> complex2) {
        ComplexValue<Double> result = new ComplexValue<>();
        result.setLeftValue(complex1.getLeftValue().doubleValue() * complex2.getLeftValue().doubleValue()
                - complex1.getRightValue().doubleValue() * complex2.getRightValue().doubleValue());
        result.setRightValue(complex1.getRightValue().doubleValue() * complex2.getLeftValue().doubleValue()
                + complex1.getLeftValue().doubleValue() * complex2.getRightValue().doubleValue());
        return result;
    }

    @Override
    public ComplexValue<? extends Number> div(ComplexValue<? extends Number> complex1,
            ComplexValue<? extends Number> complex2) {
        ComplexValue<Double> result = new ComplexValue<>();
        Double a, b, c, d;
        a = complex1.getLeftValue().doubleValue();
        b = complex1.getRightValue().doubleValue();
        c = complex2.getLeftValue().doubleValue();
        d = complex2.getRightValue().doubleValue();
        result.setLeftValue((a * c + b * d) / (c * c + d * d));
        result.setRightValue((b * c - a * d) / (c * c + d * d));
        return result;
    }

}
