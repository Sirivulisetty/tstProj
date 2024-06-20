package test.spyd;

public class throwsEx {
	
	static void divideNo() throws ArithmeticException{
		
		try {
			
			int a=10/2;
		}
		
		catch(ArithmeticException e) {
			
			System.out.println(e);
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		divideNo();

	}

}
