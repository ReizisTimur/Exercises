package git.ReizisTim;
//используя пример Chess.java, дока жите что если не вызвать конструктор базового класса в BoardGame(), то компилятор
//пожалуется на то, что не может обнаружить конструктор в форме Game
public class upr6 {
        public static void main(String[] args) {
        Chess x = new Chess();
    }
}
class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}
class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}
class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }
}
