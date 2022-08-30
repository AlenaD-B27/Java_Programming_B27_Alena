package day32_arraylist;

import java.util.ArrayList;

public class LoopList {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(8);
        nums.add(7);
        nums.add(3);
        nums.add(4);

        // get(0) get(1) get(2)

        for(int i = 0; i < nums.size(); i++){
            System.out.print(nums.get(i) + " "); // array[i]
        }

        System.out.println();

        for(int each: nums){
            System.out.print(each + " ");
        }

        System.out.println();

        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Iron Man");
        avengers.add("Spider Man");
        avengers.add("Thor");
        avengers.add("Captain America");
        avengers.add("Hawkeye");

        // print each initial. If there is only one word, then print just the first letter
        for(String each : avengers){

            if(each.contains(" ")){
                int space = each.indexOf(" ") + 1;
                System.out.println(each.substring(0, 1) + each.substring(space, space + 1));
            } else {
                System.out.println(each.charAt(0));
            }

        }


    }
}
