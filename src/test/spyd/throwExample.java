package test.spyd;

public class throwExample {
	
	public static void validateAge(int age) {
		
		if(age<18) {
			
			throw new ArithmeticException("Person is not eligible to vote");
		}
		
		else {
			
			System.out.println("Person is eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		validateAge(15);
		

	}

}
