package com.array.exercise;

import java.util.*;

public class CompareTwoArray {
	public static int[] insertArrayValue(int index) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[index];
		for(int i=0;i<index;i++) {
			array[i]=sc.nextInt();
		}
		return array;
	}
	public static void main(String[] args) {
		int index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of index = ");
		index = sc.nextInt(); 
		System.out.print("Enter 1st array = ");
		int[] arr1 = insertArrayValue(index);
		System.out.print("Enter 2nd array = ");
		int[] arr2 = insertArrayValue(index);
		if (Arrays.equals(arr1, arr2))
            System.out.println("Array is Same");
        else
            System.out.println("Array is Not same");
	}
}
