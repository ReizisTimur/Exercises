package git.ReizisTim;
// Создайте иерархию наследования, используя в качестве основы различные типы
//грызунов. Базовым классом станет Rodent (грызун), а производными классами будут
//Mouse (мышь), Hamster (хомяк) и т. п. В базовом классе определите несколько общих
//методов, которые затем переопределите в производных классах, для того чтобы они
//производили действие, свойственное конкретному типу объекта. Создайте массив
//из объектов Rodent, заполните его различными производными типами и вызовите
//методы базового класса, чтобы увидеть результат работы программы.
public class upr9 {
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