package git.ReizisTim.upr10;
import java.util.ArrayList;
import java.util.Iterator;

//Измените упражнение 9 из главы 8, чтобы объекты Rodent хранились в контей-
//нере АггауList, а для перебора последовательности Rodent использовался итератор
//Iterator.
public class upr10 {
    public static void main(String[] args){
        ArrayList<Rodent> rodentArray = new ArrayList<Rodent>();
        rodentArray.add(new Mouse());
        rodentArray.add(new Hamster());
        rodentArray.add(new Otter());
        Iterator<Rodent> iter= rodentArray.iterator();
        while(iter.hasNext()){
            iter.next().test();
        }
//        Rodent[] rodentsMas = new Rodent[3];
//        rodentsMas[0] = new Mouse();
//        rodentsMas[1] = new Hamster();
//        rodentsMas[2] = new Otter();
//        rodentsMas[0].test();
//        rodentsMas[1].test();
//        rodentsMas[2].test();


    }
}
class Rodent{
    void go(){System.out.println("Go");}
    void eat(){System.out.println("Ete");}
    void swim(){System.out.println("Swimm");}
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
