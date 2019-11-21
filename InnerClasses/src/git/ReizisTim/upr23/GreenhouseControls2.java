/*s
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.ReizisTim.upr23;
//Унаследуйте от класса GreenhouseControls, чтобы добавить в него новый вну-
//тренний класс событий Event, включающий и отключающий поддержку увлажнения
//оранжереи. Напишите новую версию программы СгееппоизеСогигоНегама, обеспечи-
//вающую поддержку нового типа события.
/**
 *
 * @author tamerlan
 */
public class GreenhouseControls2 extends GreenhouseControls{
    private boolean water = false;
    public class WaterOn extends GreenhouseControls.WaterOn {
        public WaterOn(long delayTime) { super(delayTime); }
        public void action() {
            // Put hardware control code here.
            water = false;
        }
        public String toString() {
            return "Controle water OFF";
        }
    }
    public class WaterOff extends GreenhouseControls.WaterOff {
        public WaterOff(long delayTime) { super(delayTime); }
        public void action() {
            // Put hardware control code here.
            water = false;
        }
        public String toString() {
            return "Controle water OFF";
        }
    }
    
}
