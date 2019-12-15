package git.ReizisTim.upr9;

import java.util.ArrayList;
import java.util.Iterator;

//измените пример innerdasses/Sequence.java так, чтобы контейнер Sequence работал
//с Iterator вместо Selector.
interface Selector {
    boolean end();
    Object current();
    void next();
}
public class Sequence {
    private ArrayList<Object> items;
    private int next = 0;
    public Sequence() { items = new ArrayList(); }
    public void add(Object x) {
        items.add(x);
    }
    private class SequenceSelector {
//        private int i = 0;
//        public boolean end() { return i == items.size(); }
//        public Object current() { return items.get(i); }
//        public void next() { if(i < items.size()) i++; }
    }
//    public Selector selector() {
//        return new SequenceSelector();
//    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for(int i = 0; i < 14; i++)
            sequence.add(Integer.toString(i));
        Iterator iter = sequence.items.iterator();
//        Selector selector = sequence.selector();
        while(iter.hasNext()) {
            Object temp = iter.next();
            System.out.print(temp + " ");
        }
    }
}
