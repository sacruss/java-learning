package scanner.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Podaj pierwszą liczbę: ");
        double a = input.nextDouble();
        input.nextLine();
        System.out.println("Co chcesz wykonać (+, -, /, *) : ");
        String operator = input.nextLine();
        System.out.println("Podaj drugą liczbe: ");
        double b = input.nextDouble();

        model calc = new model();
        double result = calc.calculate(a,b,operator);
        System.out.println(a + operator + b + " = " + result);

        input.close();

    }
}
