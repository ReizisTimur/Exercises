package git.ReizisTim.upr5;
import java.lang.reflect.Array;
//Измените пример ListFeatures, чтобы вместо объектов Pet в нем использо-
//вались значения Integer (не забудьте про автоматическую упаковку!). Объясните
//различия в результатах.
import java.util.*;
public class ListFeatures {
    public static void main(String[] args) {
        Random rand = new Random(47);

        List<Integer> intL = new ArrayList<>(Arrays.asList(1, 4, 34, 1, 67));
        System.out.println("1: " + intL);
        intL.add(6); // Automatically resizes
        System.out.println("2: " + intL);
        System.out.println("3: " + intL.contains(6));
        intL.remove(4); // Remove by object
        System.out.println("4: " + "67" + " " + intL.indexOf(67));
        System.out.println("5: " + intL.indexOf(1));
        System.out.println("6: " + intL.remove(1));
// Must be the exact object:
        System.out.println("7: " + intL.remove(1));
        System.out.println("8: " + intL);
        intL.add(3, 45); // Insert at an index
        System.out.println("9: " + intL);
        List<Integer> sub = intL.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + intL.containsAll(sub));
        Collections.sort(sub); // In-place sort
        System.out.println("sorted subList: " + sub);
// Order is not important in containsAll():
        System.out.println("11: " + intL.containsAll(sub));
        Collections.shuffle(sub, rand); // Mix it up
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + intL.containsAll(sub));
        List<Integer> copy = new ArrayList<>(Arrays.asList(6, 45, 5, 62, 9));
        sub = Arrays.asList(intL.get(1), intL.get(3));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(Arrays.asList(4, 78, 34, 14)); // Get a fresh copy
        copy.remove(2); // Remove by index
        System.out.println("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        System.out.println("15: " + copy);
        copy.set(1, 100); // Replace an element
        System.out.println("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        System.out.println("17: " + copy);
        System.out.println("18: " + intL.isEmpty());
        intL.clear(); // Remove all elements
        System.out.println("19: " + intL);
        System.out.println("20: " + intL.isEmpty());
        intL.addAll(Arrays.asList(3, 6, 78, 4, 54, 27));
        System.out.println("21: " + intL);
        Object[] o = intL.toArray();
        System.out.println("22: " + o[3]);
//        Integer[] pa = {2, 5, 45, 4, 5};
//        System.out.println("23: " + pa[3].id());
    }
}
