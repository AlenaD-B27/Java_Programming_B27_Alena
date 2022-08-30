package day35_practice.song;
/*
 create a class called Song

        - data:

            name, length, artist, genre

        - constructor

            - create a constructor that creates a Song object with the name, length, artist, and genre

        - method:

            toString()
                print all the Song information

    Create a separate class to create and test the Song objects

 */
public class Song {
    String name;
    double length;
    String artist;
    String genre;

    public Song(String name, double length, String artist, String genre){
        this.name = name;
        this.length = length;
        this.artist = artist;
        this.genre = genre;
    }

    public Song (String name, double length){
        this.name = name;
        this.length = length;
    }


    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
