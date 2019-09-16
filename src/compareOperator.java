public class compareOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("Czy x jest większy od y?");
        boolean isXGreaterThenY = x > y;
        System.out.println(isXGreaterThenY);

        boolean xEqualsY = x ==y;
        System.out.println("Czy x jest równy y?");
        System.out.println(xEqualsY);

        boolean xNotEqualsY = x !=y;
        System.out.println("Czy x jest różny od y?");
        System.out.println(xNotEqualsY);

        System.out.println(!true);
        System.out.println(!false);

    }
}
