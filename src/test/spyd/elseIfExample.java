package test.spyd;

import java.util.Scanner;

public class elseIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		int marks=sc.nextInt();
		
		if(marks>=90) {
			
			System.out.println("A Grade");
		}
		
		
		else if(marks<90 && marks>=80) {
			
			System.out.println("B Grade");
		}
		
		else if(marks<80 && marks>=65) {
			
			System.out.println("C Grade");
		}
		
		else {
			
			System.out.println("D Grade");
			
		}

	}

}
