/*
 * Project Title : Homework 4-1. Sum Integer.
 * Author : Yonghwan Yim
 * Final Update : 2017.09.22
 */ 
package hw4_1;
import java.util.Scanner;

public class HW4_1 {

    public static void main(String[] args) {
        SumInteger suminteger = new SumInteger();
        suminteger.startSum();
    } 
}

class SumInteger 
{
    private int Sum, InputNumber, count;
    Scanner scan = new Scanner(System.in);
    
    SumInteger() { Sum = 0; count = 0; }
     
    public void startSum()
    {
        System.out.println("Enter a non-zero integer.\nWhen 0 is input, the sum of the integers is output and terminated.");
        while(true)
        {
            InputNumber = scan.nextInt();
            if(InputNumber == 0) break;
            Sum += InputNumber;
            count++;
        }
        System.out.println("Sum of " + count + " integers : " + Sum);
    }  
}