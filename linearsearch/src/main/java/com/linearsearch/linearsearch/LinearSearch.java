package com.linearsearch.linearsearch;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){   
            	return i;    
	         } 
        }
        return -1;    
    }  
	public static void main(String a[]){    
        int[] arr; 
        Scanner scan = new Scanner(System.in);  
        System.out.println("Enter number of elements");  
        int n = scan.nextInt();   
        arr = new int[n];  
        System.out.println("Enter the  elements");  
        for (int c = 0; c < n; c++)  
           arr[c] = scan.nextInt();  
        System.out.println("Enter value to find");  
        int key = scan.nextInt();      
        System.out.println(key+" is found at index: "+linearSearch(arr, key));    
    }    
}
