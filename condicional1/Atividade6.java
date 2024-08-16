package condicional1;
import java.util.Scanner;
public class Atividade6 {
public static void main(String[] args) {
		
		
	 Scanner scanner = new Scanner(System.in);
     System.out.print("Quantos números você vai inserir? ");
		   int n = scanner.nextInt();
		    int[] numeros = new int[n];
		        System.out.println("Digite os " + n + " números:");
		        for (int i = 0; i < n; i++) {
		        numeros[i] = scanner.nextInt();
		        }
		     boolean todosPositivos = true;
		        for (int numero : numeros) {
		            if (numero <= 0) {
		                todosPositivos = false;
		                break;
		            }
		        }
		        
		        if (todosPositivos) {
		            System.out.println("Todos são positivos.");
		        } else {
		            System.out.println("Nem são positivos.");
		        }
		        scanner.close();
		    }

	}


