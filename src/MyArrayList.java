import java.util.Arrays;


public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private String[] elements;
    private int size;


    public MyArrayList() {
        elements = new String[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity > 0) {
            elements = new String[capacity];
        } else if (capacity == 0) {
            elements = new String[0];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    capacity);
        }
    }

    private void rangeCheckForAdd(int index) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException("Illegal Index: " +
                    index);
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, (elements.length + elements.length / 2));
        }
    }


    public void add(int index, String element) {
        rangeCheckForAdd(index);
        ensureCapacity();
        if (size + 1 - index >= 0) System.arraycopy(elements, index, elements, index + 1, size + 1 - index);
        elements[index] = element;
        size++;
    }


    public void add(String element) {
        ensureCapacity();
        elements[size] = element;
        size++;
    }


    String get(int index) {
        if (index <= size && index >= 0) {
            return elements[index];
        } else
            throw new IndexOutOfBoundsException("Illegal Index: " +
                    index);
    }


    int size() {
        return size;
    }

    public void remove(int index) {
        if (index < size && index >= 0) {
            elements[index] = null;
            if (elements.length - 1 - index >= 0)
                System.arraycopy(elements, index + 1, elements, index, elements.length - 1 - index);
            size--;
        } else
            throw new IndexOutOfBoundsException("Illegal Index: " +
                    index);
    }

    void trimSize() {
        elements = Arrays.copyOf(elements, (size));
    }

}
