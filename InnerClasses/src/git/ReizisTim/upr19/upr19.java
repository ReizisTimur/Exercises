/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.ReizisTim.upr19;

// Создайте интерфейс с вложенным классом, содержащим статический метод,



//import git.ReizisTim.upr19.Intrf.GoIntrf;




//который вызывает методы вашего интерфейса и выводит результаты. Реализуйте
//интерфейс и передайте экземпляр своей реализации методу.
/**
 *
 * @author tamerlan
 */
interface upr19 {
    void intMeth1();
    class GoIntrf implements upr19{
        GoIntrf(){intMeth1();};
        public void intMeth1(){System.out.println("Start Meth1");};
    }
    static public void main(String[] args){
       new GoIntrf();    
    }
}