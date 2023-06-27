package series;

public class Series {

	public static void printNno(int n) {

		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

	public static void sumOfN(int n) {

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
	}

	public static void oddNo(int n) {
		int count = 1;
		for (int i = 1; i <= n; i++) {
			if (count % 2 != 0) {
				System.out.println(count);
			}
			count += 2;
		}
	}

	public static void evenNo(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(2 * i);
		}
	}

	public static void fibonacci(int n) {
		int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(a + b);
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}

	}

	public static void primeNo(int n) {
		int count = 0;
		int num = 2;
		while (count < n) {
			if (checkPrime(num) == true) {
				System.out.println(num);
				count++;
			}
			num++;
			
		}
		

	}

	public static Boolean checkPrime(int num) {
		for(int i=2; i<num;i++) {
		if (num % i == 0) {
			return false;
			}
		}
	
		return true ;
	}

	public static void main(String[] args) {
		int n = 10;
		printNno(n);
		System.out.println("\n");

		sumOfN(n);
		System.out.println("\n");

		oddNo(n);
		System.out.println("\n");

		evenNo(n);
		System.out.println("\n");

		fibonacci(n);
		System.out.println("\n");
		
		primeNo(n);
	}

}
