package Fibonacci;

public class Fibonacci {

    public Fibonacci() {
    }

    public int fib(int n){
        int result=0;

        if(n<0) {
            System.out.println("You entered a negative number");
            result = -1;
        }
        else{

        if(n==0 || n==1) return n;
            else{
            int twoBefore=0;
            int oneBefore=1;

            for(int i=2;i<=n; i++) {
                result = twoBefore + oneBefore;
                twoBefore = oneBefore;
                oneBefore = result; }
               }
        }
        return result;
    }
}
