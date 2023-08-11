package Recursion;

import java.util.Scanner;

class Max{
    public int Cal(int[] a,int n){
        if(n == 1) {
            return a[0];
        }else {
            return Math.max(a[n - 1], Cal(a, n - 1));
        }
    }
}

class Min{
    public int Cal(int[] a,int n){
        if(n == 1) {
            return a[0];
        }else {
            return Math.min(a[n - 1], Cal(a, n - 1));
        }
    }
}

public class max_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Max m = new Max();
        Min mm = new Min();
        int n;
        System.out.print("Enter Size of the array: ");
        n = sc.nextInt();
        System.out.print("Enter Array Elements: ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = m.Cal(arr,n);
        int min = mm.Cal(arr,n);
        System.out.println("Max value is: "+max);
        System.out.print("Max value is: "+min);
    }
}
