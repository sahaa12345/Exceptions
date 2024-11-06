package exceptions;

public class AgeValidator {
	public static void valiadateAge(int age) throws InvalidAgeException {
		if(age<0||age>120) {
			throw new InvalidAgeException("Age is invalid : age is must in between 0 and 120.");
		}
		System.out.println("Age is valid : "+age);
	}

}
