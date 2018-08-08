package main;

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
		
		System.out.print("있는 값 :");	
		System.out.println(list.contains("Test1"));
		System.out.print("없는 값 :");
		System.out.println(list.contains("Test8"));
		
		System.out.print("toArray값 : ");
		for(int i=0; i<list.toArray().length; i++) {
			System.out.print("list.toArray()["+i+"] 값 : " + list.toArray()[i]+", ");
		}
		
		list.add(3, "NewValue1");
		System.out.print("현재 List 정보(인덱스 에 추가 후) :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
		
		list.remove(2);
		System.out.print("2번인덱스 지운 List 정보 :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
		
		list.remove("Test3");
		System.out.print("Test3 지운 List 정보 :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
		
		StringIterator strIter = list.iterator();
		System.out.print("Iterator 사용 List정보 :");
		while(strIter.hasNext()) {
			System.out.print(strIter.next());
		}
		System.out.println("\n listSize :" + list.size());
		
		strIter.remove();
		System.out.print("Iterator.remove() 사용 List정보 :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
		
		list.claer();
		System.out.print("현재 List 정보(clear 후) :");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println("\n listSize :" + list.size());
	}
//		List<String> array = new ArrayList<>();
//		
//		array.add("Test1");
//		array.add("Test2");
//		array.add("Test3");
//		array.add("Test4");
//		array.add("Test5");
//		array.add("Test6");
//		
//		Iterator<String> iter = array.iterator();
//		
//		System.out.println("1 :");
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		iter.remove();
//		
//		for(int i=0; i<array.size(); i++) {
//		System.out.println(array.get(i));
//		}
}
