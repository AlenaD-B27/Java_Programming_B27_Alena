package day39_practice.discord;

import day39_practice.discord.DiscordUser;

public class Admin extends DiscordUser {
//    Create a class Admin
//
//    - Admin class inherits DiscordUser class
//
//    - create constructor to call parent constructor and set up variables (role - Admin, name, id)

    static int numOfChannels;
    public Admin(String name) {
        super(name);
        setId(name + "A27");
        setRole("Admin");
    }

//    - create method:
//    createChannel()
//    Example output: prints Creating new discord channel

    public static void createChannel(){
        System.out.println("Creating new Discord channel");
        numOfChannels++;
    }

}
