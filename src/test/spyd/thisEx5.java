package test.spyd;

public class thisEx5 {
	
	void msg(thisEx5 t) {
		
		System.out.println("Message Method");
	}
	
	void test() {
		
		msg(this);
		
		System.out.println("Test method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisEx5 t=new thisEx5();
		
		t.test();

	}

}
