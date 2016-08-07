package com.mindjet.example;

import java.util.Arrays;

public class HeapSort {

	public static void main(String[] args) {
		
		HeapSort heapSort = new HeapSort();
		
		int array[] = {8,6,3,1,5,7,4,2};
		System.out.println(Arrays.toString(array));
		
		heapSort.HeapSort(array);
		System.out.println(Arrays.toString(array));
		

	}

	private void HeapSort(int[] array) {

		//һ��ʼ�Ƚ�������
		BuildMaxHeap(array);

		for (int i = array.length; i > 1; i--) {

			array[0] = array[i - 1] + array[0];
			array[i - 1] = array[0] - array[i - 1];
			array[0] = array[0] - array[i - 1];

			System.out.println(Arrays.toString(array));
			
			MaxHeapify(array, 0, i - 1);

		}

	}

	private void BuildMaxHeap(int[] array) {

		//�������ѣ���Ҫ��Ҷ�ӽڵ������ÿһ�㶼�������ѻ�
		for (int i = array.length/2; i >= 0; i--) {

			MaxHeapify(array, i, array.length);

		}

	}

	private void MaxHeapify(int[] array, int parentNodeIndex, int HeapSize) {

		int left_node_index = parentNodeIndex * 2 + 1;
		int right_node_index = parentNodeIndex * 2 + 2;
		int large_node_index = parentNodeIndex;
		
		//������ڵ������ֵ�ȸ��ڵ����ô�����ڵ���������Ϊ��ڵ������
		if (left_node_index < HeapSize && array[left_node_index] > array[large_node_index]) {

			large_node_index = left_node_index;

		}
		
		//�����ҽڵ�����ұ����ڵ�ֵ����ô�����ڵ���������Ϊ�ҽڵ������
		if (right_node_index < HeapSize && array[right_node_index] > array[large_node_index]) {

			large_node_index = right_node_index;

		}
		
		//�����ڵ������ڵ�������ͬ��˵����Ҫ���н����Է�������
		if (large_node_index != parentNodeIndex) {

			array[parentNodeIndex] = array[parentNodeIndex] + array[large_node_index];
			array[large_node_index] = array[parentNodeIndex] - array[large_node_index];
			array[parentNodeIndex] = array[parentNodeIndex] - array[large_node_index];
			
			//��������Ҫ��飨�����ģ��ӽڵ������Ƿ�Ҳ��������
			MaxHeapify(array, large_node_index, HeapSize);

		}

	}

}
