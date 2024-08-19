import java.util.Scanner;
public class Exercicio04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int c;
		
		System.out.println("Digite o código:");
		c = ler.nextInt();
		
		switch(c) {
		case 1:
			System.out.println("Cachorro Quente - R$ 8,00");
			break;
		case 2:
			System.out.println("Cheeseburger - R$ 12,00");
			break;
		case 3:
			System.out.println("X-Salada - R$ 15,00");
			break;
		case 4:
			System.out.println("Misto Quente - R$ 11,00");
			break;
		case 5:
			System.out.println("Pão na chapa - R$ 6,00");
			break;
		default:
			System.out.println("Código inválido");
		}
		ler.close();
	}

}
