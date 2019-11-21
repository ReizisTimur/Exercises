/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.ReizisTim.test;

/**
 *
 * @author tamerlan
 */
interface Incrementable {
    void increment();
}
// Very simple to just implement the interface:
class Callee1 implements Incrementable {
    private int i = 0;
        public void increment() {
        i++;
        System.out.println(i);
    }
}
class MyIncrement {
public void increment() { System.out.println("Other operation"); }
static void f(MyIncrement mi) { mi.increment(); }
}
// If your class must implement increment() in
// some other way, you must use an inner class:
class Callee2 extends MyIncrement {
    private int i = 0;
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }
private class Closure implements Incrementable {
    public void increment() {
    // Specify outer-class method, otherwise
    // you’d get an infinite recursion:
    Callee2.this.increment();
    }
}
Incrementable getCallbackReference() {
    return new Closure();
}
}
class Caller {
    private Incrementable callbackReference;
    Caller(Incrementable cbh) { callbackReference = cbh; }
    void go() { callbackReference.increment(); }
}
public class Callback {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2); // вн. класс Callee 2 выводит надпись и поышает переменную 
        Caller caller1 = new Caller(c1); //  caller1 создается объект cbn
        Caller caller2 = new Caller(c2.getCallbackReference());// создается объект
        //внтреннего класса Closure равным c2, запускающим метод increment внешнего класса. i =1
        caller1.go(); // pзапускается метод increment объекта caller1.cbn
        caller1.go(); //
        caller2.go(); // метод cbn.go равный Callee2.increment
        caller2.go();
    }
}
