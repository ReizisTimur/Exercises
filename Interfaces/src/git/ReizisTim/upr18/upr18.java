package git.ReizisTim.upr18;
//Создайте интерфейс Cycle с реализациями Unicycle, Bicycle и Tricycle. Создайте
//фабрику для каждой разновидности Cycle и код, использующий эти фабрики.
public class upr18 {
    public static void ChoiceCycle(CycleFactory clch){
        Cycle s = clch.getCycle();
        s.ride();
    }
    public static void main(String[] args){
        ChoiceCycle(new ImplUniFactory());
        ChoiceCycle(new ImplBiFactory());
        ChoiceCycle(new ImplTriFactory());

    }

}
interface Cycle{
    void ride();
}
class Unicycle implements Cycle{
    public void ride(){System.out.println("Катись, колесо");}
}
class Bicycle implements Cycle{
    public void ride(){System.out.println("Катитесь, два колеса");}
}
class Tricycle implements Cycle{
     public void ride () {System.out.println("Катитесь, три колеса");}
}
interface CycleFactory{
    Cycle getCycle();
}
class ImplUniFactory implements CycleFactory{
    public Cycle getCycle(){return new Unicycle();}
}
class ImplBiFactory implements CycleFactory{
    public Cycle getCycle(){return new Bicycle();}
}
class ImplTriFactory implements CycleFactory{
    public Cycle getCycle(){return new Tricycle();}
}