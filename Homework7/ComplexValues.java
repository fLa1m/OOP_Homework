package Homework7;

public class ComplexValues<T extends Number> {
    private ComplexValue<T> complex1;
    private ComplexValue<T> complex2;

    public ComplexValues() {
    }

    public ComplexValue<T> getComplex1() {
        return complex1;
    }

    public ComplexValue<T> getComplex2() {
        return complex2;
    }

    public void setComplex1(ComplexValue<T> complex1) {
        this.complex1 = complex1;
    }

    public void setComplex2(ComplexValue<T> complex2) {
        this.complex2 = complex2;
    }

}
