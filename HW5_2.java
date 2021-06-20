/*
 * Project Title : Homework 5-2. Matrix Handling;
 * Author : Yonghwan Yim
 * Final Update : 2017.09.29
 */
package hw5_2;

public class HW5_2 {
    private Matrix matrix;
    
    HW5_2() { matrix = new Matrix(); }
    int[][] getMatrix1() { return matrix.getMatrix1(); }
    int[][] getMatrix2() { return matrix.getMatrix2(); }
    public void calculateMatrix() { matrix.calculateMatrix(); }
    public void setMatrix(int mat1[][], int mat2[][]) { matrix.setMatrix(mat1, mat2); }
 
    public static void main(String[] args) {
        HW5_2 hw5_2 = new HW5_2();
        int mat1[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int mat2[][] = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        hw5_2.setMatrix(mat1, mat2);
        hw5_2.calculateMatrix();
    }
}

class Matrix
{
    private int matrix1[][] = new int[3][3];
    private int matrix2[][] = new int[3][3];
    int[][] getMatrix1() { return matrix1; }   
    int[][] getMatrix2() { return matrix2; }

    void setMatrix(int mat1[][], int mat2[][]) { matrix1 = mat1; matrix2 = mat2; }    
    
    void calculateMatrix()
    {
        System.out.println("Matrix 1.");
        printMatrix(matrix1);
        System.out.println("Matrix 2.");
        printMatrix(matrix2);
        System.out.println("Sum");
        printMatrix(sumMatrix(matrix1, matrix2));
        System.out.println("Multi");
        printMatrix(multiMatrix(matrix1, matrix2));   
    }
    
    private int[][] sumMatrix(int mat1[][], int mat2[][])
    {
        int sumTmp[][] = new int[3][3];
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                sumTmp[i][j] = mat1[i][j] + mat2[i][j];
        return sumTmp;
    }
    
    private int[][] multiMatrix(int mat1[][], int mat2[][])
    {
        int multiTmp[][] = new int[3][3];
        int sumTmp = 0;
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                for(int k = 0; k < 3; k++)
                    multiTmp[i][j] += (mat1[i][k] * mat2[k][j]);
        return multiTmp;
    }
    
    private void printMatrix(int mat[][])
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
                System.out.print(mat[i][j] + " "); 
            System.out.println(); 
        }
    }
}
