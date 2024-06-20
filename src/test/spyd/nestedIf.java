package test.spyd;

import java.util.Scanner;

public class nestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		int age=sc.nextInt();
		
		String state=sc.next();
		
		if(age>18) {
			
			if(state.equals("Telanagana")) {
				
				System.out.println("Display Telangana MP Candidates");
			}
			
			else if(state.equals("AP")){
				
				System.out.println("Display AP MP Candidates");
			}
			
			else {
				
				System.out.println("No List is present");
			}
			
		}
		
		else {
			
			System.out.println("Candidate is not eligible to vote");
		}
		

	}

}
