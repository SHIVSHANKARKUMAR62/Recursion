package Recursion;

import java.util.Scanner;

class Array{
    public int Cal(int[] a,int n){
        if(n == 1) {
            return a[0];
        }else {
            return a[n-1]+Cal(a,n-1);
        }
    }
}

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array array = new Array();
        int n;
        System.out.print("Enter Size of the array: ");
        n = sc.nextInt();
        System.out.print("Enter Array Elements: ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = array.Cal(arr,n);
        System.out.println("Sum is: "+sum);
    }
}
