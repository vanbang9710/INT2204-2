import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {
    private String name;
    private Integer age;
    private String address;

    /**
     * A.
     */
    public Person(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * A.
     */
    public Person() {
    }

    /**
     * A.
     */
    public static void main(String[] args) {
        List<Person> l = new ArrayList<Person>();
        l.add(new Person("Nguyen A", 22, ""));
        l.add(new Person("Nguyen A", 20, ""));
        l.add(new Person("Le B", 20, ""));
        System.out.println(l);
        Week11.sortGeneric(l);
        System.out.println(l);
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
    public Integer getAge() {
        return age;
    }

    /**
     * A.
     */
    public void setAge(Integer age) {
        this.age = age;
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

    /**
     * A.
     */
    public int compareTo(Person o) {
        int tmp = name.compareTo(o.name);
        if (tmp == 0) {
            return age.compareTo(o.age);
        }
        return tmp;
    }

    /**
     * A.
     */
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age
                + ", address='" + address + '\'' + '}';
    }
}
