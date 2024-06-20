package test.spyd;

class test1{
	
	
	int a=15;
	
	
}

class testsuper1 extends test1{
	
	int a=10;
	
	void test() {
		
		System.out.println(super.a);
	}
	
}
public class super1 extends testsuper1 {
	
	int a=20;
	
	
	void display() {
		
		//System.out.println(a);
		
		System.out.println(super.a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		super1 s=new super1();
		
		s.display();
		
		s.test();

	}

}
