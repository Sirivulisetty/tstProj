package test.spyd;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=20;
		
		a=a+b;//30;

		b=a-b;//10;
		
		a=a-b;//20;


		
		System.out.println("a = "+ a + "  "+ "b = " +b);

	}

}
