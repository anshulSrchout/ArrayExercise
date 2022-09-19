package com.array.exercise;
import java.util.*;

public class AdditionOfTwoArrays {
	
	public static void main(String[] args) {
		int index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of index = ");
		index = sc.nextInt(); 
		System.out.print("Enter 1st array = ");
		int[] arr1 = insertArrayValue(index);
		System.out.print("Enter 2nd array = ");
		int[] arr2 = insertArrayValue(index);
		System.out.print("Display 1st array = ");
		displayArrayValue(arr1);
		System.out.print("Display 2nd array = ");
		displayArrayValue(arr2);
		System.out.print("Addition of two array = ");
		int[] array = additionOfTwoArray(arr1,arr2,index);
		displayArrayValue(array);
	}
	public static int[] insertArrayValue(int index) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[index];
		for(int i=0;i<index;i++) {
			array[i]=sc.nextInt();
		}
		return array;
	}
	public static void displayArrayValue(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}
	public static int[] additionOfTwoArray(int[] arr1,int[] arr2, int index) {
		int[] array = new int[index];
		for(int i=0;i<array.length;i++) {
			array[i]=arr1[i]+arr2[i];
		}
		return array;
	}
}
