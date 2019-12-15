/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.ReizisTim.upr24;
//Создайте класс с внутренним классом, имеющим конструктор с аргументами (не
//являющийся конструктором по умолчанию). Создайте второй класс с внутренним
//классом, наследующим от первого внутреннего класса.
/**
 *
 * @author tamerlan
 */
public class upr24 {
    
    
}
class First{
    class InnerOne{
        InnerOne(String input){System.out.println("InnerOne init");}
    }
}
class Second{
    class InnerTwo extends First.InnerOne{
        InnerTwo(First input){
        input.super("ff");}
    }
}