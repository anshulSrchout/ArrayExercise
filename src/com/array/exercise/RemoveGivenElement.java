package com.array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveGivenElement {

	public static void main(String[] args) {
		int index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of index = ");
		index = sc.nextInt(); 
		System.out.print("Enter 1st array = ");
		int[] arr = insertArrayValue(index);
		System.out.print("Enter Removing no = ");
		int removeNo = sc.nextInt();
		for(int i=0;i<index;i++) {
			if(removeNo == arr[i])
				arr[i]=arr[i + 1];
		}
		System.out.print("Removing Element = "+Arrays.toString(arr));
	}

	public static int[] insertArrayValue(int index) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[index];
		for(int i=0;i<index;i++) {
			array[i]=sc.nextInt();
		}
		return array;
	}
}
