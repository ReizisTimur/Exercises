package git.ReizisTim;

//2. Объявите новый класс, производный от Detergent. Переопределите метод scrub() и добавьте новый метод
// с именем sterilize()

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }

}
class Detergent extends Cleanser{
    // Change a method:
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }
    // Add methods to the interface:
    public void foam() { append(" foam()"); }
}
class NewDetergent extends Detergent{
    public void scrub(){
        append(" NewDetergent.scrub()");
    }
    public void sterilise(){
        append(" NewDetergent.sterilise()");
    }
}