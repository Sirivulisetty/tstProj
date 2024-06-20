package test.spyd;

class single{
	
	int a=10;
	
	void test() {
		
		System.out.println("Parent class");
	}
	
}

public class singleInheritance extends single {
	
	void display() {
		
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		singleInheritance s=new singleInheritance();
		
		s.test();
		
		s.display();
		
		System.out.println(s.a);

	}

}
