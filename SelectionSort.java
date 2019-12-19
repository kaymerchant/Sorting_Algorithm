package sortingAlgorithm;

public class SelectionSort {

	public SelectionSort(int [] arr) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			int min_index = i;
			for(int j = i + 1; j <arr.length; j++) {
				if(arr[i] > arr[j]) {
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}
}