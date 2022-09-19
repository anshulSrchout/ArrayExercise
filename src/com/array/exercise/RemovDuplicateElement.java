package com.array.exercise;

import java.util.*;

public class RemovDuplicateElement {
	public static void main(String[] args) {
		int index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of index = ");
		index = sc.nextInt(); 
		System.out.print("Enter 1st array = ");
		int[] arr = insertArrayValue(index);
		Arrays.sort(arr);
		index = removeDuplicate(arr, index);
		System.out.print("Rmoving Duplicates from given Array = ");
		for (int i = 0; i < index; i++)
            System.out.print(arr[i] + " ");
	}
	
	public static int[] insertArrayValue(int index) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[index];
		for(int i=0;i<index;i++) {
			array[i]=sc.nextInt();
		}
		return array;
	}
	
	public static int removeDuplicate(int[] arr, int index) {
		if (index == 0 || index == 1) {
            return index;
        }
		int[] temp = new int[index];  
        int j = 0;  
        for (int i=0; i<index-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[index-1];
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        } 
        arr[j++] = arr[index - 1];
        return j;
	}
}
