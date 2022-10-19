package GROUP_PRACTICE;

public class DogEatsShoes {
    public static void main(String[] args) {

        String usersText = "If a dog chews shoes, whose shoes does he choose? I know whose shoes.";
        String s1 = "whose shoes";
        String s2 = s1.replace(" ", ""); // s2 = whoseshoes


        if (usersText.contains(s1)) { // = true :
            usersText = usersText.replace("whose shoes", "whoseshoes".toUpperCase()); // "If a dog chews shoes, WHOSESHOES does he choose? I know WHOSESHOES."

            System.out.println(usersText);
        }



        String x = "apple"; // I want it to be aple
        x = x.replace("p", ""); // ===> ale

        String x1 = "apple"; // I want it to be aple
        x1 = x1.replaceFirst("p", ""); // aple    yaaaaay!!!!

        // replace method handles all the occurrences, replaceFirst method handles just the first occurrence


        System.out.println(1 + 2 + 3 + 4); // 10
        System.out.println("" + 1 + 2 + 3 + 4); // 1234
        System.out.println('a' + 'b' + 'c'); // 294 <--- (97 + 98 + 99)
        System.out.println("" + 'a' + 'b' + 'c'); // abc

        int count = 3;
        String s = "333333";
        System.out.println(count + s); // 3 + "333333"  => concatenation when "+" is for String type.


    }
}
