package exceptions;

public class NestedTryBlockEx {
	public static void main(String[] args) {
		System.out.println("Nested Try Block Example");
		try {
		int a[]= {1,2,3,4};
		System.out.println(a[7]);
		System.out.println("java");
		try {
		int b=a[2]/0;
		System.out.println(b);
		}
		catch(ArithmeticException ae) {
			ae.getMessage();
		}
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			ai.getMessage();
		}
		System.out.println("Exception................");
		
	}

}
