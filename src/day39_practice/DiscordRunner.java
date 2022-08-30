package day39_practice;

import day39_practice.discord.Admin;
import day39_practice.discord.DiscordUser;
import day39_practice.discord.Student;

public class DiscordRunner {
    public static void main(String[] args) {
        Admin admin1 = new Admin("Saim");
        Student student1 = new Student("Alena");

        System.out.println(student1);

        DiscordUser user1 = new DiscordUser("James Bond");
        System.out.println(user1);
        Admin.createChannel();
    }
}
