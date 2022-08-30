package day31_arraylist;

import java.util.ArrayList;

public class RemovingMethods {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flying");
        System.out.println(words);

        // removing by index

        words.remove(2); // returns the element that you remove
        System.out.println(words);

        System.out.println(words.remove(0));
        System.out.println(words);

        words.clear(); // emptys the whole ArrayList
        System.out.println(words);

        // use the removing by object

        words.add("jumping");
        words.add("barn");
        words.add("chicken");
        words.add("cow");
        System.out.println(words);

        words.remove("barn");
        System.out.println(words);

        System.out.println(words.remove("Cow"));
        System.out.println(words);

        System.out.println(words.remove("chicken"));
        System.out.println(words);

        System.out.println("-------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(0);
        nums.add(2);
        nums.add(4);

        nums.remove(0); // 0 is int so it removes by index
        System.out.println(nums);

        Integer a = 0;
        nums.remove(a); // a is Integer, so it removed by element, the element it removes 0
        System.out.println(nums);

        nums.remove((Integer) 2); // casting the 2 to a Integer type, so I can remove the element 2, not the index 2
        System.out.println(nums);

        nums.add(0, 4);
        System.out.println(nums);
        nums.remove((Integer) 4);
        System.out.println(nums);



    }
}

/*

    String s = "hello"

    s.charAt(0)

    System.out.println(s.charAt(0))

 */

