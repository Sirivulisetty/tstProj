package test.spyd;

import java.util.*;

public class linkedHashSetex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s=new LinkedHashSet<String>();
		
		s.add("Pink");
		
		s.add("Red");
		
		s.add("purple");
		
		s.remove("Red");
		
		s.clear();
		
		System.out.println(s.size());

	}

}
