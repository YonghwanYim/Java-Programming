/*
 * Project Title : Homework 4-2. Sum Odd Number.
 * Author : Yonghwan Yim
 * Final Update : 2017.09.22
 */ 
package hw4__2;
import java.util.Scanner;

public class HW4__2 {

    public static void main(String[] args) {
        OddNumber oddnumber = new OddNumber();
        oddnumber.sumOddNumber();
    }
}

class OddNumber {
    private int Sum, N;
    Scanner scan = new Scanner(System.in);
    
    OddNumber() { Sum = 0; }    
    private void readN()
    {
        System.out.print("If N is input, the sum of odd numbers from 1 to N is output.\nN : ");
        do
        {
            N = scan.nextInt();
            if(N < 1) System.out.println("Invalid input. Please enter an integer greater than or equal to 1.");
        }while(N < 1);
    }
    
    private int sumOdd(int n)
    {
        for(int i = 0; i <= n; i++)
        {
            if((i % 2) == 0) continue;
            Sum += i;
        }
        return Sum;
    }
    
    public void sumOddNumber()
    {
        readN();
        System.out.println("Odd Sum : " + sumOdd(N));
    }
}