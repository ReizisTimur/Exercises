package git.ReizisTim.upr18;
//Используя иерархию Cycle из упражнения 1, включите метод balance() в классы
//Unicycle и Bicycle, но нe B Tricycle. Создайте экземпляры всех трех типов и выпол-
//ните их восходящее преобразование в массив Cycle. Попробуйте вызвать balance( ).
//для каждого элемента массива. Теперь выполните нисходящее преобразование,
//вызовите Ба1апсе() и проанализируйте результат.
public class upr18 {
    public static void main(String[] args) {
        Cycle b = new Bicycle();
        Cycle u = new Unicycle();
        Cycle t = new Tricycle();
        b.balance();
        u.balance();
        t.balance();
        ((Bicycle)b).balance();
        ((Unicycle)u).balance();
        ((Tricycle)t).balance();



    }
}
class Cycle{
    String rideS = "Катись, колесо";
    void ride(Cycle input){
        System.out.println(input.rideS);
    }
    void balance(){System.out.println("колесо в вакууме");}

}
class Unicycle extends Cycle{
    String rideS ="Катись, одно колесо";
    void balance(){System.out.println("Тяжело на одном колесе");}
}
class Bicycle extends Cycle{
    String rideS = "Катитесь, два колеса";
    void balance(){System.out.println("На двух колесах норм");}

}
class Tricycle extends Cycle {
    String rideS = "Катитесь, три колеса";
}