package Tables;

public class task1 {
    public static void main(String[] args) {
        int[] num = {2,7,13};
        int[] num1 = {1,4,52};
        System.out.println(num[0] + num1[0] + num[1] + num1[1] + num[2]+num1[2]);

        task1Class utils = new task1Class();
        int sum = utils.sumArrays(num,num1);
        System.out.println("Suma liczb w tablicach wynsosi: "+ sum);

    }


}
