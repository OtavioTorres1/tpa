import java.util.Scanner;
public class Exercicio02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int d, m;
		
		System.out.println("Digite o seu dia de nascimento: ");
		d = ler.nextInt();
		
		if (d>31)
			System.out.println("Dia inv�lido");
			else
				System.out.println("Digite o seu m�s de nascimento: ");
				m = ler.nextInt();
		
		
		switch(m) {
		case 1:
			System.out.println("Janeiro");
			if (d<=19)
				System.out.println("Capric�rnio");
			else
				System.out.println("Aqu�rio");
			break;
		case 2:
			System.out.println("Fevereiro");
			if (d<=19)
				System.out.println("Aqu�rio");
			else
				System.out.println("Peixes");
			break;
		case 3:
			System.out.println("Mar�o");
			if (d<=20)
				System.out.println("Peixes");
			else
				System.out.println("�ries");
			break;
		case 4:
			System.out.println("Abril");
			if (d<=20)
				System.out.println("�ries");
			else
				System.out.println("Touro");
			break;
			
		case 5:
			System.out.println("Maio");
			if (d<=20)
				System.out.println("Touro");
			else
				System.out.println("G�meos");
			break;
		case 6:
			System.out.println("Junho");
			if (d<=20)
				System.out.println("G�meos");
			else
				System.out.println("C�ncer");
			break;
		case 7:
			System.out.println("Julho");
			if (d<=22)
				System.out.println("C�ncer");
			else
				System.out.println("Le�o");
			break;
		case 8:
			System.out.println("Agosto");
			if (d<=22)
				System.out.println("Le�o");
			else
				System.out.println("Virgem");
			break;
		case 9:
			System.out.println("Setembro");
			if (d<=20)
				System.out.println("Virgem");
			else
				System.out.println("Libra");
			break;
			
		case 10:
			System.out.println("Outubro");
			if (d<=20)
				System.out.println("Libra");
			else
				System.out.println("Escorpi�o");
			break;
		case 11:
			System.out.println("Novembro");
			if (d<=20)
				System.out.println("Escorpi�o");
			else
				System.out.println("Sagit�rio");
			break;
			
		case 12:
			System.out.println("Dezembro");
			if (d<=20)
				System.out.println("Sagit�rio");
			else
				System.out.println("Capric�rnio");
			break;
		default:
			System.out.println("M�s inv�lido");
		}
		ler.close();
	}

}