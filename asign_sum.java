package Recursion;

import java.util.Scanner;

class asignSum {
    int Sum = 0;
    public int Cal(int n){
        if (n % 2 == 0){
            Sum = (-n) / 2;
        }else {
            Sum = (n + 1) / 2;
        }
        return Sum;
    }
}

public class asign_sum {
    public static void main(String[] args) {
        asignSum asign = new asignSum();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value: ");
        int n = sc.nextInt();
        int sum = asign.Cal(n);
        System.out.println("Sum is "+sum);
    }
}
