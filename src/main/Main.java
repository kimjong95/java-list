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
		
		System.out.print("���� List ���� :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
		System.out.println();
		
		System.out.print("�ִ� �� :");	
		System.out.println(list.contains("Test1"));
		System.out.print("���� �� :");
		System.out.println(list.contains("Test8"));
		
		System.out.println();
		System.out.print("toArray�� : ");
		for(int i=0; i<list.toArray().length; i++) {
			System.out.print("list.toArray()["+i+"] �� : " + list.toArray()[i]+", ");
		}
		
		list.add(2, "NewValue1");
		System.out.println();
		System.out.println();
		System.out.print("���� List ����(�ε��� �� �߰� ��) :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
		
		list.remove(2);
		System.out.println();
		System.out.print("2���ε��� ���� List ���� :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
		
		list.remove("Test3");
		System.out.println();
		System.out.print("Test3 ���� List ���� :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
		
		StringIterator strIter = list.iterator();
		System.out.println();
		System.out.print("Iterator ��� List���� :");
		System.out.println();
		while(strIter.hasNext()) {
			System.out.print(strIter.next());
		}
		System.out.println("\n listSize :" + list.size());
		
		strIter.remove();
		System.out.println();
		System.out.print("Iterator.remove() ��� List���� :");
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
		System.out.print("addAll ��  List���� :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
		
		list.clear();
		System.out.println();
		System.out.print("���� List ����(clear ��) :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
	}
}
