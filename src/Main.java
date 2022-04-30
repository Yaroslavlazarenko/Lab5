import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        task1();
    }

    /**
     * Создать класс прямоугольник, члены класса – длины сторон a и b. Предусмотреть в классе
     * методы вычисления и вывода сведений о фигуре – длины сторон, диагоналей, периметр, площадь.
     * Создать производный класс – параллелепипед с высотой с, добавить в класс метод определения
     * объема фигуры, перегрузить методы расчета площади и вывода сведений о фигуре.
     * <p>
     * Написать программу, демонстрирующую работу с классом: дано N прямоугольников и M параллелепипедов,
     * найти количество прямоугольников, у которых площадь больше средней площади прямоугольников и
     * количество кубов (все ребра равны).
     */
    private static void task1() {
        Scanner scanner = new Scanner(System.in);
        final int N = (byte) (Math.random() * 4 + 3);
        final int M = (byte) (Math.random() * 4 + 3);
        double rectangleLength;
        double rectangleWidth;
        double rectangleHeight;

        final Rectangles rectangles = new Rectangles(N);
        final Parallelepipeds parallelepipeds = new Parallelepipeds(M);

        //fill rectangles
        rectangles.setRectangle(new Rectangle());
        do {
            System.out.print("Enter a rectangle length: ");
            rectangleLength = scanner.nextDouble();
        } while (!Untiled.correctSide(rectangleLength));
        do {
            System.out.println("Enter a rectangle width: ");
            rectangleWidth = scanner.nextDouble();
        } while (!Untiled.correctSide(rectangleWidth));
        rectangles.getRectangle(0).setRectangleInfo(rectangleLength, rectangleWidth);

        for (int i = 1; i < N; i++) {
            rectangles.setRectangle(new Rectangle());
            rectangles.getRectangle(i).setRectangleInfo(Math.random() * 20 + 1, Math.random() * 20 + 1);
        }

        parallelepipeds.setParallelepiped(new Parallelepiped());
        do {
            System.out.print("Enter a parallelepiped height: ");
            rectangleHeight = scanner.nextDouble();
        } while (!Untiled.correctSide(rectangleHeight));
        do {
            System.out.print("Enter a parallelepiped width: ");
            rectangleWidth = scanner.nextDouble();
        } while (!Untiled.correctSide(rectangleWidth));
        do {
            System.out.print("Enter a parallelepiped length: ");
            rectangleLength = scanner.nextDouble();
        } while (!Untiled.correctSide(rectangleLength));
        parallelepipeds.getParallelepiped(0).setParallelepipedInfo(rectangleHeight, rectangleWidth, rectangleLength);

        for (int i = 1; i < M; i++) {
            parallelepipeds.setParallelepiped(new Parallelepiped());
            parallelepipeds.getParallelepiped(i).setParallelepipedInfo(Math.random() * 20 + 1, Math.random() * 20 + 1, Math.random() * 20 + 1);
        }

        rectangles.setAverageRectanglesArea();
        System.out.println("Количество прямоугольников площадь которых больше средней площади всех: " + rectangles.getRectanglesMoreAverageArea());

        System.out.println("Количество кубов: " + parallelepipeds.getCountOfCubes());
    }
}
