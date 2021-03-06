import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {
    public static final String NO_BUG = "Không có lỗi";

    /**
     * A.
     */
    public static void nullPointerEx() throws NullPointerException {
        Integer x = null;
        x.equals(x);
    }

    /**
     * A.
     */
    public static String nullPointerExTest() {
        try {
            nullPointerEx();
            return NO_BUG;
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
    }

    /**
     * A.
     */
    public static void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        int[] l = new int[1];
        l[1] = 0;
    }

    /**
     * A.
     */
    public static String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
            return NO_BUG;
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
    }

    /**
     * A.
     */
    public static void arithmeticEx() throws ArithmeticException {
        int i = 1 / 0;
    }

    /**
     * A.
     */
    public static String arithmeticExTest() {
        try {
            arithmeticEx();
            return NO_BUG;
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
    }

    /**
     * A.
     */
    public static void fileNotFoundEx() throws FileNotFoundException {
        File file = new File("E://BlaBlo.txt");
        FileReader fr = new FileReader(file);
    }

    /**
     * A.
     */
    public static String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
            return NO_BUG;
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
    }

    /**
     * A.
     */
    public static void ioEx() throws IOException {
        throw new IOException();
    }

    /**
     * A.
     */
    public static String ioExTest() {
        try {
            ioEx();
            return NO_BUG;
        } catch (IOException e) {
            return "Lỗi IO";
        }
    }

    public static void main(String[] args) {
        System.out.println(ioExTest());
    }
}
