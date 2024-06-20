package test.spyd;

import java.util.*;

public class dequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> d=new ArrayDeque<String>();
		
		d.add("Red");
		
		d.add("blue");
		
		d.offer("White");
		
		d.offer("Black");
		
		d.offerFirst("Pink");
		
		d.offerLast("Violet");
		
		Iterator itr=d.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	
	}

}
