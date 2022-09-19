package com.array.exercise;
import java.util.*;

public class ArrayElementsAdd {

	static void concateArray(){
		int[] arr1 = {10, 15, 12, 14};
		int[] arr2 = {20, 2, 32, 32};
		//Scanner sc = new Scanner(System.in);
		System.out.print("Before Adding element of Array list = \n");
		System.out.print("1st Array = "+Arrays.toString(arr1)+"\n");
		System.out.print("2nd Array = "+Arrays.toString(arr2)+"\n");
		int temIndex= arr1.length+arr2.length;
		int[] array = new int[temIndex];
		
		for(int i=0;i<array.length-1;i++)
		{
			if(0<=arr1.length-1)
				array[i]=arr1[i];
			else
				array[i]=arr2[i];
		}
//		for(int i=arr1.length+1;i<temIndex;i++)
//		{
//			array[i]=arr2[i];
//		}
		System.out.print("\nAfter Adding element of Array list ");
		System.out.print(Arrays.toString(array));
	}

	public static void main(String[] args) {
		concateArray();
	}

}
