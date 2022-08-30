package day39_practice.discord;

public class Student extends DiscordUser {
//    Create a class Student
//
//    - Student class inherits DiscordUser class
//
//    - create constructor to call parent constructor and set up variables (role - Student, name, id)

    public Student(String name) {
        super(name);
        setId("S27");
        setRole("Student");
    }


//    - create method:
//    sendMessage()
//    Example output: prints Sending message to class chat

    public void sendMessage(){
        System.out.println(role + " " + name + id + " is sending message to class chat");
    }

}
