import java.util.Arrays;

public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private String[] elements;
    private int size;


    public MyArrayList() {
        elements = new String[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity != 0) {
            elements = new String[capacity];
        } else elements = new String[DEFAULT_CAPACITY];
    }


    public void add(int index, String element) {
        if (index < size) {
            if (size == elements.length + 1) {
                elements = Arrays.copyOf(elements, (elements.length + elements.length / 2));
            }
            for (int i = size; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
            size++;
        } else throw new IndexOutOfBoundsException();
    }


    public void add(String element) {
        if (elements[elements.length - 1] != null) {
            elements = Arrays.copyOf(elements, (elements.length + elements.length / 2));
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] == null) {
                    elements[i] = element;
                    size++;
                    break;
                }
            }
        } else {
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] == null) {
                    elements[i] = element;
                    size++;
                    break;
                }
            }
        }
    }

    String get(int index) {
        if (index <= size) {
            return elements[index];
        } else
            throw new IndexOutOfBoundsException();
    }


    int size() {
        return size;
    }

    public void remove(int index) {
        if (index < size) {
            elements[index] = null;
            for (int i = index; i < elements.length - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        } else
            throw new IndexOutOfBoundsException();
    }

    void trimSize() {
        elements = Arrays.copyOf(elements, (size));
    }

}
