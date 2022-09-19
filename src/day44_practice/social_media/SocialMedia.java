package day44_practice.social_media;

public abstract class SocialMedia {

    String personalUrl;
    int accountLength;
    static String platform;
    String username;
    String password;
    String fullName;

//following abstract methods:

    public abstract void directMessaging(String username, String message);
    public abstract void post(Object media);
    public abstract void notifications();




}
