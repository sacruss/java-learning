import java.util.Random;
public class mathAndLogicalOperatorsTask {
    public static void main(String[] args) {

        Random rand = new Random ();
        int x = rand.nextInt (10); // losowa liczba z przedziału [0,9], 10 się nie wlicza
        int y = new Random ().nextInt(100); // krótsza wersja
        System.out.println("x=" + x + ", y=" + y);

        // is x greater than y?
        boolean result = x > y;
        System.out.println("x > y = " + result);

        // is x multiplied by 2 greater than y
        boolean result2 = x * 2 > y;
        System.out.println("x * 2 > y = " + result2);

        // is y smaller than the sum of x + 3 and simultaneously greater than x minus 2?
        boolean result3 = (y < x + 3) && (y > x - 2);
        System.out.println("(y < x + 3) && (y > x - 2) = " + result3);

        // is the product of x and y even?
        boolean result4 = ((x * y) % 2 ==0);
        System.out.println("Is x * y even? " + result4);




    }
}
