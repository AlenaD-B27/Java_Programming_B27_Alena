package day39_practice.apps;

public class Instagram extends App {
//    Create a class Instagram
//
//    - Instagram class inherits App class
//
//    - create constructor to call parent constructor and set up variables (name and version)

    public Instagram(String name, double version){
        super(name, version);
    }


//    - create method:
//    postPicture()
//    Example output: prints Posting picture to Instagram
    public void postPicture(){
        System.out.println("Posting picture to Instagram");
    }
}
