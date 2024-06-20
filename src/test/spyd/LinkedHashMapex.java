package test.spyd;

import java.util.*;

public class LinkedHashMapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,String> h=new LinkedHashMap<>();
		
		h.put(4,"Abc");
		
		h.put(2,"Xyz");
		
		h.put(3, "Def");
		
		h.put(null, "Mno");
		
		h.putFirst(5, "Ghi");
		
		h.putLast(1, "Kjl");
		
		for(Map.Entry m : h.entrySet()) {
			
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		

	}

}
