package day39_practice.apps;

public class App {
//    Create an App class
//
//    - create variables:
//    name (app name), version

    String name;
    double version;

//    - create constructor to initialize the variables

    public App(String name, double version) {
        this.name = name;
        this.version = version;
    }


//    - create method:
//    download()
//    Example output: prints $name is downloading version $version

    public void download(){
        System.out.println(name + " is downloading version " + version);
    }
}
