package test.spyd;

public class AndOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		
		int b=10;
		
		int c=15;
		
		System.out.println((a>b) && (++b>c));
		
		System.out.println(b);//10
		
		System.out.println((a>b) & (++b>c));
		
		System.out.println(b);//11
		
		
		

	}

}
