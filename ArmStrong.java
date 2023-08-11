package Recursion;

import java.util.Scanner;

class amrstrongNumber{
    int sum =0;
    public int Cal(int n){
        if (n!=0){
            sum = (int) (Math.pow(n%10,3) + Cal((n)/10));
        }
        return sum;
    }
}

public class ArmStrong {
    public static void main(String[] args) {
        amrstrongNumber s = new  amrstrongNumber();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a Number: ");
        n = sc.nextInt();
        int a = s.Cal(n);
        if (n==a){
            System.out.println(n+" is Armstrong Number...");
        }else {
            System.out.println(n+" is not a Armstrong Number...");
        }
    }
}
