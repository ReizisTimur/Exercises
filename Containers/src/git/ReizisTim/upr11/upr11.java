package git.ReizisTim.upr11;

import java.util.*;

//Напишите метод, который использует Iterator для перебора Collection И ВЫ-
//водит результат вызова toString  для каждого объекта в контейнере. Заполните
//объектами разные типы Collection и примените свой метод к каждому контейнеру.
public class upr11 {
    public static void main(String[] args){
        List colList = new ArrayList();
        colList.add("df");
        colList.add(3);
        colList.add("r");
        colList.add(400);
        System.out.println(Iter.perebor(colList));
        Set colSet = new HashSet();
        colSet.add("tew");
        colSet.add(45);
        colSet.add("hdg");
        colSet.add(22);
        System.out.println(Iter.perebor(colSet));
        Queue colQ = new ArrayDeque();
        colQ.add("ert");
        colQ.add('!');
        colQ.add(24);
        colQ.add(4.2);
        System.out.println(Iter.perebor(colQ));
    }
}
class Iter{
    static String perebor(Collection input){
        Iterator iter = input.iterator();
        String enter ="";
        while (iter.hasNext()){
            enter+=iter.next().toString()+" ";
        }
        return enter;
    }
}
