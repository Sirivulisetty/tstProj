package test.spyd;
class p2{
	
	void msg()
	{
		
		System.out.println("Parent Class Msg method");
	}
	
}
public class superEx2 extends p2{
	
	
	void msg()
	{
		
		System.out.println("Child Class Msg method");
	}
	
	void test() {
		
		super.msg();
		
		msg();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		superEx2 s=new superEx2();
		
		s.test();

	}

}
