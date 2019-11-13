package git.ReizisTim.upr6a;
import git.ReizisTim.upr6.upr6.*;

// Создайте интерфейс, содержащий хотя бы один метод, в отдельном пакете.
//Создайте класс в другом пакете, Добавьте защищенный внутренний класс, реали-
//зующий интерфейс. В третьем пакете создайте производный класс; внутри метода
//верните объект защищенного внутреннего класса, преобразованный в интерфейс.
public class upra {
    public  secondClass objSC(){return new secondClass();}
    protected  class secondClass implements oneMethodInt {
        public void oneMethod(){System.out.println("One Method start!!");}
    }
}
