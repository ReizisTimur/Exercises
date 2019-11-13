package git.ReizisTim;

public class upr5 {
    //5. Создайте два класса A и B, имеющие конструкторы по умолчанию (с пустым списком аргументов)б
    // которые выводят сообщение о вызове. Создайте класс С, производный от А, создайте в С объект класса В


    public static void main(String[] args){
        C objC = new C();
    }
}
class A{
    A(){
        System.out.println("Call A");
    }
}
class B{
    B(){
        System.out.println("Call B");
    }
}
class C extends A {
    B x = new B();
}
