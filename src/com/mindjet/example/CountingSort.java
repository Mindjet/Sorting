package com.mindjet.example;

public class CountingSort {
	
public static void main(String[] args) {
		
		
		//let the 10 be the max in the array
		int max = 100;
		int array[] = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*max);
		}

		ArrayHelper.print(array);
		
		//this array stores the amount of every digit
		//for example, if the number 10 appears 2 times in the array[]
		//then the count[10] = 2
		int []count = new int[max];
		for (int i = 0; i < array.length; i++) {
			count[array[i]]++;
		}
		
		//for example, if count[i] = j, it means that there are digits less than or equal to i
		//and the amount of these digits is j
		for (int i = 1; i < count.length; i++) {
			count[i] = count[i]+count[i-1];
		}
		
		//deposit the digit from the array[] to the array_sorted[] according to the amount of this digit
		int array_sorted[] = new int[20];
		for (int i = 0; i < array.length; i++) {
			
			array_sorted[count[array[i]]-1] = array[i];
			count[array[i]]--;
			
		}
		ArrayHelper.print(array_sorted);
		
	}

}
