package test.spyd;

public class MinNMaxNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,7,8,2,1,4};
		
		int max=arr[0],min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max)
				
				max=arr[i];
			
			if(arr[i]<min)
				
				min=arr[i];
			
		}
		
		System.out.println(max + " "+min);

	}
	
	

}
