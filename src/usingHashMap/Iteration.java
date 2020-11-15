package usingHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iteration {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(2,"fasih");
		map.put(3,"car");
		map.put(66,"dpppog");
		map.put(7,"home");
		Iterator itr =map.entrySet().iterator();
		while(itr.hasNext()) {
			
			Map.Entry me=(Map.Entry)itr.next();
			 System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());
		
			
		}
		 System.out.println("for loop ");
		 for(Map.Entry m:map.entrySet()) {
			 System.out.println("Key is " + m.getKey() + " Value is " + m.getValue());
		 }
	}

}
