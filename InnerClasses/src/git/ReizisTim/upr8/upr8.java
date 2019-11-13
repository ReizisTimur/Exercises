package git.ReizisTim.upr8;
//Проверьте, доступны ли для внешнего класса закрытые элементы внутреннего
//класса.

// Повторите предыдущее упражнение(7.2), но определите внутренний класс в области
//действия внутри метода.
public class upr8 {

    public static void main(String[] args){
        Otter obj = new Otter();
        Object objI = obj.createIn();
        obj.getInner2(false);
    }
}
class Otter{
    static class Inner{
        Inner(){view();}
        private String core ="Доступны";
        private void view(){System.out.println(core);}
    }
    Inner createIn(){return new Inner();}
    oneMethodInt getInner2(boolean ans){
         oneMethodInt obj2;
         if(ans) {
            class Inner2 implements oneMethodInt {
                Inner2() {
                    oneMeth();
                }

                public void oneMeth() {
                    System.out.println("Inner2 init");
                }
            }
            obj2= new Inner2();

        }
        else{
             class Inner2 implements oneMethodInt {
                 Inner2() {
                     oneMeth();
                 }

                 public void oneMeth() {
                     System.out.println("Inner3 init");
                 }
             }
             obj2= new Inner2();
         }
        return obj2;



    }
}
interface oneMethodInt{
    void oneMeth();
}