package test.spyd;

public class defaultCons {
	
	defaultCons(){
		
		System.out.println("Default Constructor");
	
	
	}
	
	defaultCons(int a,int b){
		
		int c=a+b;
		
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		defaultCons d1=new defaultCons();
		
		defaultCons d2=new defaultCons(2,3);
	}

}
