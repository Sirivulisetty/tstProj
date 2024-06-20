package test.spydTech;

import java.util.*;

public class hashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		
		h.put(1, "Red");
		
		h.put(4, "White");
		
		h.put(null, "Blue");
		
	
		
		//h.remove(2);
		
		for(Map.Entry m : h.entrySet()) {
			
			System.out.println(m.getKey()+ " "+m.getValue());
			
			
		}

	}

}
