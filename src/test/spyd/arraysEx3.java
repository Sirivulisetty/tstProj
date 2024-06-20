package test.spyd;

import java.util.Scanner;

public class arraysEx3 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[5];
		
		for(int i=0;i<5;i++) {
			
			a[i]=sc.nextInt();
		}
		
		System.out.println("Values in Array:");
		
		for(int j : a) {
			
			System.out.println(j);
			
			
		}

	}

}
