package git.ReizisTim.upr17;
//Покажите, что поля интерфейса автоматически являются статическими и неизменными
public class upr17 {
    public static void main(String[] args) {
        cl1 obj = new cl1();
        obj.print();
//        obj.addprint(5);

    }
}
interface intrf1{
    int i =4;
    int j =8;
}
class cl1 implements intrf1{
    void print(){System.out.println(i);}
//    void addprint(int b){System.out.println(i+=b);}
    void addJprint(int b){
//        j = b;
    }
}