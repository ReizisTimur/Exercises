package git.ReizisTim;

public class upr17 {
    public static void main(String[] args){
        Frog1 kva1 = new Frog1();
        kva1.live(kva1);
    }
}
class Amphibian1{
    void jump(){System.out.println("Jump!");}
    void swim(){System.out.println("Swimm!");}
    void eat(){System.out.println("Eat");}
    void live(Amphibian1 fr){fr.eat();fr.jump();fr.swim();}
}
class Frog1 extends Amphibian1{
    void swim(){System.out.println("Swimm!!!!");}
}
