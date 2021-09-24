public class Student {

    /**
     * khai bao cac thuoc tinh cho Student.
     */
    private String name;
    private String id;
    private String group;
    private String email;

    /**
     * Getter of name.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter of name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter of id.
     */
    public String getId() {
        return id;
    }

    /**
     * Setter of id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter of group.
     */
    public String getGroup() {
        return group;
    }

    /**
     * Setter of group.
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Getter of email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter of email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get Info. Type: Nguyen Van An – 17020001 – K62CC – 17020001@vnu.edu.vn.
     */
    public String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }

    /**
     * Constructor 1.
     */
    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2 with name, id, email.
     */
    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    /**
     * Constructor 3 with Student s.
     */
    public Student(Student s) {
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

}