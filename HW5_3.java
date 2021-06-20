/*
 * Project Title : Homework 5-3. Guess Game.
 * Author : Yonghwan Yim
 * Final Update : 2017.09.29
 */
package hw5_3;
import java.util.Scanner;

public class HW5_3 {
    private final GuessGame guessgame;
    HW5_3() { guessgame = new GuessGame(); }
    
    void gameStart() { guessgame.gameStart(); }

    public static void main(String[] args) {
        HW5_3 hw5_3 = new HW5_3();
        hw5_3.gameStart();
    }
}

class GuessGame
{
    private int nKeepAnswer = (int)(Math.random() * 100);
    private static int nArray[] = new int[21];
    private static int Index = 0;
    Scanner scan = new Scanner(System.in);
    
    void gameStart()
    {
        System.out.println("Please enter a integer between 0 and 100 inclusive.");
        while(Index < 20)
        {
            inputFilter();
            if(nArray[Index] == -1) continue;  // Range Error.
            if(compareAnswer())
            {
                System.out.println("You got it!");
                break;
            }
        }
        if(Index > 19) System.out.println("You failed!");
        printArray();
        bubbleSort(nArray);
        System.out.println("Bubble Sort!");
        printArray();
    }
    
    void inputFilter()
    {
        System.out.println("The " + (Index + 1) + "th input.");
        int nInput = scan.nextInt();
        if(nInput < 0 || nInput > 100)
        {
            System.out.println("Invalid input. Try again.");
            nArray[Index] = -1;   // '-1' -> // Range error code.
        }
        else nArray[Index++] = nInput;
    }
    
    boolean compareAnswer()
    {
        if (nKeepAnswer == nArray[Index - 1]) return true;
        else if (nKeepAnswer > nArray[Index - 1])
        {
            System.out.println("Guess bigger!\n");
            return false;
        }
        else
        {
            System.out.println("Guess smaller!\n");
            return false;
        }
    }
    
    void printArray()
    {
        System.out.print("Your Input : ");
        for(int i = 0; i < Index; i++)
            System.out.print(nArray[i] + " ");
        System.out.println();
    }
    
    void bubbleSort(int[] array)  // Call by Reference.
    {
        int tmp = 0, count = 0;
        while(true)
        {
            count = 0;  // Reset.
            for(int i = 0; i < (Index - 1); i++)
            {
                if(nArray[i] > nArray[i+1])
                {
                    tmp = nArray[i];
                    nArray[i] = nArray[i+1];
                    nArray[i+1] = tmp;
                    count++;
                }
            }
            if(count == 0) break;  // Escape Loop.
        }
    }
}
