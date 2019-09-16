public class Concat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;

        System.out.println(s3);

        int x = 2;
        int y = 3;
        int sum = x + y;

        System.out.println(x + " +  " + y + " = " + sum); // 2 + 3 = 5

        System.out.println(x + y + " to wynik sumowania");
        System.out.println("wynik sumowania to " + x + y);
        System.out.println("wynik sumowania to " + (x + y));
    }
}
