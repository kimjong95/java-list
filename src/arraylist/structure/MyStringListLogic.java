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
		//
		for (int i = 0; i < array.length; i++) {
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
			array = arraySizeIncrease(array);

			array[array.length - 1] = element;
		} else {
			array[size] = element;
		}
		size++;

	}

	@Override
	public void add(int index, String element) {
		//
		if (array.length == size) {
			array = arraySizeIncrease(array);

			String[] tempArray = new String[array.length];

			tempArray = copyOf(array, index);

			tempArray[index] = element;
			for (int i = index + 1; i < size + 1; i++) {
				tempArray[i] = array[i - 1];
			}
			array = tempArray;
		} else {
			String[] tempArray = new String[array.length];

			tempArray = copyOf(array, index - 1);
			tempArray[index] = element;

			for (int i = index + 1; i < size + 1; i++) {
				tempArray[i] = array[i - 1];
			}

			array = tempArray;
		}
		size++;
	}

	@Override
	public String get(int index) {
		//
		return array[index];
	}

	@Override
	public void remove(String element) {
		//
		String[] tempArray = new String[array.length];
		int arrayIndex = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] == null) {
				break;
			}
			if (array[i] == element) {
				arrayIndex = arrayIndex + 1;
			}
			tempArray[i] = array[arrayIndex];
			arrayIndex++;

		}

		array = tempArray;
		size--;
	}

	@Override
	public void remove(int index) {
		//
		String[] tempArray = new String[array.length];

		tempArray = copyOf(array, index + 1);
		for (int i = index + 1; i < size - 1; i++) {

			tempArray[i] = array[i + 1];
		}
		array = tempArray;
		size--;
	}

	@Override
	public void addAll(MyStringList sourceList) {
		//

	}

	@Override
	public void claer() {
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

	private String[] arraySizeIncrease(String[] array) {
		//
		String[] tempArray = new String[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}

		return tempArray;
	}

	private String[] copyOf(String[] array, int index) {
		//
		String[] tempArray = new String[array.length];

		for (int i = 0; i < index; i++) {
			tempArray[i] = array[i];
		}

		return tempArray;
	}

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
			MyStringListLogic.this.remove(index-1);
			
		}
	}

}
