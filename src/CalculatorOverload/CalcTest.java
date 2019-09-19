package CalculatorOverload;

public class CalcTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.substract(17.43, 13.231));
        System.out.println(calculator.substract(17.4,13.2,4.1));
        System.out.println(calculator.add(5.21, 4.21));
        System.out.println(calculator.add(5.21,4.21,1.11));
    }
}
