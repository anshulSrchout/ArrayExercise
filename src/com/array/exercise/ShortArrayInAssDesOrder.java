package com.array.exercise;

import java.util.Scanner;

public class ShortArrayInAssDesOrder {

	public static void main(String[] args) {
		int index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of index = ");
		index = sc.nextInt(); 
		System.out.print("Enter 1st array = ");
		int[] arr = insertArrayValue(index);
		System.out.print("Assecnding order from given Array = "+assOrder(arr)+"\n");
		System.out.print("Desending order from given Array = "+ desOrder(arr));

	}
	
	public static int[] insertArrayValue(int index) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[index];
		for(int i=0;i<index;i++) {
			array[i]=sc.nextInt();
		}
		return array;
	}
	
	public static int[] assOrder(int[] arr) {
		int[] array = arr;
		int temp;
		for (int i = 0; i < array.length; i++) {

			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
	
	public static int[] desOrder(int[] arr) {
		int[] array = arr;
		//int temp=arr[0];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(array[i]>=array[j])
					array[i]=array[j];
				
			}
		}
		return array;
	}
	
}
