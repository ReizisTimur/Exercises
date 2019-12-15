package git.ReizisTim.upr4;
//Создайте класс-генератор, который при каждом вызове next() выдает имена
//персонажей вашего любимого фильма в виде объектов String. Когда список за-
//канчивается, программа снова возвращается к началу. Используйте генератор для
//заполнения массива и контейнеров ArrayList, LinkedList, HashSet, LinkedHashSet
//и TreeSet, после чего выведите содержимое каждого контейнера.
import java.util.*;
public class upr4 {
    public static void main(String[] args) {
        String[] massive = new String[4];
        for (int i =0; i<4; i++){
            massive[i] =(NameGen.next());
        }
        ArrayList arl = new ArrayList();
        for (int i =0; i <6; i++){
            arl.add(NameGen.next());
        }
        LinkedList linL = new LinkedList();
        for (int i=0; i<5; i++){
            linL.add(NameGen.next());
        }
        HashSet haS = new HashSet();
        for(int i = 0; i<8; i++){
            haS.add(NameGen.next());
        }
        LinkedHashMap lhm = new LinkedHashMap();
        for(int i = 0; i < 7; i++){
            lhm.put(i, (NameGen.next()));
        }
        TreeMap trM = new TreeMap();
        for(int i = 0; i < 6; i++){
            trM.put(i, (NameGen.next()));
        }
        System.out.println(massive);
        System.out.println(arl);
        System.out.println(linL);
        System.out.println(haS);
        System.out.println(lhm);
        System.out.println(trM);
    }
}
class NameGen{
    static String[] names = {"Фрэнки","Ави Деновиц","Борис Бритва"," Даг Голова",
        "Роскошный Джордж","Кирпич","Турецкий","Томми","Микки","Сол",
        "Винни","Тайрон","Эррол"};
    static public String next(){
        Random rnd = new Random();
        return names[rnd.nextInt(names.length)];
    }
}
