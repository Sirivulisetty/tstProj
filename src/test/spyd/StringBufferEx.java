package test.spyd;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("Selenium");
		
		sb.append("Automation");
		
		System.out.println(sb);
		
		sb.insert(8, " ");
		
		System.out.println(sb);
		
		sb.replace(0,8,"Test");
		
		System.out.println(sb);
		
		sb.delete(0, 4);
		
		System.out.println(sb);


	}

}
