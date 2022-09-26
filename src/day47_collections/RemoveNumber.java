package day47_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNumber {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(4, 1, 5, 2, 6, 8, 2, 5, -1, 19, 20, 23, 2, 13, 5, 3, 2));

        // Remove all the numbers less than 5

        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){
            if(it.next() < 5){
                it.remove();
            }
        }

        System.out.println(nums);















    }
}
