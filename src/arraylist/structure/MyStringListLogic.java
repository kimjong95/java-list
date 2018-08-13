package arraylist.structure;

public class MyStringListLogic implements MyStringList {
	//
	private String[] array;
	private int size;

	private static int default_Array_Size = 10;

	public MyStringListLogic() {
		//
		size = 0;
		array = new String[default_Array_Size];
	}

	@Override
	public int size() {
		//
		return size;
	}

	@Override
	public boolean empty() {
		//
		return size == 0;
	}

	@Override
	public boolean contains(String element) {
		//
		for (int i = 0; i < size; i++) {
			if (array[i] == element) {
				return true;
			}
		}
		return false;
	}

	@Override
	public MyStringIterator iterator() {
		//
		return new MyStringIterator(array, size);
	}

	@Override
	public void add(String element) {
		//
		if (array.length == size) {
			array = arraySizeIncrease(array, array.length / 2);
		}
		array[size] = element;
		size++;
	}

	@Override
	public void add(int index, String element) {
		//
		if (index > size) {
			throw new IndexOutOfBoundsException("범위를 벗어난 index값 입니다 : " + "index");
		}

		if (array.length == size) {
			array = arraySizeIncrease(array, array.length / 2);
		}

		array = pushArrayIndex(array, array.length, index);
		array[index] = element;

		size++;
	}

	@Override
	public String get(int index) {
		//
		if (index > size) {
			throw new IndexOutOfBoundsException("범위를 벗어난 index값 입니다 : " + "index");
		}

		return array[index];
	}

	@Override
	public void remove(String element) {
		//
		int index = findElementIndex(element);
		
		array = pullArrayIndex(array, array.length, index);
		
		size--;
	}

	@Override
	public void remove(int index) {
		//
		if (index > size) {
			throw new IndexOutOfBoundsException("범위를 벗어난 index값 입니다 : " + "index");
		}

		array = pullArrayIndex(array, array.length, index);
		
		size--;

	}

	@Override
	public void addAll(MyStringList sourceList) {
		//
		String[] addList = sourceList.toArray();
		array = arraySizeIncrease(array, addList.length);

		int addIndex = size;
		int addListIndex = 0;

		for (int i = addIndex; i < (size + addList.length); i++) {

			array[i] = addList[addListIndex];

			addListIndex++;
		}
		size = size + addList.length;
	}

	@Override
	public void clear() {
		//
		for (int i = 0; i < array.length; i++) {
			array[i] = null;
		}

		size = 0;
	}

	@Override
	public String[] toArray() {
		//
		String[] returnArray = new String[size];
		for (int i = 0; i < size; i++) {
			returnArray[i] = array[i];
		}

		return returnArray;
	}

	// private punction of ArrayList

	private String[] arraySizeIncrease(String[] array, int addIndex) {
		//
		String[] tempArray = new String[array.length + array.length / 2];
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}

		return tempArray;
	}

//	private String[] arraySizeDecrease(String[] array, int removeIndex) {
//		//
//		String[] tempArray = new String[array.length - removeIndex];
//		for (int i = 0; i < array.length; i++) {
//			tempArray[i] = array[i];
//		}
//
//		return tempArray;
//	}
//
//	private String[] copyOf(String[] array, int index) {
//		//
//		String[] tempArray = new String[array.length];
//
//		for (int i = 0; i < index; i++) {
//			tempArray[i] = array[i];
//		}
//
//		return tempArray;
//	}

	private String[] pullArrayIndex(String[] array, int arraySize, int head) {
		//
		String[] tempArray = new String[arraySize];
		for(int i = 0; i < head; i++) {
			tempArray[i] = array[i];
		}
		for(int i = head ; i < size ; i++) {
			tempArray[i] = array[i + 1];
		}
		
		return tempArray;

	}

	private String[] pushArrayIndex(String[] array, int arraySize, int head) {
		//
		String[] tempArray = new String[arraySize];
		for (int i = 0; i < head; i++) {
			tempArray[i] = array[i];
		}

		for (int i = head + 1; i < size + 1; i++) {
			tempArray[i] = array[i - 1];
		}
		array[head] = null;
		return tempArray;
	}
	
	private int findElementIndex (String element) {
		//
		int elementIndex = 0;
		for(int i = elementIndex ; i < size; i++) {
			if(array[i] == element) {
				break;
			}
			elementIndex++;
		}
		return elementIndex;
	}
	// Inner Class Iterator

	public class MyStringIterator implements StringIterator {
		//
		private int index;
		private String[] returnArray;
		private int listSize;

		public MyStringIterator(String[] array, int size) {
			//
			index = 0;
			returnArray = array;
			listSize = size;
		}

		@Override
		public String next() {
			//
			return returnArray[index++];
		}

		@Override
		public boolean hasNext() {
			//
			if (index < listSize) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public void remove() {
			//
			MyStringListLogic.this.remove(index - 1);
			index--;
		}
	}
}
