import static org.junit.Assert.*;
import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        assertEquals(2, Week4.max2Int(1, 2));
    }

    @Test
    public void testMax2Int2() {
        assertEquals(2, Week4.max2Int(2, 2));
    }

    @Test
    public void testMax2Int3() {
        assertEquals(2, Week4.max2Int(0, 2));
    }

    @Test
    public void testMax2Int4() {
        assertEquals(2, Week4.max2Int(-1, 2));
    }

    @Test
    public void testMax2Int5() {
        assertEquals(2, Week4.max2Int(-2, 2));
    }

    @Test
    public void testMinArray1() {
        assertEquals(0, Week4.minArray(new int[] {0, 1}));
    }

    @Test
    public void testMinArray2() {
        assertEquals(0, Week4.minArray(new int[] {0, 2}));
    }

    @Test
    public void testMinArray3() {
        assertEquals(0, Week4.minArray(new int[] {0, 3}));
    }

    @Test
    public void testMinArray4() {
        assertEquals(0, Week4.minArray(new int[] {0, 4}));
    }

    @Test
    public void testMinArray5() {
        assertEquals(0, Week4.minArray(new int[] {0, 5}));
    }

    @Test
    public void testCalculateBMI1() {
        assertEquals("Thiếu cân", Week4.calculateBMI(17, 1));
    }

    @Test
    public void testCalculateBMI2() {
        assertEquals("Thừa cân", Week4.calculateBMI(24, 1));
    }

    @Test
    public void testCalculateBMI3() {
        assertEquals("Béo phì", Week4.calculateBMI(26, 1));
    }

    @Test
    public void testCalculateBMI4() {
        assertEquals("Thiếu cân", Week4.calculateBMI(18, 1));
    }

    @Test
    public void testCalculateBMI5() {
        assertEquals("Bình thường", Week4.calculateBMI(22, 1));
    }
}