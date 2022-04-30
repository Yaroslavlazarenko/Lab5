public class Rectangles {
    private final Rectangle[] rectangles;
    private double AverageArea;
    private int index;

    public Rectangles(int amount) {
        rectangles = new Rectangle[amount];
        index = -1;
    }

    public void setRectangle(Rectangle rectangle) {
        if(++index<rectangles.length)
            this.rectangles[index] = rectangle;
    }

    public Rectangle getRectangle(int index) {
        return this.rectangles[index];
    }

    public void setAverageRectanglesArea(){
        for (int i = 0; i < index; i++)
            AverageArea+=this.rectangles[i].getRectangleArea();
        AverageArea/=index;
    }

    public int getRectanglesMoreAverageArea(){
        int count=0;
        for (int i = 0; i < index; i++)
            if(rectangles[i].getRectangleArea()>AverageArea)
                count++;
        return count;
    }

    public double getAverageRectanglesArea(){
        return AverageArea;
    }
}
