package par_thread;

public class main2 {

	public static void main(String[] args) {
		Paralela p1 = new Paralela ("A");
		Paralela p2 = new Paralela ("b");
		
		p1.start();
		p2.start();

	}

}
