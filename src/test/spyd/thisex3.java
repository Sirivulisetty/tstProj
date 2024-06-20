package test.spyd;
class thistest2{
	
	void msg() {
		
		System.out.println("Parent Class Method");
	}
}
public class thisex3 extends thistest2{
	

	void msg() {
		
		System.out.println("Child Class Method");
	}
	
	void display() {
		
		this.msg();
		
		super.msg();
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisex3 t=new thisex3();
		
		t.display();

	}

}
