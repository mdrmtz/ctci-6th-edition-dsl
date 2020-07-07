package mx.bluetouch.ctci.library.chapter_13_java;

import java.util.*;

public class IntroductionCollections {
	public static void main(String[] args) {
		// ArrayList
		ArrayList<String> myArr = new ArrayList<String>();
		myArr.add("one");
		myArr.add("two");
		System.out.println(myArr.get(0));
		
		// Vector
		Vector<String> myVector = new Vector<String>();
		myVector.add("one");
		myVector.add("two");
		System.out.println(myVector.get(0));
		
		// Linked List
		LinkedList<String> myLinkedList = new LinkedList<String>();
		myLinkedList.add("two");
		myLinkedList.addFirst("one");
		Iterator<String> iter = myLinkedList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// Hash Map
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("one", "uno");
		map.put("two", "dos");
		System.out.println(map.get("one"));
	}
}
