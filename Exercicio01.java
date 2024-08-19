import java.util.Scanner;
public class Exercicio01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		
		System.out.println("Digite sua Idade:");
		i = ler.nextInt();
		
		switch(i) {
		case 6:
			System.out.println("Dente de leite");
			break;
		case 7:
			System.out.println("Júnior");
			break;
		case 8:
			System.out.println("Júnior max");
			break;
		case 9:
			System.out.println("Júnior master");
			break;
		case 10:
			System.out.println("Master");
			break;
		default:
			System.out.println("Número inválido");
		}
		ler.close();
	}

}
