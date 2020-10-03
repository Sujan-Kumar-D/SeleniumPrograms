package JavaCollections;

import java.lang.Object;
import java.util.ArrayList;


public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arl = new ArrayList();
		arl.add(100);
		arl.add("Sujan");
		arl.add(200);
		arl.add("Kumar");
		arl.add(200);
		
		for(Object obj:arl) {
			
			System.out.println(obj);
		}

	}

}
