package test.spyd;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb=new StringBuilder("Selenium");
		
		sb.append("Testing");
		
		System.out.println(sb);
		
		sb.insert(8, " ");
		
		System.out.println(sb);
		
		sb.replace(9,16,"Automation");
		
		System.out.println(sb);
		
		sb.delete(0, 4);
		
		System.out.println(sb);
	}

}
