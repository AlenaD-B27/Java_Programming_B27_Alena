package day47_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("James", "Alena", "Lucy", "Feruz"));

        for (String each : names){
            System.out.println(each);
        }
        System.out.println();


        Iterator<String> it = names.iterator(); // pin is created, it starts before the first element

        /*
        hasNext()  ---> returns boolean
        next()     ---> returns element
        remove()   ---> removes the element at the current iterator position
         */

        System.out.println(it.hasNext()); // checks is there any element after pin
        System.out.println(it.next()); // moves the pin once and returns the value of that element

        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());
       // System.out.println(it.next()); // exception occurs because there is no elements left
        System.out.println();

        Iterator <String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
