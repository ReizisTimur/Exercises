package git.ReizisTim;
//Создайте класс с пустой final-ссылкой на объект. Проведите инициализацию пустой константы во всех конструкторах.
// Продемонстрируйте гарантированную инициализацию final перед использованием и невозможностью ее изменения после
// инициализации.
public class upr19 {
    public static void main(){
        test19 obj = new test19("ghj");
        System.out.println(obj);
        //obj.testVar19++;
    }
}
class test19{
    final int testVar19;
    test19(int input){
        testVar19 = 4;
    }
    test19(char input){
        testVar19 = 8;
    }
    test19(String input){
        testVar19 = 12;
    }
    public String toString(){
        return "Values "+ testVar19;
    }
}
