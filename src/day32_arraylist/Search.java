package day32_arraylist;

import my_utils.EasyData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Search {
    public static void main(String[] args) {



        ArrayList<String> list = new ArrayList<>(Arrays.asList("friday", "java", "summer", "reading", "coding", "java", "coding", "java", "summer"));
        System.out.println(searchInList(list, "java"));
        System.out.println(searchInList(list, "coding"));
        System.out.println(searchInList(list, "friday"));

        ArrayList<String> days = EasyData.getDaysOfWeek();
        System.out.println(days);


    }

    public static int searchInList(ArrayList<String> list, String target){
        int count = 0;
        for(String each: list){
            if(each.equalsIgnoreCase(target)){
                count ++;
            }
        }
        return count;
    }

















}
