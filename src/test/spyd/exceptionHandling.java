package test.spyd;

public class exceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int s=10/2;
			
			System.out.println(s);
		}
		
		catch(ArithmeticException e) {
			
			System.out.println(e);
		}
		
		finally {
			
			System.out.println("Finally Block");
		}

	}

}
