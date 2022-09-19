package day44_practice.social_media;

import java.util.ArrayList;
import java.util.Arrays;

public class Internet {
    public static void main(String[] args) {

        Facebook obj1 = new Facebook("sunnyday", "12345");
        Facebook obj2 = new Facebook("latenight", "54321", "Kate Smith", 22,-1);
        Facebook obj3 = new Facebook("lovelife", "abcde", "Michael Jordan");
        Instagram obj4 = new Instagram("woodenspoon", "helloworld");
        Instagram obj5 = new Instagram("tellmeyes", "donttellmeno");

        obj5.fullName = "Kate Smith";

        ArrayList <SocialMedia> database = new ArrayList<>();
        database.addAll(Arrays.asList(obj1, obj2, obj3, obj4, obj5));

        obj1.directMessaging(obj2.username, "Hello friend");
        obj1.sendFriendRequest(obj3);
        obj1.post("Today is a beautiful day");
        obj1.notifications();

        System.out.println(database);


//        for (SocialMedia eachUser : database){
//            if(eachUser instanceof Instagram){
//                eachUser.likePicture();
//            }
//        }

//        for (int i = 0; i < database.size(); i++){
//            for(SocialMedia eachUser : database){
//                if (database.get(i).fullName.equals(eachUser.fullName) && database.get(i) instanceof Facebook && eachUser instanceof Instagram)){
//                    System.out.println(database.get(i).username + " and " + eachUser.username + " is the same person");
//                }
//            }
//        }



//        Extra: Make a bunch of objects and try different things out
//
//                - Create an ArrayList of Social Media objects to store both
//        Facebook and Instagram objects
//
//        - Find all the Facebook objects that had less than 5000 friends to
//        they could be added
//
//        - Go through all the Instagram objects and like a picture from each
//                object
//
//        - Check which user has both Instagram and Facebook object by
//        comparing their full names
















    }
}
