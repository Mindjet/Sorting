package com.mindjet.example;

public class SelectSort {
	
	public static void main(String[] args) {
		
		
//		initial the array
		int array[] = ArrayHelper.generate(20);
		
		//select sorting by increase
		int min = 0;
		for (int i = 0; i < array.length - 1; i++) {
			
			min = i;	//min is the index of the minimum, we assume it is the first index at the beginning of every round
			
			for (int j = i+1; j < array.length; j++) {
				
				if (array[min]>array[j]) {
					min = j;	//save the index of the minimum
				}
				
			}
			
			ArrayHelper.swap(array, min, i);	//the minimum is moved to the first place and piled up
			
		}
		
		ArrayHelper.print(array);
		
		//select sorting by decrease
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			
			max = i;
			
			for (int j = i+1; j < array.length; j++) {
				
				if (array[max]<array[j]) {
					max = j;
				}
				
			}
			
			ArrayHelper.swap(array, max, i);
			
		}
		ArrayHelper.print(array);
		
	}
	
}
