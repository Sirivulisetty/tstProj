package test.spydTech;

import java.util.Scanner;

public class switchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		int n=sc.nextInt();
		
		switch(n)
		{
		
		case 1:
			System.out.println("number is present " + n);
			break;
			
		case 2:
			System.out.println("number is present " + n);
			break;
			
		case 3:
			System.out.println("number is present " + n);
			break;
			
		case 4:
			System.out.println("number is present " + n);
			break;
			
			default:
				System.out.println("number is not present");
		}
		

	}

}
