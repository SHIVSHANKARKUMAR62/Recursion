package Recursion;

import java.util.Scanner;

public class Multiple {
    public static void MulPart(int n,int k){
        //base case condition
        if (k==1){
            System.out.println(n);
            return;
        }
        // recursion part
        MulPart(n,k-1);
        System.out.println(n+" X "+k+" = "+n*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Table: ");
        int n = sc.nextInt();
        MulPart(n,10);
        System.out.println("Thanks You...");
    }
}
