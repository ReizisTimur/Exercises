/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.ReizisTim.upr16;
//Создайте класс, содержащий вложенный класс. Создайте в методе main() эк-
//земпляр вложенного класса.
/**
 *
 * @author tamerlan
 */
public class upr16 {
    static class Nestedcl{
        Nestedcl(){System.out.println("Init obj of nested class");}
        void test(){System.out.println("test");}
    }
    static public void main(String[] args){
        Nestedcl obj = new Nestedcl();
        obj.test();
    }
}