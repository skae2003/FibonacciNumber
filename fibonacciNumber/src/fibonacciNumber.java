
public class fibonacciNumber {

	public static void main(String[] args) {
		
		System.out.println(fib(6));

	}
	
	public static int fib(int n) {
		
		if(n == 0) {
			
			return 0;
			
		}
		if(n == 1) {
			
			return 1;
			
		}
		if(n == 2) {
			
			return 1;
			
		}
		
		return fib(n-2) + fib(n-1);
		
	}

}
