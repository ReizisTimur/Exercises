package git.ReizisTim.upr11;
//Создайте закрытый внутренний класс, реализующий открытый интерфейс. На-
//пишите метод, который возвращает ссылку на экземпляр закрытого внутреннего
//класса, преобразованную к интерфейсу восходящим преобразованием. Чтобы по-
//казать, что внутренний класс полностью скрыт, попробуйте выполнить нисходящее
//преобразование к нему.
//сделайте упражнение с анонимным внутренним классом
public class upr11 {
    public static void main(String[] args) {
        Otter obj = new Otter();
        innerInt obj2 = obj.giveInner();
	obj2.innerMeth();
	 //(Otter.Inner)obj2;  //невозможно
    }
}

interface innerInt{
	void innerMeth();
}
class Otter{
	 private innerInt  getInner(){
		return new  innerInt(){
			String core = "test";
			public void innerMeth(){core="Inner init"; System.out.println(core);}
		};
	}
   	 public innerInt giveInner(){return getInner();}
}