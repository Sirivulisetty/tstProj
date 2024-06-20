package test.spyd;

class p3{
	
	p3(){
		
		System.out.println("Parent Class Constructor");

		
	}
	
}

public class superEx3 extends p3{
	
	superEx3(){
		
		super();
		
		System.out.println("Child Class Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		superEx3 s=new superEx3();
		
		

	}

}
