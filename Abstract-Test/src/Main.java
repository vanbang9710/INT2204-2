public class Main {
    /**
     * A.
     */
    public static void main(String[] args) {
        Person p = new Person("Nguyen Van A", "144 Xuan Thuy, Cau Giay, HN");
        Car c = new Car("Mercedes-Benz", "S400", "30A - 888.88", p, 4);
        MotorBike m = new MotorBike("Yamaha", "YZF-R6", "29 - P1 686.68", p,
                false);
        p.addVehicle(c);
        p.addVehicle(c);
        p.addVehicle(m);
        p.addVehicle(m);
        System.out.println(p.getVehiclesInfo());
    }
}
