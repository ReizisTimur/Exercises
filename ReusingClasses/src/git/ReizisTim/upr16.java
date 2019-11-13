package git.ReizisTim;
// Создайте класс с именем Amphibian. Объявите производный от него класс с именем Frog. Разместите в базовом классе
// несколько методов. В методе main() создайте объект Frog, преобразуйте его в Amphibian и продемонстрируйте, что все
// методы работают.
public class upr16 {
    public static void main(String[] args){
        Frog kva = new Frog();
        kva.live(kva);
    }
}
class Amphibian{
    void jump(){System.out.println("Jump!");}
    void swim(){System.out.println("Swimm!");}
    void eat(){System.out.println("Eat");}
    void live(Amphibian fr){fr.eat();fr.jump();fr.swim();}
}
class Frog extends Amphibian{
}
