package test.spyd;

abstract class abEx1{
	
	abstract void msg();
	
	void display() {
		
		System.out.println("Display Method");
	}
}

public class abstractEx1 extends abEx1 {
	
	@Override
	void msg() {
		// TODO Auto-generated method stub
		
		System.out.println("Msg method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abEx1 a=new abstractEx1();
		
		a.display();

		a.msg();
		
	}

	

}
