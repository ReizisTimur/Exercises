package git.ReizisTim.upr2;
//Измените пример SimpleCollection так, чтобы в качестве контейнера с исполь-
//зовалось множество Set.
import java.util.*;
public class upr2 {
    public static void main(String[] args) {
        Set<Integer> c = new HashSet<>();
        for(int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for(int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for(Integer i : c)
            System.out.print(i + ", ");
    }
}
