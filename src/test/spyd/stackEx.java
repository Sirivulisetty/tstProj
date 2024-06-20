package test.spyd;
import java.util.Iterator;
import java.util.Stack;

public class stackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> s=new Stack<Integer>();
		
		s.push(6);
		
		s.push(4);
		
		s.push(1);
		
		s.push(9);
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		
		
	}
		
	}

}
