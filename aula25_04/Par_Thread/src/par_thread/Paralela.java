package par_thread;

public class Paralela extends Thread{
	private String nome;
	public Paralela (String nome) {
		this.nome = nome;
	}
	public void contagem() {
		int contagem = 0;
		for (int i= 1; i <=10; i++) {
			contagem++;
			System.out.println("contagem "+ nome +": " + contagem);");
		}
	}
	@Overrride
	public void run() {
		contagem();
	}
}
