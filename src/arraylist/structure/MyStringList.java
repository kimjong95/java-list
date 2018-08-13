package arraylist.structure;

import arraylist.structure.MyStringListLogic.MyStringIterator;

public interface MyStringList {
	//
	int size();
	boolean empty();
	boolean contains(String element);
	MyStringIterator iterator();
	void add(String element);
	void add(int index, String element);
	String get(int index);
	void remove(String element);
	void remove(int index);
	void addAll(MyStringList sourceList);
	void clear();
	String[] toArray();
	
}
