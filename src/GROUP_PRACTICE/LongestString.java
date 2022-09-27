package GROUP_PRACTICE;

public class LongestString {
    public static void main(String[] args) {

        String[] arr = {"aaaaa", "bbbbbbbbbb", "cc", "kdgufkdsjvjjj"};

        System.out.println(findLongestWord(arr));


    }


    public static String findLongestWord(String [] words){
        String longest = words[0]; // assume the first element as longest
        for(int i = 0; i < words.length; i++){
            if(longest.length() < words[i].length()){ // if the current longest element is shorter than we need to:
                longest = words[i]; // reassign the value of the old longest to the new longest
            }
        }
        return longest; // return the last assigned value to longest. If none - will return the first element ( String longest = words[0];)
    }
}
