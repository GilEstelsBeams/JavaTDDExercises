package PrimeNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PrimeNumber {

    public static void main(String[] args) {
        PrimeNumber pN=new PrimeNumber();
        long startTime1 = System.nanoTime();
        System.out.println(pN.primes(100));
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1);
        System.out.println(duration1);

        long startTime2 = System.nanoTime();
        System.out.println(pN.primes2(100));
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);
        System.out.println(duration2);

        System.out.println(pN.isPrime(112333));


    }

    // CHECKS IF INTEGER IS PRIME NUMBER

    public boolean isPrime(int n) {
        return primes2(n).contains(n);
        }

        // METHOD TO EXPERIMENT WITH A THREADPOOLEXECUTOR EVEN THOUGH MIGHT BE LESS EFFICIENT THAN SECOND ONE

    public List<Integer> primes(int n) {
        List<Integer> listPrimes = new ArrayList<Integer>();
        if (n > 0) {
            if(n>3) {
                ExecutorService executor = Executors.newFixedThreadPool(4);
                 int parts = n / 4;
                Future<List<Integer>> answer1 = executor.submit(() -> {
                    return listBoundedPrimes(1, parts);
                });
                Future<List<Integer>> answer2 = executor.submit(() -> {
                    return listBoundedPrimes(parts + 1, 2 * parts);
                });
                Future<List<Integer>> answer3 = executor.submit(() -> {
                    return listBoundedPrimes(2 * parts + 1, 3 * parts);
                });
                Future<List<Integer>> answer4 = executor.submit(() -> {
                    return listBoundedPrimes(3 * parts + 1, n);
                });
                    try {
                            listPrimes.addAll(answer1.get());
                            listPrimes.addAll(answer2.get());
                            listPrimes.addAll(answer3.get());
                            listPrimes.addAll(answer4.get());

                    } catch (Exception e) {
                    }

                executor.shutdown();
            }
            listPrimes=listBoundedPrimes(1,n);
          }

        // SIMPLE CODE WITHOUT THE FOUR LISTS

//           for(int i=1; i<=n;i++){
//                    final int j=i;
//                    Future<Boolean> answer= executor.submit (()->{
//                        return isPrime(j);
//                    });
//
//                   try{ if(answer.get()){ listPrimes.add(i);}
//                   }
//                   catch(Exception e){
//                       }
//                }
//                executor.shutdown();
//           }

        return listPrimes;
    }

    //METHOD USED IN EXECUTOR

public List<Integer> listBoundedPrimes(int start, int finish){
       List<Integer> listPrimes = new ArrayList<Integer>();
        for(int i=start; i<=finish; i++){
            if(isPrime(i)) listPrimes.add(i);
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

