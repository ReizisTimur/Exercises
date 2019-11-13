package git.ReizisTim.upr17;
//создайте класс Starship со ссылкой на объект
//Alertstatus, который может обозначать одно из трех состояний. Включите методы
//для изменения состояния.
public class Starship {
    public static void main(String[] args){
        if(args.length==0){args = new String[]{"5"};}
        int al = Integer.valueOf(args[0]);
        Alertstatus alertS = new Alertstatus();
        System.out.println(alertS.alertswitch(al));
    }
}
class Alertstatus{
    String alertswitch(int i){
        String alert;
        switch (i){
            case 0: alert="Asteroids!!";break;
            case 1: alert="Sectoids!!";break;
            default: alert="All right";break;
        }
        return alert;
    }
}

