package JavaProgram;

//Superclass for vehicle with properties speed and mileage
class Vehicle {
    private double speed;
    private double mileage;
//Constructor for speed and mileage
    public Vehicle(double speed, double mileage) {
        this.speed = speed;
        this.mileage = mileage;
    }
//to get the value of speed
    public double getSpeed() {
        return speed;
    }
//to modify the value of speed
    public void setSpeed(double speed) {
        this.speed = speed;
    }
  //to get the value of mileage
    public double getMileage() {
        return mileage;
    }
  //to modify the value of mileage
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}
//additional properties for car
class Car extends Vehicle {
    private int numDoors;

    public Car(double speed, double mileage, int numDoors) {
        super(speed, mileage);
        this.numDoors = numDoors;
    }
  //to get the value of number of Doors
    public int getNumDoors() {
        return numDoors;
    }
  //to modify the value of number of Doors
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
}
//additional properties for bike
class Bike extends Vehicle {
    private boolean hasBasket;
    //contructor for bike
    public Bike(double speed, double mileage, boolean hasBasket) {
    	//call the superclass using super
        super(speed, mileage);
        this.hasBasket = hasBasket;
    }
//to get the value of mileage
    public boolean hasBasket() {
        return hasBasket;
    }
//to modify the value of mileage
    public void setHasBasket(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }
}
//main class to test the car and bike
public class VehiclesSuperclass {

	public static void main(String[] args) {
		//create instance for car and bike
		Car car = new Car(100, 15.5, 4);
        Bike bike = new Bike(50, 20.3, true);
        
        //To display information for car 
        System.out.println("Car Speed: " + car.getSpeed());
        System.out.println("Car Mileage: " + car.getMileage());
        System.out.println("Car Number of Doors: " + car.getNumDoors());
        
        //To display information for car
        System.out.println("Bike Speed: " + bike.getSpeed());
        System.out.println("Bike Mileage: " + bike.getMileage());
        System.out.println("Bike Has Basket: " + bike.hasBasket());
    }
}
	


        
