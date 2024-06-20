package test.spyd;

public class sumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=153;
		
		int digit,sum=0;
		
		while(n>0) {
			
			digit=n%10;//3//5//1
			
			sum=sum+digit;//3+5+1
			
			n=n/10;//15/1
		}

		System.out.println(sum);
	}
	

}
