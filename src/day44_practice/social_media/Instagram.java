package day44_practice.social_media;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;


public class Instagram extends SocialMedia implements HasPictures{

    Scanner input = new Scanner(System.in);

    private int numOfFollowers;
    private int numOfFollowing;
    private ArrayList <Picture> pictures;


    public Instagram(String username, String password) {
        this.username = username;
        if (password.contains(username)){
            System.out.println("Password contained username.");
            this.password = "password";
        } else {
            this.password = password;
        }
        personalUrl = "Instagram.com/" + username;
        this.pictures = new ArrayList<>();
    }


    static{
        platform = "Instagram";
    }

    public int getNumOfFollowers() {
        return numOfFollowers;
    }

    public void setNumOfFollowers(int numOfFollowers) {
        this.numOfFollowers = numOfFollowers;
    }

    public int getNumOfFollowing() {
        return numOfFollowing;
    }

    public void setNumOfFollowing(int numOfFollowing) {
        this.numOfFollowing = numOfFollowing;
    }

    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(ArrayList<Picture> pictures) {
        this.pictures = pictures;
    }

    @Override
    public void directMessaging(String username, String message) {
        System.out.println(message + " sent to " + username);
    }

    @Override
    public void post(Object media) {
        System.out.println("Input the image and caption (press ENTER after image input):");
        media = new Picture(input.nextBigInteger().toByteArray(), ".jpeg", input.nextLine());
        pictures.add((Picture)media);
    }

    @Override
    public void notifications() {
        if(LocalTime.now().getHour() >= 8 && LocalTime.now().getHour() <= 17){
            System.out.println("Notification");
        } else {
            System.out.println("Sleep mode");
        }
    }

    @Override
    public void likePicture() {
        System.out.println("Liked the picture");
    }

    @Override
    public void unLikePicture() {
        System.out.println("Unliked the picture");
    }

    @Override
    public void sharePicture() {
        System.out.println("Picture is shared");
        pictures.add(new Picture(input.nextBigInteger().toByteArray(), ".jpeg", input.nextLine()));
    }

    @Override
    public String toString() {
        return "Instagram{" +
                "input=" + input +
                ", numOfFollowers=" + numOfFollowers +
                ", numOfFollowing=" + numOfFollowing +
                ", pictures=" + pictures +
                ", personalUrl='" + personalUrl + '\'' +
                ", accountLength=" + accountLength +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
