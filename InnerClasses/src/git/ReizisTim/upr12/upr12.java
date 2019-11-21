package git.ReizisTim.upr12;
//Измените пример HorrorShow, реализовав DungerounMonsters
//и Vampire как анонимные классы.

//: interfaces/HorrorShow.java
// Extending an interface with inheritance.
interface Monster {
	void menace();
}
interface DangerousMonster extends Monster {
	void destroy();
}
interface Lethal {
	void kill();
}
class DragonZilla implements DangerousMonster {
	public void menace() {}
	public void destroy() {}
}
interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}
class VeryBadVampire implements Vampire {
	public void menace() {}
	public void destroy() {}
	public void kill() {}
	public void drinkBlood() {}
}
public class upr12 {
	static DragonZilla dragonzilla(){
		return new DragonZilla(){
			public void kill() {System.out.println("Kill");}
			public void menace() {System.out.println("Menace");}
			public void destroy() {System.out.println("Destroy");}
		};
	}
	static Vampire verybadvampire(){
		return new Vampire(){
			public void menace() {System.out.println("Menace");}
			public void destroy() {System.out.println("Destroy");}
			public void kill() {System.out.println("Kill");}
			public void drinkBlood() {System.out.println("DrinkBloode");}
		};
	}
	static void u(Monster b) { b.menace(); }
	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}
	static void w(Lethal l) { l.kill(); }
	public static void main(String[] args) {
		System.out.println("Start");
		DangerousMonster barney = dragonzilla();
		u(barney);
		v(barney);
		Vampire vlad = verybadvampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}
}