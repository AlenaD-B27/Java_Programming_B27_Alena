package my_utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class EasyData {
    public static ArrayList<String> getDaysOfWeek(){
        return new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

    }



    public static ArrayList<Integer> getRandomNumbers(int limit){
        Random random = new Random(); // Research about this class, look at documentation
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < limit; i++){
            list.add(random.nextInt());
        }
        return list;
    }
}
