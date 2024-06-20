package test.spyd;


class overrideEx{
	
	void add(int a,int b) {
		
		int c=a+b;
		
		System.out.println(c);
		
		System.out.println("Parent class method");
	}
	
	
}

public class methodOverridingEx extends overrideEx {
	
	void add(int a,int b) {
		
		int c=a+b;
		
		System.out.println(c);
		
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodOverridingEx m=new methodOverridingEx();
		
		overrideEx o=new overrideEx();
		
		o.add(4, 6);
		
		m.add(5, 1);

	}

}
