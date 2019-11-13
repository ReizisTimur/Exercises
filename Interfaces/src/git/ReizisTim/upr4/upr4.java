package git.ReizisTim.upr4;
//Создайте абстрактный класс без методов. Произведите от него класс
//и добавьте метод. Создайте статический метод, получающий ссылку на
//базовый класс, проведите нисходящее преобразование к производному типу и вы-
//зовите его метод. Продемонстрируйте, что такой способ работает, в методе main( ).
//"Теперь поместите в определение метода из базового класса ключевое слово abstract,
//и необходимость в нисходящем преобразовании исчезнет.
public class upr4 {
    public static void main(String[] args){
        toBase obj = new toBase();
      base.toB2(obj);
    }
}
abstract class base {
    static void toB2(base input) {
        ((toBase) input).toB();
    };
}
class toBase extends base{
    void toB(){System.out.println("toB");}
    static void toB2(base input) {
        ((toBase) input).toB();
    }

}
