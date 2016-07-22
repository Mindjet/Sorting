package com.mindjet.example;

public class BubbleSort {

	public static void main(String[] args) {
		
		//initial the array
		int array[] = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*100);
		}
		array_printer(array);
		
		//bubble sort decrease
		for (int i = 0; i < array.length - 1; i++) {
			
			for (int j = i+1; j < array.length; j++) {
				
				if (array[j]>array[i]) {
					
					swap(array, i, j);
					
				}
				
			}
			
		}
		array_printer(array);
		
		//bubble sort increase
		for (int i = 0; i < array.length - 1; i++) {
			
			for (int j = i+1; j < array.length; j++) {
				
				if (array[j]<array[i]) {
					
					swap(array, i, j);
					
				}
				
			}
			
		}
		array_printer(array);
		
	}
	
	private static void swap(int array[], int i, int j){
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
	
	private static void array_printer(int array[]){
		
		for (int i : array) {
			System.out.print(i+" ");
		}
		
		System.out.println("");
		
	}

}
