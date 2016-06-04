//CHECKSTYLE:OFF
package kz.mix.e804.designPrinciplesOOP.designPatterns;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 20);

        System.out.println(circle);

        circle.setCanvas(new Canvas());
        circle.setShapeArchiver(new ShapeArchiver());
        circle.setRadius(50);

        System.out.println(circle);
    }
}
