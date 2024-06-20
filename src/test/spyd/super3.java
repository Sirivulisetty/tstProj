package test.spyd;

class testSuper3{
	
	testSuper3(){
		
		System.out.println("Parent Class Constructor");
	}
	
}

public class super3 extends testSuper3 {
	
	super3(){
		
		super();
		
		System.out.println("child Class Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		super3 s=new super3();

	}

}
