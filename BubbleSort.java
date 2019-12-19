package sortingAlgorithm;

public class BubbleSort {

	public BubbleSort(int [] arr) {
		int length = arr.length;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String [] args) {
		int [] arr = {5,4,3,2,1};
		BubbleSort b = new BubbleSort(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}
	}
}
