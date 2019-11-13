package git.ReizisTim;
//Создайте класс, содержащий два поля: static final и final. Продемонстрируйте различия между ними
import java.util.Random;

public class upr18 {
    public static void main(String[] args) {
        test one = new test();
        test two = new test();
    }
}
class test{
    static Random rnd = new Random();
    final static int fs = rnd.nextInt(20);
    final int f = rnd.nextInt(20);
    test(){
        System.out.println("Static final  " + fs + "  final  "+ f);
    }
}