import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("1ое число: ");
        calc.setA(inputScanner.nextDouble());
        System.out.println("Математическая операция (+, -, *, /): ");
        inputScanner.nextLine();
        calc.setOperation(inputScanner.nextLine());
        System.out.println("2ое число: ");
        calc.setB(inputScanner.nextDouble());

        switch (calc.getOperation()) {
            case ("+"):
                calc.setResult(calc.addition(calc.getA(), calc.getB()));
                break;
            case ("-"):
                calc.setResult(calc.subtraction(calc.getA(), calc.getB()));
                break;
            case ("*"):
                calc.setResult(calc.multiplication(calc.getA(), calc.getB()));
                break;
            case ("/"):
                if (calc.checkZero(calc.getB())) {
                    calc.setResult(calc.division(calc.getA(), calc.getB()));
                } else {
                    System.out.println("На ноль делить нельзя");
                }
                break;
        }
        if (calc.checkZero(calc.getB())) {
            System.out.println(calc.getA() + " " + calc.getOperation() + " " +
                    calc.getB() + " = " + calc.getResult());
        }
        inputScanner.close();
    }
}
