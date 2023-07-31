package Homework7;

public class Controller {
    private final ComplexValues<Number> complexNumbers = new ComplexValues<>();
    private final Values<Number> numbers = new Values<>();
    private final AdvancedCalculator calc = new AdvancedCalculator();
    private final Input input = new Input();

    public void setValues() {
        System.out.println("Введите значение чисел.");
        System.out.print("a: ");
        numbers.setLeftValue(Integer.parseInt(input.scan()));
        System.out.print("b: ");
        numbers.setRightValue(Integer.parseInt(input.scan()));
    }

    public void setComplexValues() {
        System.out.println("Введите значения комплексных чисел.");
        ComplexValue<Number> complex1 = new ComplexValue<>();
        System.out.print("a: ");
        complex1.setLeftValue(Integer.parseInt(input.scan()));
        System.out.print("b: ");
        complex1.setRightValue(Integer.parseInt(input.scan()));
        ComplexValue<Number> complex2 = new ComplexValue<>();
        System.out.print("c: ");
        complex2.setLeftValue(Integer.parseInt(input.scan()));
        System.out.print("d: ");
        complex2.setRightValue(Integer.parseInt(input.scan()));
        complexNumbers.setComplex1(complex1);
        complexNumbers.setComplex2(complex2);
    }

    public void addition() {
        System.out.println(numbers.getLeftValue() + " + " + numbers.getRightValue() + " = " + calc.sum(numbers));
    }

    public void complexAddition() {
        System.out.println(
                complexNumbers.getComplex1() + " + " + complexNumbers.getComplex2() + " = "
                        + calc.sum(complexNumbers.getComplex1(), complexNumbers.getComplex2()));
    }

    public void subtraction() {
        System.out.println(numbers.getLeftValue() + " - " + numbers.getRightValue() + " = " + calc.sub(numbers));
    }

    public void complexSubtraction() {
        System.out.println(
                complexNumbers.getComplex1() + " - " + complexNumbers.getComplex2() + " = "
                        + calc.sub(complexNumbers.getComplex1(), complexNumbers.getComplex2()));
    }

    public void multiplication() {
        System.out.println(numbers.getLeftValue() + " * " + numbers.getRightValue() + " = " + calc.mult(numbers));
    }

    public void complexMultiplication() {
        System.out.println(
                complexNumbers.getComplex1() + " * " + complexNumbers.getComplex2() + " = "
                        + calc.mult(complexNumbers.getComplex1(), complexNumbers.getComplex2()));
    }

    public void division() {
        if (calc.div(numbers) == null) {
            System.out.println("На ноль делить нельзя");
        } else {
            System.out.println(numbers.getLeftValue() + " / " + numbers.getRightValue() + " = " + calc.div(numbers));
        }
    }

    public void complexDivision() {
        System.out.println(
                complexNumbers.getComplex1() + " / " + complexNumbers.getComplex2() + " = "
                        + calc.div(complexNumbers.getComplex1(), complexNumbers.getComplex2()));
    }

    public void exponentiation() {
        System.out.println(numbers.getLeftValue() + "^" + numbers.getRightValue() + " = " + calc.exp(numbers));
    }

    public void rooting() {
        if (calc.root(numbers) == null) {
            System.out.println("На ноль делить нельзя");
        } else {
            System.out.println(
                    numbers.getLeftValue() + "^" + "(1/" + numbers.getRightValue() + ")" + " = " + calc.root(numbers));
        }
    }

}
