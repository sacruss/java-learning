public class MathOperators {
    public static void main(String[] args) {

        int x = 10;
        int y = 4;

        System.out.println(x + y); // 14
        System.out.println(x - y); // 6
        System.out.println(x * y); // 40
        System.out.println(x / y); // 2
        System.out.println(x % y); // 2

        y = y * 5;
        y *= 5;
        System.out.println("Nowy Y: " + y);
    }
}
