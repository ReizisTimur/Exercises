package git.ReizisTim;
//24 Продемонстрируйте, что загрузка класса выполняется только один раз. Докажите, что загрузка может быть
// вызвана как созданием первого экземпляра класса, так и обращением к статическому члену.
// 24. В файле Beetle.java создайте еще один тип, производный от Beetle, в таком же формате, как и у других
// классов. Проследите за работой программы и объясните результат.
// Ответ изменений нет поскольку программа не обращается к новому классу, либо производным от него.
class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 =            printInit("static Insect.x1 initialized");
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}
public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");
    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
public class Bee extends Beetle{
        private int k = printInit("Bee.k initialized");
        public Bee(){
            System.out.println("k + 1 = " + k++);
            System.out.println("j + 1 = " + j++);
        }
}
    private static int x2 =  printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
//        System.out.println("Beetle constructor");
//        Beetle b = new Beetle();
//        System.out.println("\nВторое обращение к классу, он уже загружен");
//        Beetle c = new Beetle();
        System.out.println("\nтест на статический член");
        Insect.printInit("test");
    }
}