public class StudentManagement {

    /**
     * khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100).
     */
    private Student[] students = new Student[100];
    private int studentNumber = 0;

    /**
     * Check if s1, s2 are in the same group.
     *
     * @param s1 String
     * @param s2 String
     * @return Boolean
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * Add a new student.
     *
     * @param newStudent Student
     */
    public void addStudent(Student newStudent) {
        students[studentNumber++] = newStudent;
    }

    /**
     * List student's infos by group.
     *
     * @return String
     */
    public String studentsByGroup() {
        String[] groups = new String[100];
        int groupNumber = 0;
        String ans = "";
        for (int i = 0; i < studentNumber; ++i) {
            String groupI = students[i].getGroup();
            int j;
            for (j = 0; j < groupNumber; ++j) {
                if (groupI.equals(groups[j])) {
                    break;
                }
            }
            if (j >= groupNumber) {
                groups[groupNumber++] = groupI;
                ans += groupI + '\n';
                for (j = i; j < studentNumber; ++j) {
                    if (students[j].getGroup().equals(groupI)) {
                        ans += students[j].getInfo() + '\n';
                    }
                }
            }
        }
        return ans;
    }

    /**
     * remove Student.
     *
     * @param id String
     */
    public void removeStudent(String id) {
        for (int i = 0; i < studentNumber; ++i) {
            if (students[i].getId().equals(id)) {
                --studentNumber;
                for (int j = i; j < studentNumber; ++j) {
                    students[j] = students[j + 1];
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}