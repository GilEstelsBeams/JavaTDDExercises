package Fibonacci;

public class Fibonacci {
    public int fib(int n){

        if(n==0 || n==1) return n;
        int twoBefore=0;
        int oneBefore=1;
        int result=0;
        for(int i=2;i<=n; i++){
            result = twoBefore + oneBefore;
            twoBefore=oneBefore;
            oneBefore=result;
        }
        return result;
    }
}
