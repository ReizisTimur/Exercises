package git.ReizisTim.upr8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
//Измените упражнение 1 так, чтобы для перемещения по контейнеру List при
//вызовах main использовался итератор Iterator.
public class upr8 {
    public static void main(String[] args) {
        ArrayList<Gerbil> U = new ArrayList();
        for(int i=0; i < 5; i++)
            U.add(new Gerbil());
        Iterator<Gerbil> iterator = U.iterator();
        while(iterator.hasNext()){
           Gerbil temp = iterator.next();
           temp.hop();
        }
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