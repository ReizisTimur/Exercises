/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.ReizisTim.upr21;
//Создайте интерфейс U с тремя методами. Создайте класс А с методом, который
//создает ссылку на U посредством построения анонимного внутреннего класса.
//Создайте второй класс B, который содержит массив U. Класс B содержит один ме-
//тод, который получает и сохраняет ссылку на U в массиве; второй метод, который.
//сбрасывает ссылку в массиве (определяемую аргументом метода) в состояние
// null; и третий метод, который перебирает элементы массива и вызывает методы U.
//В методе main() создайте группу объектов А и один объект B. Заполните объект В
//ссылками U, произведенными объектами А. Используйте В для выполнения обратных
//вызовов по всем объектам А. Удалите некоторые ссылки на U из В.
/**
 *
 * @author tamerlan
 */
public class upr21 {
    public static void main(String[] args){
        A obj1 = new A();
        A obj2 = new A();
        A obj3 = new A();
        A obj4 = new A();
        B massObj = new B(4);
        //заполняем масси
        massObj.putU(obj1.getU());
        massObj.next();
        massObj.putU(obj2.getU());
        massObj.next();
        massObj.putU(obj3.getU());
        massObj.next();
        massObj.putU(obj4.getU());
        massObj.next();
        
        //вызов методов объетов
        for(int i =0; i <massObj.sizeP; i++){
            massObj.manipulateU();
            massObj.next();
        }
        //выбор удаляемого объекта 
        massObj.next();
        massObj.next();
        massObj.removeU();
        massObj.next();
        massObj.next();
        //вызов методов объетов
        for(int i =0; i <massObj.sizeP; i++){
            massObj.manipulateU();
            massObj.next();
        }


    }    
}
interface U{
    void meth1();
    void meth2();
    void meth3();
    }
class A{
    U getU(){
        return new U(){
            public void meth1(){System.out.println("start meth1  " + this.name());};
            public void meth2(){System.out.println("start meth2  "+ this.name());};
            public void meth3(){System.out.println("start meth3  "+ this.name());};
            String name(){return this.getClass().getName();}
        };  
    }
}
class B{
    B(int size){
        massiveU = new U[size];
        sizeP = size;
    };
    U[] massiveU;
    int sizeP;
    int i = 0;
    void putU(U input){
        if(i<sizeP){
            massiveU[i] = input;
            System.out.println("Save object U in "+ (i +1));
        }
        else System.out.println("Error!!");    

    }
    void removeU(){
        if(i<sizeP){
            massiveU[i] = null;
            System.out.println("Remove object U in "+ (i +1));
        }
        else System.out.println("Error!!");    

    }
    void manipulateU(){
        if(massiveU[i] != null && (i<sizeP)){
            massiveU[i].meth1();
            massiveU[i].meth2();
            massiveU[i].meth3();
        }
        else System.out.println("No object!");    
    }
    void next(){
        if(i+1<sizeP){
        ++i;       
        }
        else i =0;
        System.out.println("place  "+ (i +1));
        
    }
         
    
    
}