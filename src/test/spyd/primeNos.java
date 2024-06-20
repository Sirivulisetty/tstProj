package test.spyd;

public class primeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		for(int i=1;i<=100;i++) {
			
			int count=0;			
			for(n=i;n>=1;n--) {
				
				if(i%n==0) {
					count++;
				}
			}
			
			if(count==2) {
				
				System.out.println(i);
			}
			
		}

	}

}
