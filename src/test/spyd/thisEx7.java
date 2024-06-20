package test.spyd;

class TestA{
	
	
	TestA getMsg() {
		
		return this;
	}
	
}

public class thisEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestA a=new TestA();
		
		System.out.println(a.getMsg());
	}

}
