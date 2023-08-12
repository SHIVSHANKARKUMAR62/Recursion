package Iterator_Method;

import java.util.Scanner;

public class Alter_sign {
    public static int Sign(int n){
        // Base Condition
        if (n==0){
            return 0;
        } else if (n%2==0) {
            return Sign(n-1) - n;
        }
        return Sign(n-1) + n;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int result = Sign(n);
        System.out.print("Assign Number of Sum is: "+result);
    }
}
