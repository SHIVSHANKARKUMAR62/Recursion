package Recursion;

import java.util.Scanner;

public class Power {
    public static boolean Powr(int n){

        if (n == 0) {
            return false;
        }

        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        boolean result = Powr(n);
        if (!result){
            System.out.println(n+" is not a 2^"+n);
        }else {
            System.out.println(n+" is a 2^"+n);
        }
    }
}
