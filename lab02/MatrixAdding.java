package lab02;

import java.util.Scanner;

public class MatrixAdding {
	public static void main(String[] args) {
       int[][] matrix1 = new int[10000][10000];
       int[][] matrix2 = new int[10000][10000];
       System.out.println("Input the size of two array: ");
       Scanner s = new Scanner(System.in);
       int size = s.nextInt();
       System.out.println("Input the matrix 1: ");
       for(int i = 0; i < size; i++) {
    	   for(int j = 0; j < size; j++) {
    		   matrix1[i][j] = s.nextInt();
    	   }
       }
       System.out.println("Input the matrix 2: ");
       for(int i = 0; i < size; i++) {
    	   for(int j = 0; j < size; j++) {
    		   matrix2[i][j] = s.nextInt();
    	   }
       }
       int[][] sum = new int[size][size];
       for(int i = 0; i < size; i++) {
    	   for(int j = 0; j < size; j++) {
    		   sum[i][j] += matrix1[i][j] + matrix2[i][j];
    	   }
       }
       System.out.println("The sum of 2 matrices is: ");
       for(int i = 0; i < size; i++) {
    	   for(int j = 0; j < size; j++) {
    		   System.out.print(sum[i][j] + " ");
    	   }
    	   System.out.println();
       }
	} 
}
