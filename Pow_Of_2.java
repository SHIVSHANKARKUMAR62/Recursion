package Recursion;

import java.util.Scanner;

public class Pow_Of_2 {

    public static int power(int a, int b){
        int result, value;
        // base case condition
        if (b==1){
            return a;
        }else {
            // recursion part
            value = power(a,b/2);
            result = value * value;
            if (b % 2 == 0){
                return result;
            }else {
                return a * result;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int result = power(2,n);
        System.out.println(result+" is a 2^"+n);
    }
}
