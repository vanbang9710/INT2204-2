import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    /**
     * addShape.
     */
    public void addShape(Shape s) {
        shapes.add(s);
    }

    /**
     * removeCircles.
     */
    public void removeCircles() {
        for (int i = shapes.size() - 1; i >= 0; --i) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
            }
        }
    }

    /**
     * getInfo.
     */
    public String getInfo() {
        String ans = "Layer of crazy shapes:";
        for (Shape s : shapes) {
            ans += "\n" + s.toString();
        }
        return ans;
    }

    /**
     * removeDuplicates.
     */
    public void removeDuplicates() {
        /*
        List<Shape> tmp = shapes.stream()
                .distinct()
                .collect(Collectors.toList());
        shapes.clear();
        shapes.addAll(tmp);
        */

        for (int i = 0; i < shapes.size(); ++i) {
            Shape s = shapes.get(i);
            for (int j = shapes.size() - 1; j > i; --j) {
                if (shapes.get(j).equals(s)) {
                    shapes.remove(j);
                }
            }
        }
    }
}
