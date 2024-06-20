package test.spyd;

public class finalizeEx { 
	
	protected void finalize() {
		
		System.out.println("Finalize method is invoked");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		finalizeEx f=new finalizeEx();
		
		f=null;
		
		System.gc();

	}

}
