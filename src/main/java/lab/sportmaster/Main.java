package lab.sportmaster;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        passengerCar firstCar = new passengerCar();
        passengerCar secondCar = new passengerCar(210,5,5,false,"black");
        firstCar.buyTheCar("Vlad");
        firstCar.openDoors();
        secondCar.openDoors();
        firstCar.boardAPassenger();
        firstCar.closeDoors();

        firstCar.getCarInfo();
        secondCar.getCarInfo();

        passengerCar.carsSoldCount();

        System.out.println("Passenger count: " + firstCar.getPassengersCount());

        User user1 = new User("Vlad","Borisov",24);
        User user2 = new User("Vlad","Borisov",25);
        User user3 = new User("Vlad","Borisov",26);

        user1.getUserInfo();
        user2.getUserInfo();
        user3.getUserInfo();
    }
}