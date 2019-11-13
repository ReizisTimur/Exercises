package git.ReizisTim.upr7;
// Создайте класс, содержащий закрытое поле и закрытый метод. Создайте вну-
//тренний класс с методом, который изменяет поле внешнего класса и вызывает метод
//внешнего класса. Во втором методе внешнего класса создайте объект внутреннего
//класса и вызовите его метод; продемонстрируйте эффект на объекте внешнего класса.

//Создайте интерфейс, содержащий минимум один метод. Реализуйте его, опре-
//деляя внутренний класс в методе, который возвращает ссылку на ваш интерфейс.
public class upr7 {
    public static void main(String[] args){
        Otter obj = new Otter();
        obj.innerObj();
        oneMethodInt obj2 = obj.getInner2();
    }
}
class Otter{
    private int core = 1;
    private void viewCore(){System.out.println(core);}
    void innerObj(){
        Otter.Inner obj = new Otter.Inner();
        obj.changeCOre();
        viewCore();
    }
    class Inner {
        void changeCOre(){Otter.this.core+=4;}
    }
    oneMethodInt getInner2(){
        class Inner2 implements oneMethodInt{
            Inner2(){oneMeth();}
            public void oneMeth(){
                System.out.println("Inner2 init");
            }
        }
        return new Inner2();
    }
}
interface oneMethodInt{
    void oneMeth();
}
