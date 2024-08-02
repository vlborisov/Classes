package lab.sportmaster;

import java.util.Random;

public class User {

    static int ArrayList

    int id;
    String firstName;
    String secondName;
    int age;

    public User(String firstName, String secondName, int age){
        this.id = generateId();
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    private int generateId(){
        Random random = new Random();
        int generateId = random.nextInt(100000000);
        return generateId;
    }

    public void getUserInfo(){
        System.out.printf("------------------------------------------------\nUser info:\nId: %d\nFirst name: %s\nSecond name: %s\nAge: %d\n------------------------------------------------",this.id,this.firstName,this.secondName,this.age);
    }
}
