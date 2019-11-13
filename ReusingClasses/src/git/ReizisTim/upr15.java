package git.ReizisTim;
//Создайте класс в пакете. Ваш класс должен содержать метод со спецификатором protected. Попытайтесь вызвать метод
// protected за пределами пакета, и объясните, что происходит. Затем создайте класс, производный от вашего, и вызовите
// метод protected из другого метода вашего производственного класса.
public class upr15 {

    static class withPro{
        protected void  meth(){
            System.out.println("Protected method");
        }
    }
    public static void main (String[] args) {
        class second extends withPro {
            second() {
                meth();
            }
        }
        second obj = new second();
    }
}
