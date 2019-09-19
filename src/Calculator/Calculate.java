package Calculator;

public class Calculate {
    public static void main(String[] args) {
        double a = 4.72;
        double b = 7.13;

        Calculator calc = new Calculator();
        double resultAdd = calc.add(a,b);
        System.out.println(resultAdd);

        double resultSubstract = calc.substract(a,b);
        System.out.println(resultSubstract);

        double resultMultiply = calc.mulitply(a,b);
        System.out.println(resultMultiply);

        double resultDivide = calc.divide(a,b);
        System.out.println(resultMultiply);

    }

    }
