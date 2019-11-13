package git.ReizisTim.upr19;

import java.util.Random;

//Создайте на базе паттерна «Фабричный метод» программную среду, моделирующую броски монет и броски кубиков.
public class upr19 {
    public static String ChoiceDevice(tossingFactory fact){
        tossing t = fact.getDevice();
        return t.toss();
    }
    public static void main(String[] args){
        String c = ChoiceDevice(new ImplCoinFact());
        String d = ChoiceDevice(new ImplDiceFact());
        System.out.println("Coin  "+c+", dice  "+d);
    }
}
interface tossing{
    String toss();
}
class tossingCoin implements tossing{
    public String toss(){
        String toss = " ";
        Random rnd = new Random();
        int tss =rnd.nextInt(2);
        switch (tss){
            case 0: toss ="Решка";break;
            case 1: toss ="Орел";break;
        }
        return toss;
    }
}
class tossingDice implements tossing{
    public String toss(){
        Random rnd = new Random();
        int tss =rnd.nextInt(6)+1;
        String toss =String.valueOf(tss);
        return toss;
    }
}
interface tossingFactory{
    tossing getDevice();
}
class ImplCoinFact implements tossingFactory{
    public tossing getDevice(){return new tossingCoin();}
}
class ImplDiceFact implements tossingFactory{
    public tossing getDevice(){return new tossingDice();}
}