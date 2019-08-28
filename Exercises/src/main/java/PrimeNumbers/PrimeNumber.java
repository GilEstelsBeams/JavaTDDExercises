package PrimeNumbers;

import java.util.ArrayList;

public class PrimeNumber {

    public boolean isPrime(int n){
        if (n<0) return false;
        else{
            if(n==0) return true;
            else if(n==1) return true;
            else if(n==2) return true;
            else {
                ArrayList<Integer> primes = new ArrayList<Integer>();
                primes.add(2);

                for (int j=0; j<primes.size() ; j++){
                        int remainder= n % primes.get(j);
                        if(remainder==0) return false;


                }


            }
       return true;
    }
    }
}
