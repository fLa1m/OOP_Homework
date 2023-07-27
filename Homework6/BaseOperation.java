package Homework6;

public interface BaseOperation {
    public Double sum(Values<? extends Number> numbers);

    public Double sub(Values<? extends Number> numbers);

    public Double mult(Values<? extends Number> numbers);

    public Double div(Values<? extends Number> numbers);

}
