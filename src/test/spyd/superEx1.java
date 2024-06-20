package test.spyd;

class parent{
	
	int a=10;
	
	int b=20;
	
	
}

public class superEx1 extends parent {
	
	int a=20;
	
	void msg() {
		
		System.out.println(super.a);
		
		System.out.println(super.b);
		
		System.out.println(a);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		superEx1 s=new superEx1();
		
		s.msg();

	}

}
