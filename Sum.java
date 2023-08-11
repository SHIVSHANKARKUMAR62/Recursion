package Recursion;

class SumP{
    int sum =0;
    public int Cal(int n){
        if (n>=0 && n<=9){
            return n;
        }else {
            sum = n/10 + Cal((n)%10);

        }
        return sum;
    }
}

public class Sum {
    public static void main(String[] args) {
        SumP s = new SumP();
        int n = s.Cal(29);
        System.out.println(n);
    }
}
