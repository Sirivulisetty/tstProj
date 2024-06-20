package test.spyd;

public class methodOverloadingEx1 {
	
	void add(int a,int b) {
		
		int sum=a+b;
		
		System.out.println(sum);
	}
	
	void add(float a,float b) {
		
		float sum=a+b;
		
		System.out.println(sum);
	}

	void add(double a,double b) {
	
		double sum=a+b;
	
		System.out.println(sum);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodOverloadingEx1 m=new methodOverloadingEx1();
		
		m.add(5, 3);
		
		m.add(4.2f, 2.4f);
		
		m.add(45.564,38.431);

	}

}
