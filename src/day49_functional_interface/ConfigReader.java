package day49_functional_interface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();
    /*
    private: only accessible in the same class
    static:  access by the class name instead of needed to create an object
    Properties: we are creating an object of this class to connect a properties (test.properties) to a java object
     */

    static {

        try {
            // Creates a file object, allows us to connect to a file
            FileInputStream file = new FileInputStream("test.properties");

            // loads the files into the properties object
            properties.load(file);

        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

    }

    /*

        static block: run the code in the beginning to make sure everything is set up

        FileInputStream: connect to a file -> allows access to the information in some way
            -> checked exception occurs so we need to handle with try catch

     */

    /*

    summary:

        1) creates a properties file called: test.properties
            had some information
        2) created a class called ConfigReader
        3) in Config Reader we created a Properties object
        4) in the static block we connected to the file, using FileInputStream
        5) used the load method from the Properties object to load the information from the file to the Properties object

     */

    public static String getProperty(String key){
        return properties.getProperty(key);
    }



}
