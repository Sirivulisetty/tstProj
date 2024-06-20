package test.spyd;

import java.util.*;

public class treeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap<Integer,String> h= new TreeMap<>();
		
		h.put(4,"Abc");
		
		h.put(2,"Xyz");
		
		h.put(3, "Def");
		
		h.put(null, "Mno");
		
		for(Map.Entry m : h.entrySet()) {
			
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		 
		

	}

}
