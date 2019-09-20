package stosISterta;

public class MathCalc {
    public static void main(String[] args) {
        Formulas mathFormulas = new Formulas ();
        double a1 = 5.0;
        double b1 = 6.0;
        double c1 = 12.0;
        double surface1 = mathFormulas.boxSurface(a1, b1, c1);
        double surface2 = mathFormulas.boxSurface(3.0, 8.0, 10.0);
        System.out.println(surface1);
        System.out.println(surface2);
    }
}
