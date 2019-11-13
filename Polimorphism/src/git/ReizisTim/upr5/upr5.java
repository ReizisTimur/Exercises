package git.ReizisTim.upr5;
//В упражнение 1 добавьте в класс Cycle метод wheels(), возвращающий количество колес каждого транспортного средства.
// Измените метод ride() так, чтобы он вызывал wheels(), и убедитесь в том, что полиморфизм успешно работает.
public class upr5 {
    public static void main(String[] args) {
        Cycle vel = new Tricycle();
        vel.ride(vel);
    }
}
class Cycle{
    String rideS = "Катись, колесо";
    void wheels(){System.out.println("wheel");}
    void ride(Cycle input){
        System.out.println(input.rideS);
        this.wheels();
    }
}
class Unicycle extends Cycle{
    String rideS ="Катись, одно колесо";
    void wheels(){System.out.println("1 wheel");}

}
class Bicycle extends Cycle{
    String rideS = "Катитесь, два колеса";
    void wheels(){System.out.println("2 wheel");}

}
class Tricycle extends Cycle{
    String rideS = "Катитесь, три колеса";
    void wheels(){System.out.println("3 wheel");}
}
