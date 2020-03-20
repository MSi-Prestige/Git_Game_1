import java.util.ArrayList;
import java.util.Arrays;

public class ArraysListTest1 {
    public static void main(String[] args) {
        ArrayList<ArraysListTest1> myList = new ArrayList<ArraysListTest1>();

        ArraysListTest1 s = new ArraysListTest1();
        myList.add(s);
        ArraysListTest1 b = new ArraysListTest1();
        myList.add(b);
        myList.add(b);
        myList.add(b);
        myList.add(s);
        int theSize = myList.size();            //2
        System.out.println(theSize);           //2
        boolean isIn = myList.contains(s);    //true
        System.out.println(isIn);           //true
        int idx = myList.indexOf(b);       //1
        System.out.println(idx);          // 1
        boolean empty = myList.isEmpty();
        System.out.println(empty);            //false
        myList.remove(s);
        int theSize1 = myList.size();
        System.out.println(theSize1);            //1 uze  - 1 udalili
    }
}
