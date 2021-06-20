/*
 * Project Title : Generate 10 numbers
 * Author : Yonghwan Yim
 * Final Update : 2017.10.16
 */
package hw7_1;
import java.util.Random;

public class HW7_1 {
    int[] numarr = new int[10];   // Store 10 numbers.
    int[] frequency = new int[5]; // To count the same number.
    Random rnd = new Random();
    
    private void randomGenerator()
    {
        for(int i = 0; i < 10; i++)
            numarr[i] = rnd.nextInt(5) + 1;
    }
    
    private void countFrequency()
    {
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 10; j++)
                if((i+1) == numarr[j])
                    frequency[i] += 1;            
        }
    }
    
    private void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public void run()
    {
        System.out.println("Start");
        randomGenerator();
        countFrequency();
        System.out.println("\nGenerated Numbers");
        printArray(numarr);
        System.out.println("\nFrequency\n1 2 3 4 5");
        printArray(frequency);
    }
 
    public static void main(String[] args) {
        HW7_1 test = new HW7_1();
        test.run();
    }
}
