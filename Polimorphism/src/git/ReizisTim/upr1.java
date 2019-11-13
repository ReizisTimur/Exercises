package git.ReizisTim;
//Создайте класс Cycle с произвольными классами Unicycle, Bicycle и Tricycle. Покажите, что экземпляр каждого из
// производных типов может быть преобразован в Cycle, на примере вызова метода ride().
public class upr1 {
    public static void main(String[] args) {
        Bicycle vel = new Bicycle();
        vel.ride(vel);
    }
}

