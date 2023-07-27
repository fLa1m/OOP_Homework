package Homework6;

public class Controller {
    private final Values<Number> numbers = new Values<>();
    private final AdvancedCalculator calc = new AdvancedCalculator();
    private final Input input = new Input();

    public void setValues() {
        System.out.print("a: ");
        numbers.setLeftValue(Integer.parseInt(input.scan()));
        System.out.print("b: ");
        numbers.setRightValue(Integer.parseInt(input.scan()));
    }

    public void addition() {
        System.out.println(numbers.getLeftValue() + " + " + numbers.getRightValue() + " = " + calc.sum(numbers));
    }

    public void subtraction() {
        System.out.println(numbers.getLeftValue() + " - " + numbers.getRightValue() + " = " + calc.sub(numbers));
    }

    public void multiplication() {
        System.out.println(numbers.getLeftValue() + " * " + numbers.getRightValue() + " = " + calc.mult(numbers));
    }

    public void division() {
        if (calc.div(numbers) == null) {
            System.out.println("На ноль делить нельзя");
        } else {
            System.out.println(numbers.getLeftValue() + " / " + numbers.getRightValue() + " = " + calc.div(numbers));
        }
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
