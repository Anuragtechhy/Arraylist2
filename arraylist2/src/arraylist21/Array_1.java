package arraylist21;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_1 {

	 public static void main(String[] args) {  
		
		 
		 // 1st way
		 
			ArrayList<Object> obj = new ArrayList<Object>();
			obj.add(1);
			obj.add(3>10);
			obj.add(7.0);
			obj.add(1);
			obj.add(2);
			obj.add(1);
			obj.add(11);
			obj.add(12);
			obj.add(13);
			obj.add(15);
			obj.add(16);
		
			System.out.println(obj);
			System.out.println(obj.get(5));
			
		
	Iterator<Object> itr = obj.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
	 } 
			 
	 } 
	 

	


