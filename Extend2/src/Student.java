public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Constructor3.
     */
    public Student(String n, String a, String p, int y, double f) {
        super(n, a);
        program = p;
        year = y;
        fee = f;
    }

    /**
     * getter of program.
     */
    public String getProgram() {
        return program;
    }

    /**
     * setter of program.
     */
    public void setProgram(String p) {
        program = p;
    }

    /**
     * getter of year.
     */
    public int getYear() {
        return year;
    }

    /**
     * setter of year.
     */
    public void setYear(int y) {
        year = y;
    }

    /**
     * getter of fee.
     */
    public double getFee() {
        return fee;
    }

    /**
     * setter of fee.
     */
    public void setFee(double f) {
        fee = f;
    }

    /**
     * convert to String.
     */
    public String toString() {
        return "Student[" + super.toString() + ",program="
                + program + ",year=" + year + ",fee=" + fee + ']';
    }
}