/*
 * Project Title : Multiply two matrices with size 5X5.
 * Author : Yonghwan Yim
 * Final Update : 2017.10.16
 */
package hw7_2;
import java.util.*;

public class HW7_2 {
    private final CalculateMatrix calculatematrix;
    
    HW7_2() { calculatematrix = new CalculateMatrix(); } // Constructer.
    void run() { calculatematrix.run(); }

    public static void main(String[] args) {
        HW7_2 test = new HW7_2();
        test.run();
    }
}

class Matrix
{
    int[][] matrix = new int[5][5];
    Scanner scan = new Scanner(System.in);
    
    void setMatrix()
    {
        while(true)
        {
            System.out.println("Please enter 25 integers.\nEx. 5 6 7 8 ...");
            String inputstr = scan.nextLine(); 
            String[] tmpmatrix = inputstr.split(" "); // Classify data by spacing (Use Split Method)
            
            if(tmpmatrix.length > 25)  // Exception that try-catch does not catch.
            {
                System.out.println("Entered more than 25. Try Again\n");
                continue;
            }
            
            try  // Converts to int type and assigns it.
            {
                for(int i = 0; i < 5; i++)
                    for(int j = 0; j < 5; j++)
                        matrix[i][j] = Integer.valueOf(tmpmatrix[(5 * i)+j]);
                break;
            }
            catch(Exception e)
            {
                System.out.println("Invalid Input! Try Again");
                System.out.println("Error code -> " + e.getMessage() + "\n");
            }
        }
    }
    
    void printMatrix()
    {
        System.out.println();
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
            }
        System.out.println();
    }
}

class CalculateMatrix
{
    private Matrix mat1, mat2, result;
    
    CalculateMatrix() { mat1 = new Matrix(); mat2 = new Matrix(); result = new Matrix();}
    
    void run()
    {
        System.out.println("Start the matrix multiplication program.");
        System.out.println("\n###########\nMatrix 1\n###########");
        mat1.setMatrix();
        mat1.printMatrix();
        System.out.println("\n###########\nMatrix 2\n###########");
        mat2.setMatrix();
        mat2.printMatrix();
        System.out.println("\n###########\nThe Product of Two Matrix\n###########");
        Multi(mat1, mat2);
        result.printMatrix();
    }
    
    private void Multi(Matrix mat1, Matrix mat2)
    {
        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 5; j++)
                for(int k = 0; k < 5; k++)
                    result.matrix[i][j] += mat1.matrix[i][k] * mat2.matrix[k][j];
    }
}