package sorting;

public class BubbleSort {
	
public static void bubbleSort(int[] arr) {
	for(int i=0; i<arr.length-1 ; i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				arr[j] = arr[j] + arr[j+1];
				arr[j+1] = arr[j] - arr[j+1];
				arr[j] = arr[j] - arr[j+1];
			}
		
		}	
	}
}

	public static void main(String[] args) {
		
		int arr[] = {4,6,8,3,9,-1,5,2};
		
		bubbleSort(arr);
		
		for(int i =0 ;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}

}
