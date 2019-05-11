package java_programs;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> li=new LinkedList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.set(4,6);
		li.addFirst(2);
		Iterator<Integer> it=li.iterator();		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		}
	}


