package PrimeNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PrimeNumber {

    public static void main(String[] args) {
        PrimeNumber pN=new PrimeNumber();
        System.out.println(pN.isPrime(112333));
        System.out.println(pN.primes2(112314));
    }

    // CHECKS IF INTEGER IS PRIME NUMBER

    public boolean isPrime(int n) {
        return primes2(n).contains(n);
        }

        // METHOD TO EXPERIMENT WITH A THREADPOOLEXECUTOR EVEN THOUGH MIGHT BE LESS EFFICIENT THAN SECOND ONE

    public List<Integer> primes(int n) {
        List<Integer> listPrimes = new ArrayList<Integer>();
        if (n > 0) {
            Integer parts = n / 4;
            if (!(parts == 0)) {
                ExecutorService executor = Executors.newFixedThreadPool(4);

                for(int i=1; i<=n;i++){
                    final int j=i;
                    Future<Boolean> answer= executor.submit (()->{
                        return isPrime(j);
                    });

                   try{ if(answer.get()){ listPrimes.add(i);}
                   }
                   catch(Exception e){
                       }
                }
                executor.shutdown();

           } else listPrimes = partPrimes(1, n);

            }


        return listPrimes;
    }

    // METHOD TO ITERATE BETWEEN TWO BOUNDARIES

    public List<Integer> partPrimes(int start, int end){
        PrimeNumber pN=new PrimeNumber();
        List<Integer> listPrimes= new ArrayList<Integer>();
        for(int i=start; i<=end; i++){
            if(pN.isPrime(i)){
                listPrimes.add(i);
            }
        }
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

