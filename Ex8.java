import java.util.Locale;
import java.util.Scanner;

public class Ex8{
	


		public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			System.out.println("Digite um numero: ");
			Scanner teclado = new Scanner(System.in);
			int num1 = teclado.nextInt();
			System.out.println("Digite outro numero: ");
			int num2 = teclado.nextInt();
			System.out.println("Digite o codigo para a operação: 1- Adição | 2 - Subtração | 3 - Multiplicação | 4 - Divisão");
			int cod = teclado.nextInt();
			
			
			switch(cod) {
			case 1: System.out.println("Adição: " +(num1+num2));
				break;
				
			case 2: System.out.println("Subtração: "+(num1-num2));
				break;
			
			case 3: System.out.println("Multiplicação: "+(num1*num2));
				break;
			
			case 4: System.out.println("Divisão: "+(num1/num2));
				break;
			
			default: System.out.println("Codigo inexistente");
				break;
			
			}
			teclado.close();
		}

	}
