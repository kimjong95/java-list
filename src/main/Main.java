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
		
		System.out.print("현재 List 정보 :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		
		System.out.println();
		System.out.print("있는 값 :");	
		System.out.println(list.contains("Test1"));
		System.out.print("없는 값 :");
		System.out.println(list.contains("Test8"));
		
		
		list.add(3, "NewValue1");
		System.out.print("현재 List 정보(인덱스 에 추가 후) :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		
		list.remove(2);
		System.out.println();
		System.out.print("2번인덱스 지운 List 정보 :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		
		list.claer();
		System.out.println();
		System.out.print("현재 List 정보(clear 후) :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
	}
}
