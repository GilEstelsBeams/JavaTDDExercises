package PrimeNumbers;

import java.util.ArrayList;

public class PrimeNumber {

    public boolean isPrime(int n) {
        if (n < 0) return false;
        else {
            if (n == 0) return true;
            else if (n == 1) return true;
            else if (n == 2) return true;
//            else if (n == 3) return true;
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
                System.out.println(primes);
                    return primes.contains(n);
                }
            }
        }
    }

