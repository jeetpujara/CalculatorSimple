package com.practice;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array=new int[] {1,2,3,4,5};
		System.out.println("Original Array: ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("Array in Reverse order: ");
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
	}
}
