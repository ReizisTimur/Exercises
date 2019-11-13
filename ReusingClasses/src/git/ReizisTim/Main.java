package git.ReizisTim;

public class Main {

    public static void main(String[] args) {
	// 1. Создайте простой класс. Во втором классе определите ссылку на объект первого класса. Используйте отложенную
    // для создания экземпляров этого класса

//        class upr1{
//            SimpleCl obj = new SimpleCl();
//            String SimpleStr;
//            upr1(){
//                if (obj.SimpleStr==null){
//                    obj.SimpleStr = "initObg";
//                }
//                SimpleStr = "init";
//                System.out.println(SimpleStr + "  "+obj.SimpleStr);
//
//            }
//        }
//        upr1 u1 = new upr1();

        // 2. Создайте простой класс. Во втором классе определите ссылку на объект первого класса. Используйте отложенную
        // для создания экземпляров этого класса

        NewDetergent x = new NewDetergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilise();
        System.out.print(x);

        //3. Докажите, что даже если конструктор класса Cartoon не определен, компилятор сгенерирует конструктор по умолчанию
        //в котором также вызывается конструктор базового класса.

//        Cartoon x = new Cartoon();

        //5. Создайте два класса A и B, имеющие конструкторы по умолчанию (с пустым списком аргументов)б
        // которые выводят сообщение о вызове. Создайте класс С, производный от А, создайте в С объект класса В

    }
}




