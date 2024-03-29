package git.ReizisTim.upr12;
interface CanFight {
    void fight();
}
interface CanSwim {
    void swim();
}
interface CanFly {
    void fly();
}
interface CanClimb {
    void climb();
}
class ActionCharacter {
    public void fight() {System.out.println("Fight");}
}
class Hero extends ActionCharacter
        implements CanFight, CanSwim, CanFly, CanClimb{
    public void swim() {System.out.println("Swim");}
    public void fly() {System.out.println("Fly");}
    public void climb() {System.out.println("Climb");}
}
public class Adventure {
    public static void t(CanFight x) { x.fight(); }
    public static void u(CanSwim x) { x.swim(); }
    public static void v(CanFly x) { x.fly(); }
    public static void w(ActionCharacter x) { x.fight(); }
    public static void c(CanClimb x) { x.climb();}
    public static void main(String[] args) {
        Hero h = new Hero();
        t(h); // Treat it as a CanFight
        u(h); // Treat it as a CanSwim
        v(h); // Treat it as a CanFly
        w(h); // Treat it as an ActionCharacter
        c(h);
    }
}
