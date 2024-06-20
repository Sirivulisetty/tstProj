package test.spyd;

import java.util.*;

public class sortedSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedSet<Integer> s=new TreeSet<Integer>();
		
		s.add(4);
		
		s.add(3);
		
		s.add(1);
		
		s.add(2);
		
		Iterator itr=s.iterator();	
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}

	}

}
