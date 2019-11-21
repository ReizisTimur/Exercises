package git.ReizisTim.upr13;

//Создайте класс, не содержащий конструктор по умолчанию (конструктор без
//аргументов). При этом класс должен содержать конструктор, получающий аргу-
//менты. Создайте второй класс с методом, который возвращает ссылку на объект
//первого класса. Возвращаемый объект должен создаваться посредством анонимного
//внутреннего класса, производного от первого.
public class upr13{
	static public void main(String[] args){
		Second obj = new Second();
		First obj2= obj.getFirst("test");
	}
}
class First{
	First(String input){
		System.out.println("init first = " + input);
	}
}
class Second{
	First getFirst(String input){
		return new First(input){
			{System.out.println("anonim" +input);}
		};
	}
}
