package test.spyd;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class checkedExceptionEx {
	
	public static void testFile() throws FileNotFoundException {
		
		FileReader file=new FileReader("abc.txt");
		
		throw new FileNotFoundException();
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		

		try {
			testFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
