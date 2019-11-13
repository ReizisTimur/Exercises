package git.ReizisTim;
//Включите иерархию методов dispose() во все классы из упражнения 9.
public class upr12 {
    public static void main(String[] args){
        class Component1{
            Component1(){
                System.out.println("Announce Component1");
            }
            void dispose(){ System.out.println("Dispose of Component1");}
        }
        class Component2{
            Component2(){
                System.out.println("Announce Component2");
            }
            void dispose(){ System.out.println("Dispose of Component2");}
        }
        class Component3{
            Component3(){
                System.out.println("Announce Component3");
            }
            void dispose(){ System.out.println("Dispose of Component3");}
        }
        class Root{
            Root(){
                System.out.println("Announce Root");
            }
            Component1 com1 = new Component1();
            Component2 com2 = new Component2();
            Component3 com3 = new Component3();
            void dispose(){
                System.out.println("Dispose of Root");
                com3.dispose();
                com2.dispose();
                com1.dispose();
            }
        }
        class Stem extends Root{
            Stem(){
                System.out.println("Announce Stem");
            }
            Component1 com1S = new Component1();
            Component2 com2S = new Component2();
            Component3 com3S = new Component3();
            void dispose(){
                System.out.println("Dispose of Stem");
                super.dispose();
                com3S.dispose();
                com2S.dispose();
                com1S.dispose();
            }
        }
        Stem N = new Stem();
        N.dispose();
    }
}
