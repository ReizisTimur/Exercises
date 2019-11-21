package git.ReizisTim.upr10;

//Создайте интерфейс, содержащий минимум один метод. Реализуйте его, опре-
//деляя внутренний класс в методе, который возвращает ссылку на ваш интерфейс.
//Использйте анонимный класс
class upr10{
	public static void main(String[] args){
		otter obj1 = new otter();
		innerInt obj2= obj1.getInner();
		obj2.innerMeth();
	}

}
interface innerInt{
	void innerMeth();
}
class otter{
	innerInt getInner(){
		return new innerInt(){
			public void innerMeth(){System.out.println("InnerInt init");}
		};
	}
}