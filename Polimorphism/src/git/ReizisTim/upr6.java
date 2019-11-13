package git.ReizisTim;
//Измените программу Music3.java так, чтобы метод what() ствл методом корневого класса Object toString. Попробуйте вывести
// информацию об объектах Instrument вызовом System.out.println
//7. Добавьте новый подтип Instrument в программу Music3.java
enum Note {MIDDLE_C, C_SHARP, B_FLAT}
class Instrument {
    void play(Note n) { System.out.println("Instrument.play() " + n); }
    public String toString() { return "Instrument"; }
    void adjust() { System.out.println("Adjusting Instrument"); }

}
class Wind extends Instrument {
    void play(Note n) { System.out.println("Wind.play() " + n); }
    public String toString() { return "Wind"; }
    void adjust() { System.out.println("Adjusting Wind"); }
}
class Percussion extends Instrument {
    void play(Note n) { System.out.println("Percussion.play() " + n); }
    public String toString() { return "Percussion"; }
    void adjust() { System.out.println("Adjusting Percussion"); }
}
class Stringed extends Instrument {
    void play(Note n) {System.out.println("Stringed.play() " + n);    }
    public String toString() {return "Stringed";}
    void adjust() {System.out.println("Adjusting Stringed");    }
}
class Brass extends Wind {
    void play(Note n) { System.out.println("Brass.play() " + n); }
    void adjust() { System.out.println("Adjusting Brass"); }
    public String toString() {return "Brass";}
}
class Woodwind extends Wind {
    void play(Note n) { System.out.println("Woodwind.play() " + n); }
    public String toString() { return "Woodwind"; }
}
class Electronic extends Instrument{
    void play(Note n) { System.out.println("Electronuc.play() " + n); }
    void adjust() { System.out.println("Adjusting Electronuc"); }
    public String toString() {return "Electronuc";}
}
public  class upr6 {
    // Doesn’t care about type, so new types
// added to the system still work right:
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e) {
            tune(i);
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
// Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Electronic()
        };
        tuneAll(orchestra);
        Cycle test = new Cycle();
    }

}