package git.ReizisTim;
//3. Докажите, что даже если конструктор класса Cartoon не определен, компилятор сгенерирует конструктор по умолчанию
//в котором также вызывается конструктор базового класса.
class Art {
    Art() {System.out.println("Art constructor"); }
}
class Drawing extends Art {
    Drawing() {System.out.println("Drawing constructor"); }
}

public class Cartoon extends Drawing{
}
