package test.spyd;

public class userdefinedMethods {
	
	void msg() {
		
		System.out.println("Hello");
		
	}
	
	void add(int a,int b) {
		
		int c=a+b;
		
		System.out.println(c);
	}
	
	
	int diff() {
		
		int a=10,b=20;
		
		int c=b-a;
		
		return c;
	}
	
	float multiply(float a,float b) {
		
		float c=a*b;
		
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		userdefinedMethods u=new userdefinedMethods();
		
		u.msg();
		
		u.add(2, 3);
		
		System.out.println(u.diff());
		
		System.out.println(u.multiply(4.5f, 5.6f));
		

	}

}
