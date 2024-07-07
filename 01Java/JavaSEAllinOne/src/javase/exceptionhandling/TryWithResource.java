package javase.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResource {

	public static void main(String[] args) {
		try(final BufferedReader br = new BufferedReader(new FileReader("input.txt")))
		{
//			br = new BufferedReader(new FileReader("output.txt"));
			//is there is a possibility of closing the both resoures
			
			//like this resource changing is not allowed, compiler error.
		}//br.close //is autocalled.
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
