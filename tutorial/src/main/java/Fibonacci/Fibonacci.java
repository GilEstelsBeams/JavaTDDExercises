package Fibonacci;

public class Fibonacci {
    public int fib(int n){
        int result=1;
        for(int i=0;i<n; i++){
            result += result;
        }
        return result;
    }
}
