package git.ReizisTim;
//Создайте класс с неизменным (final) методом. Создавайте произвольный класс и попытайтесь
// переопределить этот метод.
public class upr21 {
    public static void main(String[] args){

    }
}
class test21{
    final void test(){
        System.out.println("fdsdfsdf");
    }
}
class test21b extends test21{
    void test(){} //запрещено
}
