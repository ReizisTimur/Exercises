package git.ReizisTim.upr3;
//Измените упражнение 1 так, чтобы класс Outer содержал закрытое поле String пр
//(инициализируемое в конструкторе), а класс Inner содержал метод toString() для
//вывода этого поля. Создайте объект типа Inner и выведите его.
public class upr3 {
    public static void main(String[] args){
        Outer o = new Outer();
        Outer.Inner i = o.sendI();
        System.out.println(i.toString());
    }
}
class Outer {
    Outer(){core = "Outer.Init";}
    private String core;

    class Inner {
        Inner() {
            System.out.println("Create Inner");
        }
        public String toString(){return Outer.this.core;}

    }
    Inner sendI() {
        return new Inner();
    }
}