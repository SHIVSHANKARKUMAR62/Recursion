package Recursion;

import java.util.Scanner;

class Calculation{
    int result;
    public int Count(int n){
        if (n<=1){
            return n;
        }else{
            result = Count(n-1) + Count(n-2);
        }
        return result;
    }
}

public class Count_Way {
    public static void main(String[] args) {
        Calculation c = new Calculation();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Factorial Number: ");
        int n = sc.nextInt();
        c.Count(n+1);  // we take n_1 because in factorial value take from zero index but in this value taken from one index.
        System.out.println("Factorial of "+n+" is "+c.result);
    }
}
