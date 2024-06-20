package test.spyd;

import java.util.*;

public class vectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v1=new Vector<String>();
		
		v1.add("Red");
		
		v1.add("Blue");
		
		v1.addElement("Green");
		
		
		
		Vector<String> v2=new Vector<String>();
		
		v1.add("Pink");
		
		v1.add("Purple");
		
		v1.addAll(v2);
		
		System.out.println(v1);
		
		v1.removeElementAt(1);
		
		//v1.insertElementAt("Yellow", 2);
		
		System.out.println(v1.size());
		
		
		

	}

}
