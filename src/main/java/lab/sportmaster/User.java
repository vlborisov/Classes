package lab.sportmaster;

import java.util.ArrayList;
import java.util.Random;

public class User {

    private static ArrayList<Integer> idArr = new ArrayList<Integer>();

    private Integer id;
    private String firstName;
    private String secondName;
    private Integer age;

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

    public static void getUsersId() {
        System.out.println("------------------------------------------------\nВсе Id пользователей:");
        for (Integer integer : idArr) {
            System.out.println(integer);
        }
        System.out.println("------------------------------------------------\n");
    }

    public void deleteUser() {
        idArr.remove((Integer) this.id);
        this.id = null;
        this.firstName = null;
        this.secondName = null;
        this.age = null;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
