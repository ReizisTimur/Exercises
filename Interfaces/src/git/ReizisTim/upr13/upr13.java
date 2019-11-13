package git.ReizisTim.upr13;
//Создайте интерфейс и определите два новых интерфейса, производных от него.
//Выполните множественное наследование третьего интерфейса от первых двух'.
public class upr13 {

}
interface intrf1{
    void meth1();
}
interface intrf2 extends intrf1{
    void meth2();
}
interface intrf3 extends intrf1, intrf2{
    void meth3();
}
class test implements intrf3{
    public void meth3(){System.out.println("m3");}
    public void meth2(){}
    public void meth1(){}
}