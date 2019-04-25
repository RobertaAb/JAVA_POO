package paralelo;

public class Printer extends Thread {
	public double[] values;
	
	public Printer(double[] values) {
		this.values = values;
	}

	public void makeList() {
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		
	}

	@Override
	public void run() {
		makeList();
	}
}
