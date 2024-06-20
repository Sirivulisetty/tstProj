package test.spyd;

public class primeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {
				
				System.out.println(n + " is not prime");
				
				break;
				
			}
			
			else
			{
				System.out.println(n + " is a prime");
				break;
			}
		}

	}

}
