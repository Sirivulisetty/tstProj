package test.spyd;

class testSuper2{
	
	void msg() {
		
		System.out.println("Parent Class message Method");
	}
	
}

public class super2 extends testSuper2{
	

	void msg() {
		
		
		System.out.println("Child Class message Method");
	}
	
	void test() {
		
		super.msg();
		
		
		msg();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		super2 s=new super2();
		
		s.test();
		
		

	}

}
