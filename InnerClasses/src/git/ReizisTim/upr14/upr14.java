package git.ReizisTim.upr14;
// Измените решение упражнения 11 из главы 9 так, чтобы в нем использовались
//анонимные внутренние классы.

//Создайте класс с методом, который получает элемент String и переставляет местами каждую пару символов в
// строке. Адаптируйте класс так чтобы он работал с интерфейсом interfaceprocessor.Apply.process( )
public class upr14 {
    public static void main(String[] args) {
        Apply.process(new SwapPairs(), args[0]);
    }
}
interface Processor {
    String name();
    //Object process(String input);
    SwapPairs getSP(final String input);

}
class Apply {
    public static void process(Processor p, String s) {
        System.out.println("Using Processor " + p.name());
        //System.out.println(p.process(s));
	SwapPairs obj = p.getSP(s);
	
    }
}
abstract class StringProcessor implements Processor {
    public String name() {
        return getClass().getSimpleName();
    }
    public SwapPairs getSP(final String input){
		return new SwapPairs(){
			int l = input.length()/2;
       			int n =0;
        		{
				for(int i=0; i<l; i++){
       				if(n==0){output = input.substring(n+1, n+2) + input.substring(n, n+1);}
       				else output +=  input.substring(n+1, n+2) + input.substring(n, n+1);
       				n+=2;
       				}
	       			if(input.length()%2>0) output+=input.substring(input.length()-1);
       				System.out.println(output);
			}
		};
   }
}
class SwapPairs extends StringProcessor{
    String output;
    
}