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

		//一开始先建立最大堆
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

		//建立最大堆，需要对叶子节点上面的每一层都进行最大堆化
		for (int i = array.length/2; i >= 0; i--) {

			MaxHeapify(array, i, array.length);

		}

	}

	private void MaxHeapify(int[] array, int parentNodeIndex, int HeapSize) {

		int left_node_index = parentNodeIndex * 2 + 1;
		int right_node_index = parentNodeIndex * 2 + 2;
		int large_node_index = parentNodeIndex;
		
		//假若左节点存在且值比父节点大，那么将最大节点索引设置为左节点的索引
		if (left_node_index < HeapSize && array[left_node_index] > array[large_node_index]) {

			large_node_index = left_node_index;

		}
		
		//假若右节点存在且比最大节点值大，那么将最大节点索引设置为右节点的索引
		if (right_node_index < HeapSize && array[right_node_index] > array[large_node_index]) {

			large_node_index = right_node_index;

		}
		
		//若父节点与最大节点索引不同，说明需要进行交换以符合最大堆
		if (large_node_index != parentNodeIndex) {

			array[parentNodeIndex] = array[parentNodeIndex] + array[large_node_index];
			array[large_node_index] = array[parentNodeIndex] - array[large_node_index];
			array[parentNodeIndex] = array[parentNodeIndex] - array[large_node_index];
			
			//交换过后要检查（交换的）子节点以下是否也符合最大堆
			MaxHeapify(array, large_node_index, HeapSize);

		}

	}

}
