package com.java.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<5; i++)
			list.add(i);
		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			int i = iterator.next();
			System.out.print(i+ ",");
		}
		
		System.out.println("\n"+list);
		
		//modification of list using iterator
		iterator = list.iterator();
		while(iterator.hasNext()) {
			int x = iterator.next();
			if(x%2==0) iterator.remove();
			
		}
		System.out.println(list);
		//changing list structure while iterating
		iterator = list.iterator();
		while(iterator.hasNext()){
			int x = iterator.next(); //ConcurrentModificationException here
			if(x==1) list.add(10);
		}
	}
}
