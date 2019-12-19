package sortingAlgorithm;

public class MergeSort {
	public MergeSort(int [] arr) {
		int length = arr.length;
		mergeSort(arr, length);
	}
	
	private void mergeSort(int [] arr, int length) {
		if(length < 2) {
			return;
		}
		
		int mid = length/2;
		int [] left = new int [mid];
		int [] right = new int[length - mid];
		
		for(int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		
		for(int i = mid; i < length; i++) {
			right[i - mid] = arr[i];
		}
		
		mergeSort(left, mid);
		mergeSort(right, length - mid);
		merge(arr, left, right, mid, length - mid);
	}

	private void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right) {
		 int i = 0;
		 int j = 0;
		 int k = 0;
		 
		 while(i < left && j < right) {
			 if(leftArr[i] <= rightArr[i]) {
				 arr[k++] = leftArr[i++];
			 }
			 else {
				 arr[k++] = rightArr[j++];
			 }
		 }
		 
		while(i < left) {
			arr[k++] = leftArr[i++];
		}
		
		while(j < right) {
			arr[k++] = rightArr[j++];
		}
	}
	
	public static void main(String [] args) {
		int [] a = {5,4,3,2,1};
		
		MergeSort m = new MergeSort(a);
		for(int i : a) {
			System.out.println(i);
		}
		}
	}

