package main;

import java.util.ArrayList;

import arraylist.structure.MyStringList;
import arraylist.structure.MyStringListLogic;
import arraylist.structure.StringIterator;

public class Main {
	//
	public static void main(String args[]) {
		//
		MyStringList list = new MyStringListLogic();
		
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		
		System.out.print("현재 List 정보 :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
		System.out.println();
		
		System.out.print("있는 값 :");	
		System.out.println(list.contains("Test1"));
		System.out.print("없는 값 :");
		System.out.println(list.contains("Test8"));
		
		System.out.println();
		System.out.print("toArray값 : ");
		for(int i=0; i<list.toArray().length; i++) {
			System.out.print("list.toArray()["+i+"] 값 : " + list.toArray()[i]+", ");
		}
		
		list.add(2, "NewValue1");
		System.out.println();
		System.out.println();
		System.out.print("현재 List 정보(인덱스 에 추가 후) :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
		
		list.remove(2);
		System.out.println();
		System.out.print("2번인덱스 지운 List 정보 :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
		
		list.remove("Test3");
		System.out.println();
		System.out.print("Test3 지운 List 정보 :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
		
		StringIterator strIter = list.iterator();
		System.out.println();
		System.out.print("Iterator 사용 List정보 :");
		System.out.println();
		while(strIter.hasNext()) {
			System.out.print(strIter.next());
		}
		System.out.println("\n listSize :" + list.size());
		
		strIter.remove();
		System.out.println();
		System.out.print("Iterator.remove() 사용 List정보 :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
		MyStringList addList = new MyStringListLogic();
		addList.add("AddList1");
		addList.add("AddList2");
		addList.add("AddList3");
		
		list.addAll(addList);
		System.out.println();
		System.out.println();
		System.out.print("addAll 후  List정보 :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
		
		list.clear();
		System.out.println();
		System.out.print("현재 List 정보(clear 후) :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
	}
}
