/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.ReizisTim.upr22;
import java.util.*;
/**
 *
 * @author tamerlan
 */
public class Controller {
    // A class from java.util to hold Event objects:
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c) { eventList.add(c); }
    public void run() {
        while(eventList.size() > 0)
        // Make a copy so you’re not modifying the list
        // while you’re selecting the elements in it:
        for(Event e : new ArrayList<Event>(eventList))
        if(e.ready()) {
            System.out.println(e);
            e.action();
            eventList.remove(e);
        }
    }
}
