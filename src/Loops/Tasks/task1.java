package Loops.Tasks;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile liczb chcesz zsumować?: ");
        int howMany=sc.nextInt();

        int sum=0;

        while(howMany --> 0){
            System.out.println("Podaj kolejną liczbę: ");
            sum = sum + sc.nextInt();
        }
        System.out.println("Suma wszystkich podanych liczb to: " + sum);
        sc.close();

    }
}
