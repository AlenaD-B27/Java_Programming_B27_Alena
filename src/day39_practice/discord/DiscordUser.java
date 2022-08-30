package day39_practice.discord;

public class DiscordUser {
//    Create an DiscordUser class
//
//    - create variables:
//    role, name, id

    String role;
    String name;
    String id;
//    - create constructor to initialize the variables

    public DiscordUser(String name) {
        this.name = name;
    }
    public DiscordUser(String role, String name, String id) {
        this(name);
        this.role = role;
        this.id = id;
    }

    protected void setRole(String role) {
        this.role = role;
    }

    protected void setId(String id) {
        this.id = id;
    }

    //    - create a toString() method


    @Override
    public String toString() {
        return "DiscordUser{" +
                "role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
