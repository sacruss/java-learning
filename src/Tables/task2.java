package Tables;

public class task2 {
    public static void main(String[] args) {
        // double[][] num = new double[3][3];
       /* num[0][0] = 1.0;
        num[0][1] = 1.5;
        num[0][2] = 2.0;
        num[1][0] = 1.5;
        num[1][1] = 2.0;
        num[1][2] = 2.5;
        num[2][0] = 2.0;
        num[2][1] = 2.5;
        num[2][2] = 3.0; */
        double[][] num = new double[3][];
        double[] line0 = {1.0, 1.5, 2.0};
        double[] line1 = {1.5, 2.0, 2.5};
        double[] line2 = {2.0, 2.5, 3.0};
        num[0] = line0;
        num[1] = line1;
        num[2] = line2;


        double sumDiagonals = num[0][0] * num[1][1] * num[2][2] + num[0][2] * num[1][1] * num[2][0];
        System.out.println(sumDiagonals);

        double sum11 = (num[1][0] + num[1][1] + num[1][2]) * (num[0][1] + num[1][1] + num[2][1]);
        System.out.println(sum11);

        double sum = num[0][0] + num[0][1] + num[0][2] + num[1][2] + num[2][2] + num[2][1] + num[2][0] + num[1][0];
        System.out.println(sum);

    }
}
