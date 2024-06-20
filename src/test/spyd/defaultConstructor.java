package test.spyd;

public class defaultConstructor 
{
	
	
	defaultConstructor(){
		
		System.out.println("defaultConstructor");
	}
	
	defaultConstructor(int a,int b){
		
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		defaultConstructor d1=new defaultConstructor();
		
		defaultConstructor d2=new defaultConstructor(5,10);
		
	}

}
