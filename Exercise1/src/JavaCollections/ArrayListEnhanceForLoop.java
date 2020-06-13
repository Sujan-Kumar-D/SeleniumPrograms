package JavaCollections;

import java.lang.Object;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListEnhanceForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arl = new ArrayList();
		arl.add(100);
		arl.add("Sujan");
		arl.add(200);
		arl.add("Kumar");
		arl.add(500);
		
		Iterator itr = arl.iterator();
		
		while (itr.hasNext()) {
			Object value = itr.next();
			System.out.println(value);
		}
	}

}
