package git.ReizisTim.upr3;

import java.util.ArrayList;

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
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.size(); }
        public Object current() { return items.get(i); }
        public void next() { if(i < items.size()) i++; }
    }
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for(int i = 0; i < 14; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
