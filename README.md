# JavaTDDExercises

We use Fibonacci numbers to indicate complexity when estimating cards.  Each number in the Fibonacci sequence is the sum of the previous two numbers in the Fibonacci Sequence, starting at 0.  The sequence therefore looks like: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, …
 
Write a recursive function with signature public int fib(int n) that returns the n-th Fibonacci number (assuming index starts at 0, so fib(0)=0, fib(1)=1, fib(2)=1, fib(3)=2, etc).

Ensure that you use TDD when writing this recursive function. Have you covered all input scenarios that a malicious user might use?
Explain what happens when you try and compute the 50-th Fibonacci number using your recursive algorithm.  Could you use an alternative type to avoid this happening?
Explain what would happen when you try and compute the millionth Fibonacci sequence (probably don’t want to actually try this, as it will take forever)

 
Moving on to Prime numbers: A Prime number is any number greater than 1 that has two unique factors: itself and 1.  Prime: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29.  Not prime: 4 (divisible by 2 as well as 4 and 1), 6 (divisible by 3), 8 (divisible by 2, 4), 10 (divisible by 5, 10).
 
Write an iterative function with signature public boolean isPrime(int n) that returns true if a number is prime, and false if it is not.

Ensure that you use TDD when writing this iterative function.
Hint: start at 0, 1, 2, 3, 4, and see if they can be divided by any previous number in the list with no remainder

At what point can you stop checking if your candidate prime is divisible by other numbers?

Write another function, with signature public List<Integer> primes(int n) which returns the first n prime numbers.
Given your list of candidate primes in the primes function, divide it into four lists of equal length and use aThreadPoolExecutor of size 4 to execute isPrime in parallel.  How much does this speed up your primes method?  How much would you expect it to speed up your primes method?
Memorize the isPrime function such that it caches known previous Prime values.  If you run your unit tests multiple times, do you get the same value?
If you don’t get the same value, use the synchronized keyword in the appropriate place to ensure that you do

ANSWER:

Here it slows it down with my code, since I could use primes2() directly. It only makes the necessary checks, primes() is quite inefficient compared to primes2(). Here I have primes2 which is 1000 faster than primes.
Yet the way primes2 is built does not allow for a threadpoolexecutor.