package test.spyd;
class thistest1{
	
	int a=10;
	
	
	
	
}
public class thisex1 extends  thistest1{
 
	
	int a=20;
	
	void msg() {
		
		System.out.println(this.a);
		
		System.out.println(super.a);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisex1 t=new thisex1();
		
		t.msg();

	}

}
