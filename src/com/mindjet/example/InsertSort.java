package com.mindjet.example;

public class InsertSort {
	
	public static void main(String[] args) {

		int array[] = ArrayHelper.generate(20);
				
				
		// insert sorting by increase
		int temp;
		for (int i = 1; i < array.length; i++) {

			temp = i;
			for (int j = i - 1; j >= 0; j--) {

				if (array[j] > array[i]) {

					ArrayHelper.swap(array, i, j);
					i--;

				}

			}
			i = temp;

		}
		ArrayHelper.print(array);
		
		// insert sorting by decrease
		for (int i = 1; i < array.length; i++) {

			temp = i;
			for (int j = i - 1; j >= 0; j--) {

				ArrayHelper.swap(array, i, j);
				i--;

			}

			i = temp;

		}
		ArrayHelper.print(array);

	}

}
