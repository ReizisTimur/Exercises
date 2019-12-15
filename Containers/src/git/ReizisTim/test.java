package git.ReizisTim;
import java.util.*;
public class test {

    static  public  void main(String[] args) {
        Collection<String> str = new ArrayList<String>(Arrays.asList("df", "4", "6ds"));
        Collections.addAll(str, "fdgg","4rf", "2f2");
        System.out.println(str);
        List<Integer> list = Arrays.asList(12, 433, 56, 455);
        list.set(3, 12);
        //list.add(44);
        System.out.println(list);
    }
}
