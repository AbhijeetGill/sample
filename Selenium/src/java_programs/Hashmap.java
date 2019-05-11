package java_programs;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> ob=new HashMap<Integer,String>();
		ob.put(1,"Abhijeet");
		ob.put(2,"Aarti");
		ob.put(3,"aman");
		System.out.println(ob.size());
		for(int i:ob.keySet()) {
			System.out.println(ob.get(i));
		}
		ob.clear();
		ob.size();		
	}

}
