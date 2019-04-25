package colecoes;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class App {

	public static void main(String[] args) {
		List<String> listinha = new ArrayList<String>();
		listinha.add("Tony start");
		listinha.add("Steve Rogers");
		listinha.add("Bruce Banner");
		
		Collections.sort(listinha);
		
		for (String nome : listinha) {
			System.out.println(nome);
			
		}
	}

}
