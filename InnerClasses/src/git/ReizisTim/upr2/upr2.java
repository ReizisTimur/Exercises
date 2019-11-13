package git.ReizisTim.upr2;
//Создайте класс, который содержит String и метод toString() для вывода хранимой строки.
//Добавьте несколько экземпляров нового класса в объект Sequence.
//и выведите их.
public class upr2 {
        public static void main(String[] args){
            int size = 6;
            Sequence s = new Sequence(size);
            for (int i =0; i<size; i++){
                s.add(i);
            }
            s.show(2);
            s.show(3);
        }

}
interface classStr{
    String toString2();
}
class Sequence {
    private ClStr[] items;
    Sequence(int size){items =new ClStr[size];}
    void add(int position){
          items[position]= new ClStr(position);
    }
    void show(int input){
        System.out.println(items[input].toString2());

    }
     private class ClStr implements classStr{
        String core;
         ClStr(int input){core="OBG "+Integer.toString(input);}
    public String toString2(){return core;}
    }
}