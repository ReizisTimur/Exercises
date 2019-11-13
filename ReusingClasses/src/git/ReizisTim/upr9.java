package git.ReizisTim;

//Создайте класс Root, содержащий экземпляры каждого из классов Component1, Component2, Component3, Объявите класс Stem
// производным от класса Root, так чтобы в нем также содержались экземпляры каждого из классов Component. Каждый класс
//должен содержать конструктор по умолчанию, который выводит сообщение о своем вызове.
public class upr9 {
    public static void main(String[] args){
        class Component1{
            Component1(){
                System.out.println("Announce Component1");
            }
        }
        class Component2{
            Component2(){
                System.out.println("Announce Component2");
            }
        }
        class Component3{
            Component3(){
                System.out.println("Announce Component3");
            }
        }
        class Root{
            Root(){
                System.out.println("Announce Root");
            }
            Component1 com1 = new Component1();
            Component2 com2 = new Component2();
            Component3 com3 = new Component3();
        }
        class Stem extends Root{
            Stem(){
                System.out.println("Announce Stem");
            }
            Component1 com1S = new Component1();
            Component2 com2S = new Component2();
            Component3 com3S = new Component3();
        }
        Stem N = new Stem();
    }
}
