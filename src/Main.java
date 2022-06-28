import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        MyArrayList myArrayList = new MyArrayList();
        MyArrayList myArrayList1 = new MyArrayList(0);
        MyArrayList myArrayList2 = new MyArrayList(-1221);
        MyArrayList myArrayList3 = new MyArrayList(1221);



//        MyArrayList myArrayList1 = new MyArrayList(33);
//        myArrayList1.add("asd");
//        System.out.println("ArrayList actual size: " + myArrayList1.size());
//        myArrayList1.trimSize();
//        System.out.println("ArrayList actual size: " + myArrayList1.size());

        System.out.println("ArrayList actual size: " + myArrayList.size());
        myArrayList.add("1");
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");
        myArrayList.add("4");
        myArrayList.add("5");
        myArrayList.remove(1);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
        System.out.println("ArrayList actual size: " + myArrayList.size());






    }
}
