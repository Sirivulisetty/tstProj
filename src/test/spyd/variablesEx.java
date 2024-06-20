package test.spyd;

public class variablesEx {
	
	
	static int c=30;
	
	int a=10;//Instance Variable
	
	void msg() {
		
		int b=20;//local variable
		
		System.out.println(b);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		variablesEx v=new variablesEx();
		
		System.out.println(v.a);
		
		v.msg();
		
		System.out.println(variablesEx.c);
	}

}
