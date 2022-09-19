package day44_practice.social_media;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Facebook extends SocialMedia implements HasGroups {

    Scanner input = new Scanner(System.in);

    private int age;
    private int numOfFriends;
    private ArrayList<Post> posts;

    int numOfGroups;

    static{
        platform = "Facebook";
    }

    public Facebook(String username, String password) {
        this.username = username;
        if (password.contains(username)){
            System.out.println("Password contained username.");
            this.password = "password";
        } else {
            this.password = password;
        }
        personalUrl = "facebook.com/" + username;
        this.posts = new ArrayList<>();
    }

    public Facebook(String username, String password, String fullName) {
        this(username, password);
        for(char eachChar : fullName.toCharArray()){
            if(eachChar >= 'a' && eachChar <= 'z' || eachChar >= 'A' && eachChar <= 'Z' || eachChar == ' '){
                this.fullName = fullName;
            } else {
                System.out.println("invalid name");
                this.fullName = "no name";
                break;
            }
        }
    }

    public Facebook (String username, String password, String fullName, int age, int numOfFriends){
        this(username, password, fullName);
        if(age >= 0){
            this.age = age;
        }else{
            this.age = 0;
            System.out.println("Invalid age");
        }

        if(numOfFriends > 5000 || numOfFriends < 0){
            this.numOfFriends = numOfFriends;
        }else{
            System.out.println("Invalid number of friends");
        }
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumOfFriends() {
        return numOfFriends;
    }

    public void setNumOfFriends(int numOfFriends) {
        this.numOfFriends = numOfFriends;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    @Override
    public void directMessaging(String username, String message) {
        System.out.println(message + " sent to " + username);
    }

    @Override
    public void post(Object media) {
//        System.out.println("Input the post body:");
//        media = new Post(input.nextLine());
        System.out.println(media);
        posts.add((Post)media); // something is wrong here
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
    public void joinGroup(String group) {
        System.out.println(fullName + " has joined " + group);
        numOfGroups++;
    }

    @Override
    public void leaveGroup(String group) {
        System.out.println(fullName + " has left " + group);
        numOfGroups--;
    }

    public boolean sendFriendRequest(Facebook user){
        if(numOfFriends == 5000){
            System.out.println("You have reached the limit of friends.");
            return false;
        } else if(user.numOfFriends == 5000) {
            System.out.println(user.fullName + " cannot accept any more friend request.");
            return false;
        } else {
            System.out.println("Friend request sent to " + user.fullName);
            numOfFriends++;
            user.numOfFriends++;
            return true;
        }
    }



    @Override
    public String toString() {
        return "Facebook{" +
                "age=" + age +
                ", numOfFriends=" + numOfFriends +
                ", posts=" + posts +
                ", personalUrl='" + personalUrl + '\'' +
                ", accountLength=" + accountLength +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }

}
