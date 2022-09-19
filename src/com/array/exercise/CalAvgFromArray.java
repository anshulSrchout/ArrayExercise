package com.array.exercise;

import java.util.Scanner;

public class CalAvgFromArray {

	public static void main(String[] args) {
		int index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of index = ");
		index = sc.nextInt(); 
		System.out.print("Enter 1st array = ");
		int[] arr = insertArrayValue(index);
		System.out.print("Average from given Array = "+calAvg(arr));
	}
	
	private static float calAvg(int[] arr) {
		int avg=0, tot=0;
		for(int i=0;i<arr.length;i++) {
			tot=tot+arr[i];
		}
		avg=tot/arr.length;
		return avg;
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
