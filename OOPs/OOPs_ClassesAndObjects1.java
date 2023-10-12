package mypack;
	class Pokemon{
		String name;
		int level;
		void attack() {
			System.out.println(name + " Attack!!!");
		}
	}

public class OOPs_ClassesAndObjects1 {
	public static void main(String[] args) {
		Pokemon p1 = new Pokemon();
		p1.name="Pikachu";
		p1.level=10;
		
		Pokemon p2 = new Pokemon();
		p2.name="Eyris";
		p2.level=13;
		
		System.out.println(p1.name +" "+p1.level);
		System.out.println(p2.name +" "+p2.level);
		p2.attack();

	}

}
