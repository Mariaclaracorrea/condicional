package condicional1;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int dia;
	System.out.print("informe o dia da semana");
	dia = ler.nextInt();
    
	switch (dia) {
	
	case 1:
		System.out.print("o dia escolhido foi domingo");
		break;
	case 2:
		System.out.print("o dia escolhido foi segunda");
		break;
	case 3:
		System.out.print("o dia escolhido foi terca");
		break;
	case 4:
	    System.out.print("o dia escolhido foi quarta");
	    break;
	case 5:
		System.out.print("o dia escolhido foi quinta");
		break;
	case 6:
		System.out.print("o dia escolhido foi sexta");
		break;
	case 7:
		System.out.print("o dia escolhido foi sabado");
		break;
	default:
		System.out.print("informe o dia invalido");
	}
	ler.close();
		

	}

}
