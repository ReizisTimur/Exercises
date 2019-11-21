/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.ReizisTim.upr17;

/**
 *
 * @author tamerlan
 */
public class upr17 {
    static public void main(String[] args){
        First obj = new First();
        First.Second obj2 = obj. new Second();
        First.Second.Thirth obj3 = obj2. new Thirth();
    }
}
class First{
    First(){System.out.println("Init first");}
    class Second{
        Second(){System.out.println("Init second");}
        class Thirth{
            Thirth(){System.out.println("Init Thirth");}
        }
    }
}
