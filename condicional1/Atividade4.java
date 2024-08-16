package condicional1;
import java.util.ArrayList;
import java.util.Scanner;
public class Atividade4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int num;
	int sm = 0;
	 for(int i = 0; i < 5 ; i++ ) {
	System.out.println("Digite um número para a lista");
	num = ler.nextInt();
	numeros.add(num);
	sm += num;
		}
	System.out.println("Os números da lista são: ");
		for(int p : numeros) {
	System.out.println("["+p+"]");
		}
		System.out.println("A soma dos números desta lista é igual a: "+ sm);
	ler.close();
	}
		



	}


