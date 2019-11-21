/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.ReizisTim.upr18;
// Создайте интерфейс, содержащий вложенный класс. Реализуйте интерфейс
//и создайте экземпляр вложенного класса.
/**
 *
 * @author tamerlan
 */
public class upr18 {
    public static void main(String[] args){
    Intrf obj = new First();
    Intrf.Nested obj2 =  new Intrf.Nested();
    }    
}
interface Intrf{
    void oneMeth();
    public static class Nested{
        Nested(){System.out.println("init nested");};
    } 
}
class First implements Intrf{
    public void oneMeth(){System.out.println("test first");};
} 
