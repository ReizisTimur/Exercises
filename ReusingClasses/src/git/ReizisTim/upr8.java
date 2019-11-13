package git.ReizisTim;
//Создайте базовый класс с единственным конструктором, не являющимся конструктором по умолчанию, и производный
// класс с конструктором как по умолчанию (без аргументов), так и с аргументами. В конструкторе производного класса
// вызовите конструктор базового класса
public class upr8 {
    public static void main(String[] args) {
        class baza {
            baza(int input) {
                System.out.print("Announce baza " + input + " ");
            }
        }
        class derived extends baza {
            derived() {
                super(Integer.valueOf(args[0]));
                System.out.println("devDef");
            }
            derived(int input){
                super(Integer.valueOf(args[0]));
                System.out.println("devNoDef");
            }
        }
        derived D = new derived(6);
    }
}
