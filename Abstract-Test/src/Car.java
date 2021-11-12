public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * A.
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * A.
     */
    public String getInfo() {
        return "Car:" + "\n\tBrand: " + brand + "\n\tModel: " + model
                + "\n\tRegistration Number: " + registrationNumber
                + "\n\tNumber of Doors: " + numberOfDoors
                + "\n\tBelongs to " + owner.getName() + " - " + owner.getAddress() + "\n";
    }

    /**
     * A.
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * A.
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
