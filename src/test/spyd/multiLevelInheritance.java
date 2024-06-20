package test.spyd;

class TestX{
	
	void msg() {
		
		System.out.println("Msg method");
		
		
	}
}

class TestY extends TestX{
	
	void display() {
		
		System.out.println("Display method");
	}
	
}

public class multiLevelInheritance extends TestY {
	
	void test() {
		
		System.out.println("Test method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		multiLevelInheritance m=new multiLevelInheritance();
		
		m.msg();
		
		m.display();
		
		m.test();

	}

}
