package test.spyd;


class TestZ{
	
void msg() {
		
		System.out.println("Msg method");
		
		
	}
	
}

class hierarchicalInheritance2 extends TestZ{
	
void display() {
		
		System.out.println("Display method");
	}
	
	
}

public class hierarchicalInheritance extends TestZ {
	
void test() {
		
		System.out.println("Test method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		hierarchicalInheritance h=new hierarchicalInheritance();
		
		h.msg();
		
		h.test();
		
		hierarchicalInheritance2 h2=new hierarchicalInheritance2();
		
		h2.msg();
		
		h2.display();
	}

}
