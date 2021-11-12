import java.util.Collections;
import java.util.List;

public class Week11 {
    /**
     * A.
     */
    public static <T extends Comparable<T>> List<T> sortGeneric(List<T> a) {
        for (int i = 0; i < a.size(); ++i) {
            T ai = a.get(i);
            int minI = i;
            for (int j = i + 1; j < a.size(); ++j) {
                if (a.get(j).compareTo(a.get(minI)) < 0) {
                    minI = j;
                }
            }
            if (a.get(minI).compareTo(ai) < 0) {
                Collections.swap(a, i, minI);
            }
        }
        return a;
    }
}
