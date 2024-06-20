package test.spyd;

public class reverseASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Testing in Selenium";
		String rev="";
		
		String s[]=str.split(" ");
		
		for(int i=s.length-1;i>=0;i--) {
			
			rev+=s[i]+" ";
		}
		
		System.out.println(rev);

	}

}
