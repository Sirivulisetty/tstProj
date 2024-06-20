package test.spyd;

class testthis4{
	
	thisEx6 t;
	
	testthis4(thisEx6 t){
		
		this.t=t;
	}
	
	void test() {
		
		System.out.println(t.a);
	}
}

public class thisEx6  {
	
	int a=10;
	
	thisEx6(){
		
		testthis4 t=new testthis4(this);
		
		t.test();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisEx6 t=new thisEx6();

	}

}
