package test.spyd;

public class methodOverloadingEx2 {
	
	void add(int a,int b) {
		
		int sum=a+b;
		
		System.out.println(sum);
	}
	
	void add(int a,int b,int c) {
		
		int sum=a+b+c;
		
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodOverloadingEx2 m=new methodOverloadingEx2();
		
		m.add(4, 6);
		
		m.add(6, 2, 6);
		
		

	}

}
