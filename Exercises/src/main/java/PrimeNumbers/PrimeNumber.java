package PrimeNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PrimeNumber {

    public static void main(String[] args) {
        PrimeNumber pN=new PrimeNumber();
        System.out.println(pN.primesStatic(6));

        long startTime1 = System.nanoTime();
        System.out.println(pN.primesStatic(100));
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1);
        System.out.println("static");
        System.out.println(duration1);

        long startTime2 = System.nanoTime();
        System.out.println(pN.primesNoThreadPool(100));
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);
        System.out.println("no threadpool");
        System.out.println(duration2);

        System.out.println(pN.isPrime(112333));


    }

    // CHECKS IF INTEGER IS PRIME NUMBER

    public boolean isPrime(int n) {
        return primes2(n).contains(n);
        }

        //LIST of N PRIMES WITHOUT THREADPOOL

    public List<Integer> primesNoThreadPool(int n){
        List<Integer> listPrimes = new ArrayList<Integer>();
        int i=2;
        while(listPrimes.size()<n){
            if(isPrime(i)) listPrimes.add(i);
            i++;
        }
        return listPrimes;
    }


    // METHOD TO EXPERIMENT WITH A STATIC THREADPOOLEXECUTOR

    public List<Integer> primesStatic(int n) {
        List<Integer> listPrimes = new ArrayList<Integer>();
        boolean keepGoing=true;
        int start=1;
        int count=n;
        do{if (n > 0) {
            if(n>3) {
                ExecutorService executor = Executors.newFixedThreadPool(4);
                 int parts = n / 4;
                 int startL=start;
                 int nL=n;
                Future<List<Integer>> answer1 = executor.submit(() -> {
                    return listBoundedPrimes(startL, startL+ parts-1);
                });
                Future<List<Integer>> answer2 = executor.submit(() -> {
                    return listBoundedPrimes(parts + startL, startL+ 2 * parts -1);
                });
                Future<List<Integer>> answer3 = executor.submit(() -> {
                    return listBoundedPrimes(2 * parts + startL, 3 * parts +startL -1);
                });
                Future<List<Integer>> answer4 = executor.submit(() -> {
                    return listBoundedPrimes(3 * parts + startL, startL+nL -1);
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
            else listPrimes.addAll(listBoundedPrimes(start,start+n-1));
          }
        int listSize=listPrimes.size();
        if (listSize>=count) keepGoing=false;
        else{
            start=start+n;
            n=count-listSize;
        }

        } while(keepGoing);


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

