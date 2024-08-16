package condicional1;

import java.util.ArrayList;
import java.util.Arrays;

public class Atividade3 {

	public static void main(String[] args) {
		String[] diciplinas = {"matemática", "filosofia", "historia","fisica"};
		ArrayList<String>novaLista = new ArrayList<String> (Arrays.asList(diciplinas));
		novaLista.add ("geografia");
		novaLista.add ("língua inglesa");
		
		for (String i: novaLista)
		{
			System.out.println("diciplina: " + i);
		}

	}

}
