package git.ReizisTim;
// Создайте класс с троекратно перегруженным методом. Объявите новый класс производным от него, добавьте новую
// перегрузку метода и покажите, что все четыре метода доступны в производном классе.
public class upr13 {

    public static void main (String[] args){
        class threeMethods{
            void meth(int input){System.out.println("1 int");}
            void meth(char input){System.out.println("2 char");}
            void meth(String input){System.out.println("3 string");}
        }
        class fortMethod extends threeMethods{
            void meth(){System.out.println("4 null");}
        }
        fortMethod obj = new fortMethod();
        float input;
        obj.meth();
    }
}
