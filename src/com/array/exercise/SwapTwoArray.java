package com.array.exercise;

import java.util.*;

public class SwapTwoArray {

	public static void main(String[] args) {
		int index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of index = ");
		index = sc.nextInt(); 
		System.out.print("Enter 1st array = ");
		int[] arr1 = insertArrayValue(index);
		System.out.print("Enter 2nd array = ");
		int[] arr2 = insertArrayValue(index);
		for(int i = 0 ; i<arr1.length;i++){
            arr1[i] = arr1[i] - arr2[i];
            arr2[i] = arr1[i] + arr2[i];
            arr1[i] = GetAbsoluteValue(arr1[i] - arr2[i]);
        }
        System.out.println("arr1[] after swapping : "+Arrays.toString(arr2));
        System.out.println("arr2[] after swapping : "+Arrays.toString(arr2));
	}
	public static int[] insertArrayValue(int index) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[index];
		for(int i=0;i<index;i++) {
			array[i]=sc.nextInt();
		}
		return array;
	}
	public static int GetAbsoluteValue (int a){
        return Math.abs(a);
    }
}
