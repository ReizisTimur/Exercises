package git.ReizisTim.upr5;
//Создайте класс с внутренним классом. В отдельном классе создайте экземпляр.
//внутреннего класса.
public class upr5 {
    public static void main(String[] args){
        Outer obj = new Outer();
        Outer.Inner f= obj.new Inner();
        System.out.println(f.core);

    }
}
class Outer{
    String core ="Class_Outer";
    class Inner{
        String core="Class_Inner";
    }
}