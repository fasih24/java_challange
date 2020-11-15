package usingHashMap;

import java.util.HashMap;

public class UsingHassMap {

	public static void main(String[] args) {
		String str="i i i am fasih fasih ";
		String [] split=str.split(" ");
		HashMap<String,Integer > map=new HashMap<String,Integer>();
		for(String i:split) {
			
			if(map.containsKey(i)) {
				int count=map.get(i);
				map.put(i,count+1);
			}else {
				map.put(i,1);
			}
		}
		
System.out.println(map);
	}

}
