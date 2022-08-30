package day21_practice;

public class Initials {
    /*
    Create a String array that has full names. Go through manually and print the initials of each name. Get each name(element) and use the String methods needed

    Ex: ["James Bonds", "Harry Potter", "Tony Stark"]

        JB
        HP
        TS

No loop yet
     */

    public static void main(String[] args) {

        String fullNames[] = {"James Bonds", "Harry Potter", "Tony Stark"};
        String initials = "";

        initials += fullNames[0].charAt(0);
        int space = fullNames[0].indexOf(' ');
        initials += fullNames[0].charAt(space + 1);
        System.out.println(initials);

        initials = "";

        initials += fullNames[1].charAt(0);
        space = fullNames[1].indexOf(' ');
        initials += fullNames[1].charAt(space + 1);
        System.out.println(initials);

        initials = "";

        initials += fullNames[2].charAt(0);
        space = fullNames[2].indexOf(' ');
        initials += fullNames[2].charAt(space + 1);
        System.out.println(initials);

        System.out.println("========  ONE MORE SOLUTION: =========");

        String names[] = {"Jessica Alba", "Emilia Clark", "Pamella Anderson"};
        int whereSpace = names[0].indexOf(' ');
        System.out.println("" + names[0].charAt(0) + names[0].charAt(whereSpace + 1));
        whereSpace = names[1].indexOf(' ');
        System.out.println("" + names[1].charAt(0) + names[1].charAt(whereSpace + 1));
        whereSpace = names[2].indexOf(' ');
        System.out.println("" + names[2].charAt(0) + names[2].charAt(whereSpace + 1));

        System.out.println("========= LET'S TRY IT IN A LOOP: ==========");

        String bottles[] = {"Johny Walker", "Jack Daniels", "Makers Mark"};


        for (int i = 0; i < bottles.length; i++) { // how many names I need to transform into initials in my Array ==> 3, from the first index (which is 0) to the last index;
         //   0 => "Johny Walker"; 1 => "Jack Daniels"; 2 => "Makers Mark";
            // let's say if it is the bottles on the shelf - each bottle has its own numbered place, and it's our i.

                int spaceIndex = bottles[i].indexOf(' ');
                System.out.println("" + bottles[i].charAt(0) + bottles[i].charAt(spaceIndex + 1));

        }





















    }










}
