package git.ReizisTim.upr12;

import java.util.Random;

//Измените упражнение 9 так, чтобы программа демонстрировала порядок
//инициализации базовых и производных классов. Включите встроенные объекты
//и в базовые, и в производные классы, и покажите, в каком порядке проходит их
//инициализация при конструировании объекта.
// Встроенный объект, потом базовый класс, потом производный класс
public class upr11 {
    public static void main(String[] args){
        Rodent[] rodentsMas = new Rodent[3];
        rodentsMas[0] = new Mouse();
        rodentsMas[1] = new Hamster();
        rodentsMas[2] = new Otter();
//        rodentsMas[0].test();
//        rodentsMas[1].test();
//        rodentsMas[2].test();
    }
}
class Rodent{
    Rodent(){System.out.println("Init Rodent");}
    String s = "rodent";
    name n = new name(s);
    void go(){System.out.println("Go");}
    void eat(){System.out.println("Ete");}
    void swim(){System.out.println("Swimm");}
    void test(){this.go(); this.eat(); this.swim();
    }
}
class Mouse extends Rodent{
    Mouse(){System.out.println("Init Mouse");}
    String s = "mouse";
    name n = new name(s);
    void go(){System.out.println("Мышь кродется");}
    void eat(){System.out.println("Мышь ест");}
    void swim(){System.out.println("Мышь тонет");}
}
class Hamster extends Rodent{
    Hamster(){System.out.println("Init Hamster");}
    String s = "hamster";
    name n = new name(s);
    void go(){System.out.println("Хомяк бегает");}
    void eat(){System.out.println("Хомяк хрумкает");}
    void swim(){System.out.println("Хомяк бульк");}
}
class Otter extends Rodent{
    Otter(){System.out.println("Init Otter");}
    String s = "otter";
    name n = new name(s);
    void go(){System.out.println("Выдра плавает");}
    void eat(){System.out.println("Выдра ест рыбу");}
    void swim(){System.out.println("Выдра бульк-бульк");}
}
class name{
    name(String s){System.out.println("It's  "+ s);}
}
