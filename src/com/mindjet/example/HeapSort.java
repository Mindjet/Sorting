package com.mindjet.example;

public class HeapSort {

	public static void main(String[] args) {
		
		

	}
	
	private void heapSort(int[] array) {
		 
		BuildMaxHeap(array);
		
		
		
		
	}
	
	private void BuildMaxHeap(int[] array) {
		
		for (int i = array.length-1; i >= 0; i--) {
			
			MaxHeapify(array, i, array.length);
			
		}
		
	}
	
	
	private void MaxHeapify(int[] array, int parentNodeIndex, int HeapSize) {
		
		int left_node_index = parentNodeIndex*2+1;
		int right_node_index = parentNodeIndex*2+2;
		int large_node_index = parentNodeIndex;
		
		if (left_node_index<=HeapSize&&array[left_node_index]>array[large_node_index]) {
			
			large_node_index = left_node_index;
			
		}
		
		if (right_node_index<=HeapSize&&array[right_node_index]>array[large_node_index]) {
			
			large_node_index = right_node_index;
			
		}
		
		if (large_node_index!=parentNodeIndex) {
			
			array[parentNodeIndex] = array[parentNodeIndex] + array[large_node_index];
			array[large_node_index] = array[parentNodeIndex] - array[large_node_index];
			array[parentNodeIndex] = array[parentNodeIndex] - array[large_node_index];
			
			MaxHeapify(array, large_node_index, HeapSize);
			
		}
		
		
	}
	

}
