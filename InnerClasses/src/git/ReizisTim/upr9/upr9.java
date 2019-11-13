package git.ReizisTim.upr9;
//Создайте закрытый внутренний класс, реализующий открытый интерфейс. На-
//пишите метод, который возвращает ссылку на экземпляр закрытого внутреннего
//класса, преобразованную к интерфейсу восходящим преобразованием. Чтобы по-
//казать, что внутренний класс полностью скрыт, попробуйте выполнить нисходящее
//преобразование к нему.
public class upr9 {

    public static void main(String[] args) {
        OtterInt obj = new Otter();
        innerInterf obj2 = obj.giveInner();
        //(Otter.Inner)obj2;  //невозможно
    }
}
interface innerInterf{
    void innerMeth();
}
interface OtterInt{
    innerInterf giveInner();
}
class Otter implements OtterInt{
    private class Inner implements innerInterf{
        Inner(){innerMeth();}
        public void innerMeth(){System.out.println("Inner init");}
    }
    public innerInterf giveInner(){return new Inner();}
}
