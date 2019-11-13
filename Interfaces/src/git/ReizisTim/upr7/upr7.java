package git.ReizisTim.upr7;
//Измените упражнение 9 из главы 8 так, 4To6b1 TUI Rodent был оформлен Kak
//интерфейс.
public class upr7 {
    public static void main(String[] args){
        Rodent[] rodentsMas = new Rodent[3];
        rodentsMas[0] = new Mouse();
        rodentsMas[1] = new Hamster();
        rodentsMas[2] = new Otter();
        rodentsMas[0].test();
        rodentsMas[1].test();
        rodentsMas[2].test();


    }
}
interface Rodent{
    void go();
    void eat();
    void swim();
    void test();
}
class Mouse implements Rodent{
    public void go(){System.out.println("Мышь кродется");}
    public void eat(){System.out.println("Мышь ест");}
    public void swim(){System.out.println("Мышь тонет");}
    public void test(){this.go(); this.eat(); this.swim();};

}
class Hamster implements Rodent{
    public void go(){System.out.println("Хомяк бегает");}
    public void eat(){System.out.println("Хомяк хрумкает");}
    public void swim(){System.out.println("Хомяк бульк");}
    public void test(){this.go(); this.eat(); this.swim();};
}
class Otter implements Rodent{
    public void go(){System.out.println("Выдра плавает");}
    public void eat(){System.out.println("Выдра ест рыбу");}
    public void swim(){System.out.println("Выдра бульк-бульк");}
    public void test(){this.go(); this.eat(); this.swim();};

}
