# JavaTDDExercises

Part 1, we use Fibonacci numbers to indicate complexity when estimating cards.  Each number in the Fibonacci sequence is the sum of the previous two numbers in the Fibonacci Sequence, starting at 0.  The sequence therefore looks like: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, …
 
Write a recursive function with signature public int fib(int n) that returns the n-th Fibonacci number (assuming index starts at 0, so fib(0)=0, fib(1)=1, fib(2)=1, fib(3)=2, etc).

Ensure that you use TDD when writing this recursive function. Have you covered all input scenarios that a malicious user might use?
Explain what happens when you try and compute the 50-th Fibonacci number using your recursive algorithm.  Could you use an alternative type to avoid this happening?
Explain what would happen when you try and compute the millionth Fibonacci sequence (probably don’t want to actually try this, as it will take forever)

 
Part 2, moving on to Prime numbers: A Prime number is any number greater than 1 that has two unique factors: itself and 1.  Prime: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29.  Not prime: 4 (divisible by 2 as well as 4 and 1), 6 (divisible by 3), 8 (divisible by 2, 4), 10 (divisible by 5, 10).
 
Write an iterative function with signature public boolean isPrime(int n) that returns true if a number is prime, and false if it is not.

Ensure that you use TDD when writing this iterative function.
Hint: start at 0, 1, 2, 3, 4, and see if they can be divided by any previous number in the list with no remainder

At what point can you stop checking if your candidate prime is divisible by other numbers?

Write another function, with signature public List<Integer> primes(int n) which returns the first n prime numbers.
Given your list of candidate primes in the primes function, divide it into four lists of equal length and use aThreadPoolExecutor of size 4 to execute isPrime in parallel.  How much does this speed up your primes method?  How much would you expect it to speed up your primes method?
Memoize the isPrime function such that it caches known previous Prime values.  If you run your unit tests multiple times, do you get the same value?
If you don’t get the same value, use the synchronized keyword in the appropriate place to ensure that you do

ANSWER:

There is a cost associated with the creation of threadpools.
Thus, for smaller number of primes such as 100, the normal method is quicker.
Once n gets much bigger the threadpools start being quicker, with the dynamic one always more efficient than the static one.

Part 3 is going to keep with the theme of maths from the previous set
The probability that is will rain tomorrow is a function of whether or not it rained today.  Consider the following probability matrix:

| | Rain tomorrow | Sunny tomorrow |

| Rain today| 0.7 | 0.3 |

| Sunny today | 0.4 | 0.6 |

Represent this matrix as a Matrix class in Java.  What validations need to exist?
Create an Observation class, that indicates whether it is currently Sunny or Raining.  This Observation class should have a method that tries to predict the weather based on an input Matrix, returning a new Observation
Create a Forecast class, with a method that takes a Matrix and Observation and creates 14 Observations: one for each of the next 14 days, based on the initial matrix and observations
If you run your Forecast 1000 times with the same input, how many days does it rain on average? What are the minimum and maximum number of rainy days in a fortnight?
What's the name of the process you just implemented?

ANSWER: We need to validate that each line and column sum to one. Machine Learning


For Part 4, we're going to design a system with lots of moving parts.
Before decimalisation, British currency consisted of pounds (£), shillings (s) and pence (d).
There were 12 pence in a shilling and 20 shillings in a pound.
Currency was represented as £x.ys.zd where x is number of pounds, y is number of shillings and z is number of pence.  If pounds was absent, this could be written as y/z instead - if pence was 0, a dash (-) was used rather than the number 0.  If pounds and shillings were absent, price was stated as zd.
There were 9 coins: farthing (worth 0.25d), half penny (worth 0.5d), penny (1d), threepence (3d), sixpence (6d), shilling (1/-), florin (2/-), half-crown (2/6), crown (5/-).  There were three notes: sovereign (£1), two pounds (£2) and five pounds (£5).
Represent this currency in java, as individual units (e.g. Shilling vs Florin) and as a collection (e.g. in a CashFloat).  The collection should have a toString() method that represents the amount as described above.
If something costs £3.5s.10d, how many different ways of representing this amount are there?  Which is the most efficient?
Write a function that takes a currency amount (eg. a Price) and calculates the most efficient way to pay (or give change!) from a CashFloat

