package pattern;

public class pattern {

	public static void main(String[] args) {
		int n = 6;

		printLeftTriangle(n);
		System.out.println("\n");
		printLeftInvertedTriangle(n);
		System.out.println("\n");
		printLeftNo(n);
		System.out.println("\n");
		printLefto(n);
		System.out.println("\n");
		printRightTriangle(n);
		printRightInvertedTriangle(n);
	}

//	*
//	**
//	***
//	****
//	*****
	private static void printLeftTriangle(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

//	*****
//	****
//	***
//	**
//	*
	private static void printLeftInvertedTriangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - 1; j++) {
				System.out.print("1");
			}
			System.out.println();
		}
	}

	private static void printLeftNo(int n) {
		int count = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i - 1; j++) {
				System.out.print(count++);
			}
			System.out.println();
		}
	}

	private static void printLefto(int n) {

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	private static void printRightTriangle(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++) {
				System.out.print("*");

			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void printRightInvertedTriangle(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < n-i; k++) {
				System.out.print("*");

			}for (int j = i; j < n - 1; j++) {
				System.out.print("*");
			}System.out.println();
		}
	

}}
