package git.ReizisTim;
//Измените пример Detergent.java так, чтобы в нем использовалось делегирование
public class upr11 {
    public static void main(String[] args){
        class Cleanser {
            private String s = "Cleanser";
            public void append(String a) { s += a; }
            public void dilute() { append(" dilute()"); }
            public void apply() { append(" apply()"); }
            public void scrub() { append(" scrub()"); }
            public String toString() { return s; }

        }
        class Detergent {
            Cleanser cl = new Cleanser();
            public void append(String a){cl.append(a);}
            public void dilute() {cl.dilute();}
            public void apply() {cl.apply(); }
            public String toString(){return cl.toString();}
            public void scrub() {
                append(" Detergent.scrub()");
                cl.scrub(); // Call base-class version
            }
            // Add methods to the interface:
            public void foam() { append(" foam()"); }
        }
        class NewDetergent{
            Detergent dt = new Detergent();
            public String toString(){return dt.toString();}
            public void append(String a){dt.append(a);}
            public void dilute() {dt.dilute();}
            public void apply() {dt.apply();}
            public void foam(){dt.foam();}
            public void scrub(){
                append(" NewDetergent.scrub()");
            }
            public void sterilise(){
                append(" NewDetergent.sterilise()");
            }
        }
        NewDetergent x = new NewDetergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilise();
        System.out.println(x);

    }
}
