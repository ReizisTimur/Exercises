package git.ReizisTim.upr1;
//Напишите класс с именем Outer, содержащий внутренний класс с именем Inner.
//Добавьте в Outer метод, возвращающий объект типа Inner. В методе main() создайте
//и инициализируйте ссылку на Inner.
public class upr1 {
    public static void main(String[] args){
        Outer o = new Outer();
        Outer.Inner i = o.sendI();
    }
}
class Outer{
    class Inner{
        Inner(){System.out.println("Create Inner");}
    }
    Inner sendI(){return new Inner();}
}