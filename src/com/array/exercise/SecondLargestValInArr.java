package com.array.exercise;

import java.util.Scanner;

public class SecondLargestValInArr {

	public static void main(String[] args) {
		int index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of index = ");
		index = sc.nextInt(); 
		System.out.print("Enter 1st array = ");
		int[] arr = insertArrayValue(index);
		System.out.println("Second Largest val: "+ largestVal(arr, index));
	}

	public static int[] insertArrayValue(int index) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[index];
		for(int i=0;i<index;i++) {
			array[i]=sc.nextInt();
		}
		return array;
	}
	
	public static int largestVal(int[] a, int index) {
		int temp;  
		for (int i = 0; i < index; i++)   
		        {  
		            for (int j = i + 1; j < index; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[index-2];
	}
}
