package git.ReizisTim.upr7;

import java.util.Random;
//Измените программу, чтоб объекты Instruments генерировались случайно

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
public  class upr7 {
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
        Instrument[] orchestra = new Instrument[5];
        Random randInst = new Random();
//        orchestra[0]= new Brass();
//        orchestra[1]= new Brass();
//        orchestra[2]= new Brass();
//        orchestra[3]= new Brass();
//        orchestra[4]= new Brass();


        for (int i = 0; i<5; i++){
            switch (randInst.nextInt(5)){
                case 0: orchestra[i] = new Brass();break;
                case 1: orchestra[i] = new Electronic();break;
                case 2: orchestra[i] = new Percussion();break;
                case 3: orchestra[i] = new Stringed();break;
                case 4: orchestra[i] = new Wind();break;
                case 5: orchestra[i] = new Woodwind();break;
            }
        }
        tuneAll(orchestra);
    }

}
