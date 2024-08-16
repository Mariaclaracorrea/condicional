package condicional1;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
   Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de numeros: ");
        int quantidade = scanner.nextInt();
        
        int[] numeros = new int[quantidade];
        
        System.out.println("Digite os numeros:");
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("Numeros pares digitados:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
        
        
		scanner.close();
    }

	}


