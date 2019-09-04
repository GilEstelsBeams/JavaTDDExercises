package PrimeNumbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    // CHECKS IF INTEGER IS PRIME NUMBER

    public boolean isPrime(int n) {
        return primes2(n).contains(n);
        }

        // METHOD TO EXPERIMENT WITH ATHREADPOOLEXECUTOR EVEN THOUGH MIGHT BE LESS EFFICIENT THAN SECOND ONE

    public List<Integer> primes(int n){
        List<Integer> listPrimes= new ArrayList<Integer>();
        return listPrimes;
    }

        //METHOD USED IN ISPRIME TO DETERMINE LIST

    public List<Integer> primes2(int n){
        List<Integer> listPrimes= new ArrayList<Integer>();
        if (n < 2) return listPrimes;
        else {
            listPrimes.add(2);
            if (n == 2) return listPrimes;

            else {
                for (int i = 3; i <= n; i++) {

                    boolean maybePrime =true;

                    for (int j = 0; j < listPrimes.size(); j++) {
                        int remainder = i % listPrimes.get(j);
                        if (remainder == 0){maybePrime=false;
                            break;}
                    }

                    if(maybePrime)listPrimes.add(i);
                }
                return listPrimes;
            }
        }
    }
    }

