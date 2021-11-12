public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * A.
     */
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    /**
     * A.
     */
    public abstract String getInfo();

    /**
     * A.
     */
    public void transferOwnership(Person newOwner) {
        owner.removeVehicle(registrationNumber);
        owner = newOwner;
        owner.addVehicle(this);
    }

    /**
     * A.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * A.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * A.
     */
    public String getModel() {
        return model;
    }

    /**
     * A.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * A.
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * A.
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * A.
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * A.
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
