package git.ReizisTim.upr7;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

//Создайте класс, затем создайте инициализированный массив объектов этого
//класса. Заполните контейнер List данными массива. Создайте подмножество List
//методом subList(), после чего удалите это подмножество из вашего контейнера List.
public class upr7 {
    public static void main(String[] args) {

        List list1 = new ArrayList();
        for(int i = 1 ; i<5; i++)
            list1.add(new OBJ(i));
        System.out.println("Контейнер - " + list1);
        List subList = list1.subList(0,2);
        System.out.println("Подмножество - " + subList);
        list1.removeAll(subList);
        System.out.println("Удаление подмножества" + list1);
    }
}
class OBJ{
    int id;
    OBJ(int input){id = input;}
    public String toString(){return "object "+id;}
}