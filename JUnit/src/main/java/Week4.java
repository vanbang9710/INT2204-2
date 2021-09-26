public class Week4 {
    /**
     * Max of two ints
     *
     * @param a int
     * @param b int
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Min of intArray
     *
     * @param arr intArray
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int result = Integer.MAX_VALUE;
        for (int i : arr) {
            if (result > i) {
                result = i;
            }
        }
        return result;
    }

    /**
     * @param weight in kg
     * @param height in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        final double EPS = 1e-6;
        double BMI = weight / height / height;
        if (BMI < 18.5 - EPS) {
            return "Thiếu cân";
        } else if (BMI < 23 - EPS) {
            return "Bình thường";
        } else if (BMI < 25 - EPS) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}