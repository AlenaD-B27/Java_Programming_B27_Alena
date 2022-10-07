package day49_50_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Extra {
    public static void main(String[] args) {
//        1.1 Create a function that can return the maximum number from a list of Integer
        Function<List<Integer>, Integer> maxNum = p -> {
          Integer max = Integer.MIN_VALUE;
          for(Integer eachNum : p ){
              if(eachNum > max)
                  max = eachNum;
          }
          return max;
        };
//        1.2 Create a function that can return the minimum number from a list of Integer
        Function<List<Integer>, Integer> minNum = p -> {
            Integer min = Integer.MAX_VALUE;
            for(Integer eachNum : p ){
                if(eachNum < min)
                    min = eachNum;
            }
            return min;
        };
//        1.3 Create a function that can return the longest String from a List of String
        Function<List<String>, String> longestStr = p -> {
            String dummy = p.get(0);
            for(String each : p ){
                if(each.length() > dummy.length())
                    dummy = each;
            }
            return dummy;
        };
//        1.4 Create a function that can return the shortest String from a List of String
        Function<List<String>, String> shortestStr = p -> {
            String dummy = p.get(0);
            for(String each : p ){
                if(each.length() < dummy.length())
                    dummy = each;
            }
            return dummy;
        };
//        1.5 Create a function that can convert List of integer to int array
        Function<List<Integer>, int []> listToIntArr = p -> {
            int[] dummy = new int[p.size()];
            for(int i = 0; i < p.size(); i++){
                dummy[i] = p.get((i));
            }
            return dummy;
        };
//        1.6 Create a function that can convert List of double to double array
        Function<List<Double>, double []> listToDoubleArr = p -> {
            double[] dummy = new double[p.size()];
            for(int i = 0; i < p.size(); i++){
                dummy[i] = p.get((i));
            }
            return dummy;
        };

        //TEST:
        List<Integer> labRat = new ArrayList<>(Arrays.asList(1,2,3,4,555,4,3,2,1,0,-1,-222,-3,-4));
        int[] arrLabRat = listToIntArr.apply(labRat);
        System.out.println(Arrays.toString(arrLabRat));

        List<Double> labRat1 = new ArrayList<>(Arrays.asList(1.2,3.4,555.4,3.2,1.0,-1.222,-3.4));
        double[] arrLabRat1 = listToDoubleArr.apply(labRat1);
        System.out.println(Arrays.toString(arrLabRat1));

        System.out.println(minNum.apply(labRat));
        System.out.println(maxNum.apply(labRat));

        List<String> labRat3 = new ArrayList<>(Arrays.asList("applying experiment on LabRat#3....... ".split(" ")));
        System.out.println(longestStr.apply(labRat3));
        System.out.println(shortestStr.apply(labRat3));
    }
}
