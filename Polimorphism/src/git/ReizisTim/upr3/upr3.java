package git.ReizisTim.upr3;
//Включите в базовый класс Shape.java новый метод, выводящий сообщение, но не переопределяйте его в производных классах.
// Объясните результат. Переопределите его в одном из производных классов и посмотрите, что происходит. Наконец, переопределите
// метод во всех производных классах.
import java.util.Random;

public class upr3 {
    private static RandomShapeGenerator3 gen =
            new RandomShapeGenerator3();
    public static void main(String[] args) {
        Shape3[] s3 = new Shape3[9];
// Fill up the array with shapes:
        for(int i = 0; i < s3.length; i++)
            s3[i] = gen.next();
// Make polymorphic method calls:
        for(Shape3 shp : s3) {
            shp.draw();
            shp.type();
        }
    }
}
class Shape3 {
    public void draw() {}
    public void erase() {}
    public void type() {System.out.println("It's Shape!!");}
}
class Circle3 extends Shape3 {
    public void draw() { System.out.println("Circle.draw()"); }
    public void erase() { System.out.println("Circle.erase()");}
    public void type() {System.out.println("It's Circle!!");}

}
class Square3 extends Shape3 {
    public void draw() { System.out.println("Square.draw()"); }
    public void erase() { System.out.println("Square.erase()"); }
    public void type() {System.out.println("It's Square!!");}

}
class Triangle3 extends Shape3 {
    public void draw() { System.out.println("Triangle.draw()"); }
    public void erase() { System.out.println("Triangle.erase()"); }
    public void type() {System.out.println("It's Triangle!!");}

}
class RandomShapeGenerator3 {
    private Random rand = new Random(47);
    public Shape3 next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle3();
            case 1: return new Square3();
            case 2: return new Triangle3();
        }
    }
}
