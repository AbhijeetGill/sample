package java_programs;

import java.util.ArrayList;

public class Arraylist {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]) {
	ArrayList a=new ArrayList();
	a.add("Abhijeet");
	a.add("aarti");
	a.add("aman");
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
	}
	
	
	
	
	}	
}
