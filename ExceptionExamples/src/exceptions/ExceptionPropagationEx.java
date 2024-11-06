package exceptions;

public class ExceptionPropagationEx {
	public static void main(String[] args) throws ArithmeticException{
		try {
		System.out.println("Exception Propagation...........");
		method1();
		}
		catch(ArithmeticException a) {
			System.out.println(a.getMessage());
		}
	}
	public static void method1() throws ArithmeticException{
		System.out.println("method1 block...........");
		method2();
	}
	public static void method2() throws ArithmeticException{
		System.out.println("method2 block...............");
		method3();
	}
	public static void method3() {
		System.out.println("Method3 block................");
		int b=12/0;
		System.out.println(b);
	}

}
