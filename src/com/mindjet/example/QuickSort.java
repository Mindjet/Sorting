package com.mindjet.example;

public class QuickSort {

	public static void main(String[] args) {

		int[] array = ArrayHelper.generate(20);

		quick_sort(array, 0, array.length - 1);

		ArrayHelper.print(array);

	}

	private static void quick_sort(int[] array, int left, int right) {

		int boundary;

		if (left < right) {

			boundary = partition(array, left, right);
			
			quick_sort(array, left, boundary - 1);
			quick_sort(array, boundary + 1, right);

		}

	}
	
	/**
	 * �Դ��������ȡ��һ��ֵΪ��׼���ֳ������������ҷ����������ı߽��±�
	 * @param array
	 * @param left
	 * @param right
	 * @return �߽��±�
	 */
	
	private static int partition(int array[], int left, int right) {

		int pivot = array[left];

		while (left < right) {
			
			while (left < right && pivot <= array[right])
				right--;

			if (left < right) {
				
				array[left] = array[right];
				left++;
			}

			while (left < right && pivot >= array[left])
				left++;

			if (left < right) {

				array[right] = array[left];
				right--;

			}

		}

		array[left] = pivot;
		return left;

	}

}
