package test.spyd;
import java.util.Scanner;
public class simpleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		int n=sc.nextInt();
		
		if((n%2)==0) {
			
			System.out.println(n + "is an even number");		
			}
		
		else {
			
			System.out.println(n + "is an odd number");
			
		}
	
	}

}
