package JavaCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkedHashnet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> values = new LinkedHashSet<String> ();
		
		values.add("Sujan");
		values.add("Kumar");
		values.add("1");
		values.add("100");
		values.add("100");
		values.add("D");
		values.add("D");
		
		for(String output:values) {
			
			System.out.println(output);
		}
		

	}

}
