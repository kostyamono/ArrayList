import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArrayListTest {

    MyArrayList myArrayList;

    @BeforeEach
    void MyArrayList() {
        myArrayList = new MyArrayList();
    }

    @Test
    void testAddToIndex() {
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add(0,"0");
        myArrayList.add(1,"7");
        assertEquals("0", myArrayList.get(0));
        assertEquals("7", myArrayList.get(1));
        assertEquals("1", myArrayList.get(2));
        assertEquals("2", myArrayList.get(3));
        assertEquals(4, myArrayList.size());
    }
    @Test
    void testAddToMaxIndex() {
        for (int i = 0; i < 11; i++) {
            myArrayList.add("+");
        }
        myArrayList.add(10, "-");
        assertEquals("+", myArrayList.get(11));
    }

    @Test
    void testAdd() {
        myArrayList.add("1");
        assertEquals("1", myArrayList.get(0));
    }
    @Test
    void testAddFiveElements() {
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("5");
        assertEquals("1", myArrayList.get(0));
        assertEquals("2", myArrayList.get(1));
        assertEquals("3", myArrayList.get(2));
        assertEquals("4", myArrayList.get(3));
        assertEquals("5", myArrayList.get(4));
    }

    @Test
    void get() {
        myArrayList.add("1");
        myArrayList.add("2");
        assertEquals("2", myArrayList.get(1));
    }

    @Test
    void size() {
        myArrayList.add("1");
        myArrayList.add("1");
        myArrayList.add("1");
        myArrayList.add("1");
        assertEquals(4, myArrayList.size());

    }

    @Test
    void remove() {
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.remove(1);
        assertEquals("3", myArrayList.get(1));
        assertEquals(2, myArrayList.size());

    }

    @Test
    void removeThreeElements() {
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.remove(0);
        myArrayList.remove(1);
        myArrayList.remove(1);
        assertEquals("2", myArrayList.get(0));
        assertEquals(1, myArrayList.size());

    }

    @Test
    void trimSize() {
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.trimSize();
        assertEquals(3, myArrayList.size());
    }
}