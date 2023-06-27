package sorting;

public class InsertionSort {

	public static void main(String[] args) {

		int arr [] = {2,3,6,1,0,-1,12,46,1,9,12,4,6,2,5};
		int n = arr.length;
		sort(arr, n);
		
		System.out.println("\nSorted array is:");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void sort(int [] arr, int n) {
		for(int i=0; i<n-1; i++) {
			int j = i;
			int value = arr[j+1];
			while(j>=0 && arr[j]>value) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = value;
		}
	}

}
