/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author sanchit
 */

public class ProceduralAbstraction {

    //Requires: None
    //Modifies: None
    //Effects: Returns the factorial of any positive integer x
    private static int factorial(int x) {
        int factorial = 1; 
        for (int y = 1; y <= x; y++) 
            factorial *= y;
        return factorial;
    }

    //Requires: None
    //Modifies: None
    //Effects: Returns the smallest positive integer n for which n!
    // is greater than or equal to x, for positive integer x.
    // Otherwise returns 1.
    public static int reverseFactorial(int x) {
        int n;
        for(n = 1; factorial(n) < x; n++); 
        return n; 
    }
    
    //Requires: None
    //Modifies: None
    //Effects: If the matrix arr satisfies Nice property, prints the sum and
    // returns true. Otherwise returns false.
    public static boolean isMatrixNice(int[][] arr)
    {
        int length = arr.length;           
        for (int i = 0; i < length; i++)
        {
            if (arr[i].length != length) 
                return false; 
        }        
        int sum = 0;         
        for (int i = 0; i < length; i++) 
            sum += arr[i][i];                
        for (int i = 0; i < length; i++)
        {
            int rowSum = 0; 
            int colSum = 0;
            for (int j = 0; j < length; j++)
            {
                rowSum += arr[i][j]; 
                colSum += arr[j][i];
            }
            
            if (rowSum != sum || colSum != sum)
                return false;
        }
        int diag1Sum = 0;
        int diag2Sum = 0;
        for (int i = 0; i < length; i++)
        {
            diag1Sum += arr[i][i]; 
            diag2Sum += arr[i][length - i - 1]; 
        }       
        if (diag1Sum != sum || diag2Sum != sum)
            return false;       
        System.out.println("Sum of the matrix: " + sum); 
        return true;
    }

    public static void main(String[] args) {    
        System.out.println("**Test**");
        System.out.println("The reverse factorial of 24 is " + reverseFactorial(24));
        System.out.println("The reverse factorial of 119 is " + reverseFactorial(119));
        int[][] matrix1  // Nice matrix
                = {
                    {2, 7, 6},
                    {9, 5, 1},
                    {4, 3, 8}
                };
        int[][] matrix2  // Not nice matrix
                = {
                    {-3, 1, 0},
                    {4, -3, 4},
                    {7, -9, 0}
                };
        System.out.println(isMatrixNice(matrix1));
        System.out.println(isMatrixNice(matrix2));
    }
}
