package com.collection.tnsif;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

		public static void main(String[] args) {
			
			List list1 = new ArrayList();
			
			System.out.println("Size :"+list1.size());
			System.out.println("Is list empty : "+list1.isEmpty());
			
			list1.add(1);
			list1.add(20);
			list1.add("Mauli");
			list1.add("Rohit");
			
			list1.add(2.5f);
			
			list1.add(20);
			
			
			System.out.println("List :"+list1);
			
			list1.remove(1);
			
			System.out.println("List :"+list1);
			
			
			
			
			System.out.println("List :"+list1);
			
			// generic list
			
			List <String> names= new ArrayList<String>();
			
			names.add("Mauli");
			names.add("Rohit");
			names.add("Tanmay");
			names.add("Vikas");
			
			System.out.println("Nmaes :"+names);
			
			Collections.reverse(names);
			System.out.println("Reversed names :"+names);
			
			Collections.sort(names);
			System.out.println("Sorted Names :"+names);
			
			
			Collections.reverse(names);
			
			System.out.println("Descending order :"+names);
			
			//Activity
			List <String> city = new ArrayList<String>();
			city.add("Pune");
			city.add("Mumbai");
			city.add("Ayodhya");
			city.add("Vrindavan");
			city.add("Pandharpur");
			
			System.out.println("My Favurite Cities"+city);
			
			
			
			
			
			
			
			
		}
}
