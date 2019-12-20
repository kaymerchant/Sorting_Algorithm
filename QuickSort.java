package sortingAlgorithm;

class QuickSort {
	
	public QuickSort(int [] arr) {
		int low = 0;
		int high = arr.length - 1;
		quickSort(arr, low, high);
	}
	
	public void quickSort(int [] arr, int low, int high) {
		if(low < high) {
			
			int pi = partition(arr, low, high);
			
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	
	public int partition(int [] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		
		for(int j = low; j < high; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i + 1;
	}
	
	public static void main(String [] args) {
		int [] arr = {5,4,3,2,1};
		QuickSort q = new QuickSort(arr);
		
		for(int i: arr) {
			System.out.println(i);
		}
	}
}

