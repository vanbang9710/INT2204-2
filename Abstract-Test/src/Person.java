import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    /**
     * A.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * A.
     */
    public void addVehicle(Vehicle vehicle) {
        for (Vehicle v : vehicleList) {
            if (v.getRegistrationNumber().equals(vehicle.getRegistrationNumber())) {
                return;
            }
        }
        vehicleList.add(vehicle);
    }

    /**
     * A.
     */
    public void removeVehicle(String registrationNumber) {
        for (int i = vehicleList.size() - 1; i >= 0; --i) {
            if (vehicleList.get(i).getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(i);
            }
        }
    }

    /**
     * A.
     */
    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return name + " has no vehicle!";
        }
        String ans = name + " has:\n\n";
        for (Vehicle v : vehicleList) {
            ans += v.getInfo();
        }
        return ans;
    }

    /**
     * A.
     */
    public String getName() {
        return name;
    }

    /**
     * A.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A.
     */
    public String getAddress() {
        return address;
    }

    /**
     * A.
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
