package git.ReizisTim.upr6b;
import git.ReizisTim.upr6a.*;
import git.ReizisTim.upr6.*;

// Создайте интерфейс, содержащий хотя бы один метод, в отдельном пакете.
//Создайте класс в другом пакете, Добавьте защищенный внутренний класс, реали-
//зующий интерфейс. В третьем пакете создайте производный класс; внутри метода
//верните объект защищенного внутреннего класса, преобразованный в интерфейс.
public class uprb extends upra{
    static public void main(String[] args){
        uprb obj1 = new uprb();
        upr6.oneMethodInt obj = obj1.objSC();
        obj.oneMethod();
    }
}
