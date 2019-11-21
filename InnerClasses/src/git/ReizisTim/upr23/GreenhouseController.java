/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.ReizisTim.upr23;
// Унаследуйте от класса GreenhouseControls, чтобы добавить в него новый вну-
//тренний класс событий Event, включающий и отключающий поддержку увлажнения
//оранжереи. Напишите новую версию программы GreenhouseController, обеспечи-
//вающую поддержку нового типа события.

public class GreenhouseController {
public static void main(String[] args) {
    String input = "no";
    GreenhouseControls gc =new GreenhouseControls(); 
    //пытаюсь поменять класс объекта 
    if(input =="no") gc = new GreenhouseControls2(); 
    gc.addEvent(gc.new Bell(900));
    Event[] eventList = {
        gc.new ThermostatNight(0),
        gc.new LightOn(200),
        gc.new LightOff(400),
        gc.new WaterOn(600),
        gc.new WaterOff(800),
        gc.new ThermostatDay(1400),
        gc.new FansOn(1500),
        gc.new FansOff(1600)
    };
    gc.addEvent(gc.new Restart(2000, eventList));
    if(args.length > 0)
    gc.addEvent(new GreenhouseControls.Terminate( new Integer(args[0])));
    gc.run();
}
}
