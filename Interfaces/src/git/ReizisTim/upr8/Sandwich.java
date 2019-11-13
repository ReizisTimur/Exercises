package git.ReizisTim.upr8;
//В программе Sandwich из главы 8 создайте интерфейс с именем Fastfood
//(с подходящими методами); измените класс Sandwich Tak, чтобы он реализовал
//этот интерфейс.
//class Meal {
//    Meal() { System.out.println("Meal()"); }
//}
//class Pickle {
//    Pickle() { System.out.println("Pickle()"); }
//}
//class Bread {
//    Bread() { System.out.println("Bread()"); }
//}
//class Cheese {
//    Cheese() { System.out.println("Cheese()"); }
//}
//class Lettuce {
//    Lettuce() { System.out.println("Lettuce()"); }
//}
//class Lunch extends Meal {
//    Lunch() { System.out.println("Lunch()"); }
//}
//class PortableLunch extends Lunch {
//    PortableLunch() { System.out.println("PortableLunch()");}
//}
interface Fastfood{
    void Meal();
    void Lunch();
    void PortableLunch();
    void Bread();
    void Cheese();
    void Lettuce();
    void Pickle();

}
public class Sandwich implements Fastfood {
    public Sandwich(){
        System.out.println("Sandwich()");
        PortableLunch();
        Bread();
        Cheese();
        Lettuce();
        Pickle();
    }

    public void Meal(){System.out.println("Meal()");}
    public void Lunch() {
        System.out.println("Lunch()");
        Meal();
    }
    public void PortableLunch(){
        System.out.println("PortableLunch()");
        Lunch();
    }
    public void Bread(){ System.out.println("Bread()"); }
    public void Cheese(){ System.out.println("Cheese()"); }
    public void Lettuce(){ System.out.println("Lettuce()"); }
    public void Pickle(){ System.out.println("Pickle()"); }
    public static void main(String[] args) {
        Sandwich s = new Sandwich();
    }
}
