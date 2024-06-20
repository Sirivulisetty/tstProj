package test.spyd;

interface testA{
	
	void display();
	
	void msg();
}

public class abstractionEx2 implements testA {
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Display Method");
		
	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		
		System.out.println("Test Method");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testA t=new abstractionEx2();
		
		t.display();
		
		t.msg();

	}

	
}
