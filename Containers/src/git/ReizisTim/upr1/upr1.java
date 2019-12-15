package git.ReizisTim.upr1;
import java.util.ArrayList;
import java.util.Random;
//Создайте новый класс с именем Gerbil с полем gerbilNumber типа int, инициали-
//зируемым в конструкторе. Определите в нем метод hop(), который выводит значение
//gerbilNumber и короткое сообщение. Создайте контейнер ArrayList U добавьте в него.
//объекты Gerbil. Используйте метод hop() для перебора элементов и вызова hop()
//для каждого объекта Gerbil,
public class upr1 {

    public static void main(String[] args) {
        ArrayList<Gerbil> U = new ArrayList();
        for(int i=0; i < 5; i++)
            U.add(new Gerbil());
        for(Gerbil obj: U)
            obj.hop();
    }
}
class Gerbil{
    int gerbilNumber;
    Gerbil(){
        Random rnd = new Random();
        gerbilNumber = rnd.nextInt(20)+1;
    }
    void hop(){System.out.println("It's object "+ gerbilNumber);}
}