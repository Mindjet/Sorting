package com.mindjet.example;

public class BubbleSort {

	public static void main(String[] args) {
		
		//initial the array
		int array[] = ArrayHelper.generate(30);
		
		//bubble sorting by decrease
		for (int i = 0; i < array.length - 1; i++) {
			
			for (int j = i+1; j < array.length; j++) {
				
				if (array[j]>array[i]) {
					
					ArrayHelper.swap(array, i, j);
					
				}
				
			}
			
		}
		ArrayHelper.print(array);
		
		//bubble sorting by increase
		for (int i = 0; i < array.length - 1; i++) {
			
			for (int j = i+1; j < array.length; j++) {
				
				if (array[j]<array[i]) {
					
					ArrayHelper.swap(array, i, j);
					
				}
				
			}
			
		}
		ArrayHelper.print(array);
		
	}

}
