
import java.util.ArrayList;
import java.util.List;

public class RectanglesList {
    private final List<Rectangle> rectanglesList;

    public RectanglesList() {
        rectanglesList = new ArrayList<Rectangle>();
    }

    public boolean add(Rectangle rectangle) {
        return rectanglesList.add(rectangle);
    }

    public double getAverageRectanglesArea() {
        double AverageArea = 0;
        for (Rectangle rectangle : rectanglesList)
            AverageArea += rectangle.getRectangleArea();
        AverageArea /= rectanglesList.size();
        return AverageArea;
    }

    public RectanglesList getRectanglesMoreAverageArea() {
        RectanglesList count = new RectanglesList();
        double AverageArea = getAverageRectanglesArea();
        for (Rectangle rectangle : rectanglesList)
            if (rectangle.getRectangleArea() > AverageArea)
                count.add(rectangle);
        return count;
    }

    public Rectangle getRectangleFromList(int index) {
        return rectanglesList.get(index);
    }

    public List<Rectangle> getRectanglesList() {
        return rectanglesList;
    }

    @Override
    public String toString() {
        return "\ncount rectangles more average area: " + getRectanglesMoreAverageArea().getRectanglesList().size();
    }
}
