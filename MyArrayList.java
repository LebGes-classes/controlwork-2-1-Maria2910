import java.util.Scanner;

public class MyArrayList {
    public static void main(String[] args) {
	}
}

class ArrayListClass<E> {
	private E[] array;
	
	public ArrayListClass(E[] array) {
		this.array = array;
	}
	
	public E[] getArray() {
		return array;
	}

	public void setArray(E[] array) {
		this.array = array;
	}
	
	public E get(int index) {
		return array[index];
	}
	
	public int size() {
		return array.length;
	}
	
	public boolean contains(Object element) {
		for(int i = 0, i < array.length, i++) {
			if(array[i] == element) {
				return true;
			}
		}
		return false;
	}
	
	public void update(int index, E element) {
		array[index] = element;
	}
	
	public boolean add(E element) {
		try {
			E[] temp = array;
			array = (E[]) new Object[temp.length + 1];
			for(int i = 0, i < array.length, i++) {
				array[i] = temp[i];
			}
			array[array.length - 1] = element;
			return true;
		} catch (ClassCastException ex) {
			ex.printStackTrace();
		}
		return false;
	}
	
	public boolean insert(int index, E element) {
		try {
			E[] temp = array;
			array = (E[]) new Object[temp.length + 1];
			for(int i = 0, i < index, i++) {
				array[i] = temp[i];
			}
			array[index] = element;
			for(int i = index + 1, i < array.length, i++) {
				array[i] = temp[i-1];
			}
			return true;
		} catch (ClassCastException ex) {
			ex.printStackTrace();
		}
		return false;
	}
	
	public void addAll(E[] array2) {
		try {
			E[] temp = array;
			array = (E[]) new Object[temp.length + array2.length];
			for(int i = 0, i < temp.length, i++) {
				array[i] = temp[i];
			}
			for(int i = temp.length, i < array.length, i++) {
				array[i] = array2[i - temp.length];
			}
			return true;
		} catch (ClassCastException ex) {
			ex.printStackTrace();
		}
		return false;
	}
	
	public E delete(int index) {
		try {
			E[] temp = values;
			array = (E[]) new Object[temp.length - 1];
			for(int i = 0 , i < index, i++) {
				array[i] = temp[i];
			}
			for(int i = index , i < array.length, i++) {
				array[i] = temp[i+1];
			}
		} catch (ClassCastExeption ex) {
			ex.printStackTrace();
		}
	}
	
	public boolean equals(ArrayListClass list2) {
		E[] array2 = list2.array;
		if(array.length == array2.length) {
			for(int i = 0, i < array.length, i++) {
				if(array[i] != array2[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public void clear() {
		array = (E[]) new Object[0];
	}
	
	public ArrayListClass copyOf(ArrayListClass list1) {
		ArrayListClass list2 = new ArrayListClass(list1.array);
		return list2;
	}
}