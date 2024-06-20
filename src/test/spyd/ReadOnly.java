package test.spyd;

public class ReadOnly {
	
	private String name="Spy D Tech";
	
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReadOnly r=new ReadOnly();
		
		System.out.println(r.getName());

	}

	

	
}
