package lab.sportmaster;

import java.util.ArrayList;
import java.util.Random;

public class User {

    private static ArrayList<Integer> idArr = new ArrayList<Integer>();

    int id;
    String firstName;
    String secondName;
    int age;

    public User(String firstName, String secondName, int age) {
        this.id = generateId();
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    private int generateId() {
        Random random = new Random();
        while (true) {
            int generateId = random.nextInt(100000000);
            if (!idArr.contains(generateId)) {
                idArr.add(generateId);
                return generateId;
            }
        }
    }

    public void getUserInfo() {
        System.out.printf("------------------------------------------------\nUser info:\nId: %d\nFirst name: %s\nSecond name: %s\nAge: %d\n------------------------------------------------\n", this.id, this.firstName, this.secondName, this.age);
    }

    public static void getUsersId(){
        System.out.println("Все Id пользователей:");
        for (Integer integer : idArr) {
            System.out.println(integer);
        }
    }
}
