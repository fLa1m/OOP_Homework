package Homework7;

public interface BaseComplexOperation {
    public ComplexValue<? extends Number> sum(ComplexValue<? extends Number> complex1,
            ComplexValue<? extends Number> complex2);

    public ComplexValue<? extends Number> sub(ComplexValue<? extends Number> complex1,
            ComplexValue<? extends Number> complex2);

    public ComplexValue<? extends Number> mult(ComplexValue<? extends Number> complex1,
            ComplexValue<? extends Number> complex2);

    public ComplexValue<? extends Number> div(ComplexValue<? extends Number> complex1,
            ComplexValue<? extends Number> complex2);
}
