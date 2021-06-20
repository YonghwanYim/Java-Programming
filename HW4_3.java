/*
 * Project Title : Homework 4-3. Fibonacci Series.
 * Author : Yonghwan Yim
 * Final Update : 2017.09.22
 */ 
package hw4_3;
import java.util.Scanner;
// Use Java Collection Framework (JCF) to Make Memoization More Effective.
// HashMap is faster than list.
import java.util.HashMap;

public class HW4_3 {

    public static void main(String[] args) {
        FibonacciSeries fibonacciseries = new FibonacciSeries();
        fibonacciseries.startFibonacci();
    }
}

class FibonacciSeries {
    private final Fibonacci_Series fibonacci_series;
    
    public FibonacciSeries() { fibonacci_series = new Fibonacci_Series(); }
    public int getN() { return fibonacci_series.getN(); }
    public void startFibonacci() { fibonacci_series.startFibonacci(); }
}

class Fibonacci_Series
{
    private int N;
    // HashMap<key, value> arrayname = new HashMap<key, value>();
    // key and value are stored as a pair, key does not allow duplication.
    HashMap<Integer, Long> Cache = new HashMap<Integer, Long>();
    Scanner scan = new Scanner(System.in);
    
    int getN() { return N; }
    void readN()
    {
        System.out.println("Please enter an integer between 1 and 92. (To prevent overflow)");
        while(true)
        {
            N = scan.nextInt();
            if((N >= 1) && (N <= 92)) break;
            else System.out.println("Invalid input. Please enter 1 ~ 92.");
        }
    }   
    
    /* The simplest form of a recursive algorithm.
     * However, as n increases, the redundancy calculation exponentially increases.
    
    long reculsiveFibonacci(int n)
    {
        if(n < 3) return 1;
        else return (reculsiveFibonacci(n-1) + reculsiveFibonacci(n-2));
    }                                                                            */      
    
    // Therefore, dynamic programming using memoization can reduce the runtime!! 
    // The code below works very quickly.
    long cacheFibonacci(int n)
    {
        Cache.put(0, 0L); Cache.put(1, 1L); // Put initial value.
        return reculsiveFibonacci(n);
    }
    
    private long reculsiveFibonacci(int n)
    {
        if(Cache.containsKey(n)) return Cache.get(n);
        
        long value = reculsiveFibonacci(n-1) + reculsiveFibonacci(n-2);
        Cache.put(n, value);
        return value;
    }
    
    void startFibonacci()
    {
        readN();
        System.out.println(N + "th element of Fibonacci series : " + cacheFibonacci(N));
    }     
}