package JavaCollections;

import java.util.ArrayList;

public class ArrayListExactProgram {

	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();  
	      alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      alist.add("Pat");
	      alist.add("Angela");
	      alist.add("Tom");
	      alist.add("Tom"); 
	      //displaying elements
	      for(String output:alist) {
				
				System.out.println(output);
			}


	}

}
