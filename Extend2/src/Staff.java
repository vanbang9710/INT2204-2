public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Constructor3.
     */
    public Staff(String n, String a, String s, double p) {
        super(n, a);
        school = s;
        pay = p;
    }

    /**
     * getter of school.
     */
    public String getSchool() {
        return school;
    }

    /**
     * setter of school.
     */
    public void setSchool(String s) {
        school = s;
    }

    /**
     * getter of pay.
     */
    public double getPay() {
        return pay;
    }

    /**
     * setter of pay.
     */
    public void setPay(double p) {
        pay = p;
    }

    /**
     * convert to String.
     */
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + ']';
    }
}