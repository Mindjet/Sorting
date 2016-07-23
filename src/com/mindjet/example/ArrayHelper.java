package com.mindjet.example;

import java.util.Arrays;

public class ArrayHelper {
	
	public static void print(int array[]){
		
		System.out.println(Arrays.toString(array));
		
	}
	
	public static void swap(int array[], int i, int j){
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
	
	public static int[] generate(int num){
		
		int array[] = new int[num];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*100);
		}
		
		print(array);
		return array;
		
	}

}
