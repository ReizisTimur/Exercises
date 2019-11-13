package git.ReizisTim;

class Cycle{
    String rideS = "Катись, колесо";
    void ride(Cycle input){
        System.out.println(input.rideS);
    }
}
class Unicycle extends Cycle{
    String rideS ="Катись, одно колесо";
}
class Bicycle extends Cycle{
    String rideS = "Катитесь, два колеса";
}
class Tricycle extends Cycle {
    String rideS = "Катитесь, три колеса";
}