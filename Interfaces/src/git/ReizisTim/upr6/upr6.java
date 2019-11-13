package git.ReizisTim.upr6;
import git.ReizisTim.upr5.*;
//Создайте интерфейс, содержащий три метода, в отдельном пакете. Реализуйте
//этот интерфейс в другом пакете.

// Докажите, что все методы интерфейса автоматически являются открытыми
//(public
public class upr6 {
    static public void main(String[] args){
        upr6ext obj = new upr6ext();
        obj.meth1();
    }
}
class upr6ext implements upr5{
    public void meth1(){System.out.println("Meth1");};
    public void meth2(){System.out.println("Meth2");};
    public void meth3(){System.out.println("Meth3");};
}