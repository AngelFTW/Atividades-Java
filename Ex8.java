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
			System.out.println("Digite o codigo para a opera��o: 1- Adi��o | 2 - Subtra��o | 3 - Multiplica��o | 4 - Divis�o");
			int cod = teclado.nextInt();
			
			
			switch(cod) {
			case 1: System.out.println("Adi��o: " +(num1+num2));
				break;
				
			case 2: System.out.println("Subtra��o: "+(num1-num2));
				break;
			
			case 3: System.out.println("Multiplica��o: "+(num1*num2));
				break;
			
			case 4: System.out.println("Divis�o: "+(num1/num2));
				break;
			
			default: System.out.println("Codigo inexistente");
				break;
			
			}
			teclado.close();
		}

	}
