
public class TestAnimal {
	public static void main(String[] args) {
		Lion l = new Lion(1000, 11);
		l.eatMeat();
		l.printSound();
		
		Animal a = l;
		a.printSound();
		//상향 캐스팅 해서 고기 못먹음
		
		Duck d = new Duck(4, 2);
		d.fly();
		d.printSound();
		
		Animal b = d;
		d.printSound();
	// 상향캐스팅해서 나는건 못함 	
		
	}
}
