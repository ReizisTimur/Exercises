package git.ReizisTim;

//Создайте базовый класс с двумя методами. В первом методе вызовите второй
//метод. Определите производный класс и переопределите второй метод. Создайте
//объект производного класса, выполните восходящее преобразование к базовому
//типу и вызовите первый метод. Объясните результат.
// Из-за позднего связывания выполняется метод производного класса
public class upr10 {
    public static void main(String[] args){
        test2 ttt = new test2();
        action.meth(ttt);
    }
}
class test1{
    void meth1(){System.out.println("3, 2, 1, ");meth2();}
    void meth2(){System.out.println("Start");}
}
class test2 extends test1{
    void meth2(){System.out.println("START!");}
}
class action{
    static void meth(test1 input){
        input.meth1();
    }
}
