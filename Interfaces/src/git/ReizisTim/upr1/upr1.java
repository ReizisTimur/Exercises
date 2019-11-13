package git.ReizisTim.upr1;
//Измените упражнение 9 из предыдущей главы так, чтобы класс Rodent стал
//абстрактным (abstract) классом. Сделайте некоторые методы класса Rodent аб-
//страктными (там, где это оправданно).
public class upr1 {
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
abstract class Rodent{
    abstract void go();
    abstract void eat();
    abstract void swim();
    void test(){this.go(); this.eat(); this.swim();}
}
class Mouse extends Rodent{
    void go(){System.out.println("Мышь кродется");}
    void eat(){System.out.println("Мышь ест");}
    void swim(){System.out.println("Мышь тонет");}
}
class Hamster extends Rodent{
    void go(){System.out.println("Хомяк бегает");}
    void eat(){System.out.println("Хомяк хрумкает");}
    void swim(){System.out.println("Хомяк бульк");}
}
class Otter extends Rodent{
    void go(){System.out.println("Выдра плавает");}
    void eat(){System.out.println("Выдра ест рыбу");}
    void swim(){System.out.println("Выдра бульк-бульк");}
}
