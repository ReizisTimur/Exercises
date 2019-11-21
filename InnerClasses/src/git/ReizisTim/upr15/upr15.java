package git.ReizisTim.upr15;
import java.util.Random;
//Измените решение упражнения 19 из главы 9 так, чтобы в нем использовались
//анонимные внутренние классы.
        
//Создайте на базе паттерна «Фабричный метод» программную среду, моделирующую броски монет и броски кубиков.
public class upr15 {
    public static String ChoiceDevice(tossingFactory fact){
        tossing t = fact.getDevice();
        return t.toss();
    }
    public static void main(String[] args){
        String c = ChoiceDevice(tossingCoin.tossing);
        String d = ChoiceDevice(tossingDice.tossing);
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
    public static tossingFactory tossing = new tossingFactory(){
        public tossing getDevice(){
            return new tossingCoin();
        }
    };
    

}
class tossingDice implements tossing{
    public String toss(){
        Random rnd = new Random();
        int tss =rnd.nextInt(6)+1;
        String toss =String.valueOf(tss);
        return toss;
    }
    public static tossingFactory tossing = new tossingFactory(){
        public tossing getDevice(){
            return new tossingDice();
        }
    };
}
interface tossingFactory{
    tossing getDevice();
}
