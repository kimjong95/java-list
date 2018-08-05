package arraylist.structure;

public class MyStringListLogic implements MyStringList {
	//
	private String[] array;
	private int size;

	public MyStringListLogic() {
		//
		size = 0;
		array = new String[size];
	}

	@Override
	public int size() {
		//
		return size;
	}

	@Override
	public boolean empty() {
		//
		if (size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean contains(String element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MyStringIterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(String element) {
		//
		if (array.length == size) {
			array = arraySizeIncrease(array);

			array[array.length - 1] = element;
		} else {
			array[size] = element;
		}
		size++;

	}

	@Override
	public void add(int index, String element) {
		// TODO Auto-generated method stub

	}

	@Override
	public String get(int index) {
		//
		return array[index];
	}

	@Override
	public void remove(String element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addAll(MyStringList sourceList) {
		// TODO Auto-generated method stub

	}

	@Override
	public void claer() {
		//
		
	}

	@Override
	public String[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] arraySizeIncrease(String[] array) {
		//
		String[] tempArray = new String[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}

		return tempArray;
	}

}
