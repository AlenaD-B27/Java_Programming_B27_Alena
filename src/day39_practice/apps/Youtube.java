package day39_practice.apps;

public class Youtube extends App{
//    Create a class Youtube
//
//    - Youtube class inherits App class
//
//    - create constructor to call parent constructor and set up variables (name and version)
//

    public Youtube(String name, double version){
        super(name, version);
    }
//    - create method:
//    watchVideo()
//    Example output: prints Watching java tutorial

    public void watchVideo(String video){
        System.out.println("Watching " + video);
    }
}
