package git.ReizisTim.upr15;
//измените предыдущее упражнение - создайте абстрактный класс и унаследуйте производный
// класс от него
public class upr15 {
    static void run1b(inerf1 x){x.meth1b();}
    static void run2a(inerf2 x){x.meth2a();}
    static void run3a(inerf3 x){x.meth3b();}
    static void run4(inetf4 x){x.meth4();}
    static public void main(String[] args){
        testSub obj = new testSub();
        run1b(obj);
        run2a(obj);
        run3a(obj);
        run4(obj);
    }
}
interface inerf1{
    void meth1a();
    void meth1b();
}
interface inerf2{
    void meth2a();
    void meth2b();
}
interface inerf3{
    void meth3a();
    void meth3b();
}
interface inetf4 extends inerf1, inerf2, inerf3{
    void meth4();
}
abstract class testSuper implements inetf4{

}
class testSub extends testSuper {
    public void meth1b(){System.out.println("run1b");}
    public void meth2a(){System.out.println("run2a");}
    public void meth3b(){System.out.println("run3b");}
    public void meth4(){System.out.println("run4");}
    public void meth1a(){};
    public void meth2b(){};
    public void meth3a(){};
}
