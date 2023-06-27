package sorting;

public class SelectinSort {

	public static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int minValue = arr[i];
			int minValueIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < minValue) {
					minValue = arr[j];
					minValueIndex = j;
				}

			}
			if (i != minValueIndex) {
				arr[i] = arr[i] + arr[minValueIndex];
				arr[minValueIndex] = arr[i] - arr[minValueIndex];
				arr[i] = arr[i] - arr[minValueIndex];

			}
		}

	}

	public static void main(String[] args) {

		int arr[] = { 2, 8, 4, -1, 7, 10, 5, 6 };

		selectionSort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
