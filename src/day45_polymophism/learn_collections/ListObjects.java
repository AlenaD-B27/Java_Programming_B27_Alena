package day45_polymophism.learn_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjects {
    public static void main(String[] args) {

        /*
        List :
        allows default value
        allows duplicates
        ordered
         */

        List<Character> list1 = new ArrayList<>();
        list1.add('a');
        list1.add('b');
        list1.add(null);
        list1.add('c');
        list1.add('c');
        System.out.println(list1);


        List<Character> list2 = new LinkedList<>();
        list2.add('a');
        list2.add('b');
        list2.add(null);
        list2.add('c');
        list2.add('c');
        System.out.println(list2);
        // LinkedList will be chosen over ArrayList in case if you need to change a lot of data. But practically ArrayList is still gonna be used more.

        List<Character> list3 = new Vector<>();
        list3.add('a');
        list3.add('b');
        list3.add(null);
        list3.add('c');
        list3.add('c');
        System.out.println(list3);
        // Vector is the "old version" of ArrayList

        // Visually there's no difference among those 3. The difference is how the data is handled internally.















    }




}
