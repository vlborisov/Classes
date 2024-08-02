package lab.sportmaster;

public class passengerCar {

    static int wheelsCount = 4;
    static int carsSold;

    int horsePower;
    int passengersCount;
    int carSeatsCount;
    int doorsCount;
    boolean isNew;
    boolean isDoorsOpen;
    String color;
    String ownerName;
    double weight = 2043.450;

    public passengerCar() {
        this.doorsCount = 5;
        this.isNew = true;
        this.isDoorsOpen = false;
    }

    public passengerCar(int horsePower, int carSeatsCount, int doorsCount, boolean isNew, String color) {
        this.horsePower = horsePower;
        this.carSeatsCount = carSeatsCount;
        this.doorsCount = doorsCount;
        this.isNew = isNew;
        this.isDoorsOpen = false;
        this.color = color;
    }


    public void boardAPassenger() {
        if (!this.isDoorsOpen) {
            this.passengersCount += 1;
            System.out.println("the passenger successfully entered the car.");
        } else {
            System.out.println("the passenger cannot get into the car, the doors are closed.");
        }
    }

    public void openDoors() {
        this.isDoorsOpen = false;
    }

    public void closeDoors() {
        this.isDoorsOpen = true;
    }

    public int getPassengersCount() {
        return this.passengersCount;
    }

    public void buyTheCar(String ownerName) {
        this.ownerName = ownerName;
        this.isNew = false;
        carsSold += 1;
    }

    public static void carsSoldCount() {
        System.out.println("------------------------------------------------\nCars sold: " + carsSold + "\n------------------------------------------------");
    }

    public void getCarInfo(){
        System.out.println(String.format("------------------------------------------------\nHorse power: %s\nPassengers count: %s\nCar seats count: %s\nDoors count: %s\nIs new: %s\nIs doors open: %s\nColor: %s\nOwner name: %s\nWeight: %s\n------------------------------------------------",this.horsePower,this.passengersCount,this.carSeatsCount,this.doorsCount,this.isNew,this.isDoorsOpen, this.color, this.ownerName,this.weight));
    }


}
