package test.spyd;

import java.util.Scanner;

public class forLoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			
			if(i%2==0) {
				
				System.out.println(i+ " is an even number");
			}
			
			else {
				
				System.out.println(i+ " is an odd number");
			}
		}

	}

}
