package test.spyd;

public class largestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,2,9,1,4};
		
		int max=0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max)
				
				max=a[i];
		}
		
		System.out.println(max);

	}

}
