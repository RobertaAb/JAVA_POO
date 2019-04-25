package paralelo;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		double[] impares = {1, 5, 3, 7, 9, 11, 13};
		double[] pares = {2, 4, 6, 8, 10, 12, 14};
		Printer printer = new Printer(impares);
		Printer printer2 = new Printer(pares);
		
		printer.setPriority(2);
		printer.start();
		
		printer.sleep(10000);
		
		
		printer2.start();
	}

}
