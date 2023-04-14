package day43_OOP_Encapsulation;

public class User {
    public static void main(String[] args) {
        Credentials user1 = new Credentials();
        user1.setUsername("Bekzod");
        user1.setPassword("look12$57");
        System.out.println("Password is strong: " + user1.isStrongPassword(user1.getPassword()));
    }
}
