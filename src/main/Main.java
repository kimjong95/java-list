package main;

import java.util.ArrayList;
import java.util.List;

import arraylist.structure.MyStringList;
import arraylist.structure.MyStringListLogic;

public class Main {
	//
	public static void main(String args[]) {
		//
		MyStringList list = new MyStringListLogic();
		
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		List<String> string = new ArrayList<String>();
	}
}
