package lab02;

import java.util.Scanner;

public class Array {
	public static int partition(int[] intArray, int low, int high) {
		  int pi = intArray[high];  
	        int i = (low-1); // smaller element index   
	        for (int j=low; j<high; j++) { 
	            // check if current element is less than or equal to pi 
	            if (intArray[j] <= pi) { 
	                i++; 
	                // swap intArray[i] and intArray[j] 
	                int temp = intArray[i]; 
	                intArray[i] = intArray[j]; 
	                intArray[j] = temp; 
	            } 
	        } 
	   
	        // swap intArray[i+1] and intArray[high] (or pi) 
	        int temp = intArray[i+1]; 
	        intArray[i+1] = intArray[high]; 
	        intArray[high] = temp; 
	   
	        return i+1; 
	}
	public static void quickSort(int[] arr, int l, int h) {
		if(l <= h) {
			int pi = partition(arr, l, h);
			quickSort(arr, l, pi - 1);
			quickSort(arr, pi + 1, h);
		}
	}
	
	public static void main(String[] args) {
       int[] arr = new int[10000];
       Scanner key = new Scanner(System.in);
       int n = key.nextInt();
       for(int i = 0; i < n; i++) {
    	   arr[i] = key.nextInt();
       }
       int sum = 0;
       for(int i = 0; i < n; i++) {
    	   sum += arr[i];
       }
       System.out.println("The sum of the array is: " + sum);
       quickSort(arr, 0, n - 1);
       System.out.println("The array after being sorted: ");
       for(int i = 0; i < n; i++) {
    	   System.out.print(arr[i] + " ");
       }
       System.out.println();
       if(n %2 == 1) {
    	   System.out.println("The average value of the array is: " + arr[n/2]);
       }
       else {
    	   System.out.println("The average value of the array is " + ((Double.valueOf(arr[n/2]) + Double.valueOf(arr[n/2-1]))/2));
       }
       
	}
	
}
