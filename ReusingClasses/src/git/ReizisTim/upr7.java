package git.ReizisTim;
//Измените апр. 5 так, чтобы классы А и В имеликонструкторы с аргументами вместо конструктором по умолчанию.
//Напишите конструктор для класса С и проведите всю необходимую инициализацию
public class upr7 {
    public static void main(String[] args){
        class A{
            A(int input){
                System.out.println("Call A" + input);
            }
        }
        class B{
            B(int input){
                System.out.println("Call B" + input);
            }
        }
        class C extends A {
            C() {
                super(Integer.valueOf(args[0]));
                B x = new B(Integer.valueOf(args[1]));
            }
        }
        C objC = new C();
    }

}
