public class Person {
    private String name;
    private String address;

    /**
     * Constructor3.
     */
    public Person(String n, String a) {
        name = n;
        address = a;
    }

    /**
     * getter of name.
     */
    public String getName() {
        return name;
    }

    /**
     * getter of address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * setter of address.
     */
    public void setAddress(String a) {
        address = a;
    }

    /**
     * convert to String.
     */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + ']';
    }
}
