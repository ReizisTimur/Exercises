package git.ReizisTim;
//Измените предыдущее упражнение так, чтобы во всех классах присутствовали лишь конструкторы с аргументами
// (не по умолчанию)
public class upr10 {
    public static void main(String[] args){
        class Component1{
            Component1(int input){
                System.out.println("Announce Component1 " + input);
            }
        }
        class Component2{
            Component2(int input){
                System.out.println("Announce Component2 " + input);
            }
        }
        class Component3{
            Component3(int input){
                System.out.println("Announce Component3 " + input);
            }
        }
        class Root{
            Root(int input){
                System.out.println("Announce Root" + input);
            }
            Component1 com1 = new Component1(Integer.valueOf(args[0]));
            Component2 com2 = new Component2(Integer.valueOf(args[1]));
            Component3 com3 = new Component3(Integer.valueOf(args[2]));
        }
        class Stem extends Root{
            Stem(int input){
                super(Integer.valueOf(args[6]));
                System.out.println("Announce Stem " + input);
            }
            Component1 com1S = new Component1(Integer.valueOf(args[3]));
            Component2 com2S = new Component2(Integer.valueOf(args[4]));
            Component3 com3S = new Component3(Integer.valueOf(args[5]));
        }
        Stem N = new Stem(Integer.valueOf(args[7]));
    }
}
