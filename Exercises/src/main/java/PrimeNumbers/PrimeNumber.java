package PrimeNumbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public boolean isPrime(int n) {
        if (n < 2) return false;
        else {
            if (n == 2) return true;

            else {
                ArrayList<Integer> primes = new ArrayList<Integer>();
                primes.add(2);


                for (int i = 3; i <= n; i++) {

                    boolean maybePrime =true;

                        for (int j = 0; j < primes.size(); j++) {
                            int remainder = i % primes.get(j);
                            if (remainder == 0){maybePrime=false;
                            break;}
                        }

                    if(maybePrime)primes.add(i);
                    }
                    return primes.contains(n);
                }
            }
        }

    public List<Integer> primes(int n){
        List<Integer> listPrimes= new ArrayList<Integer>();
        return listPrimes;
    }
    }

