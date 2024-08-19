import java.util.Scanner;
public class Exercicio02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int d, m;
		
		System.out.println("Digite o seu dia de nascimento: ");
		d = ler.nextInt();
		
		if (d>31)
			System.out.println("Dia inválido");
			else
				System.out.println("Digite o seu mês de nascimento: ");
				m = ler.nextInt();
		
		
		switch(m) {
		case 1:
			System.out.println("Janeiro");
			if (d<=19)
				System.out.println("Capricórnio");
			else
				System.out.println("Aquário");
			break;
		case 2:
			System.out.println("Fevereiro");
			if (d<=19)
				System.out.println("Aquário");
			else
				System.out.println("Peixes");
			break;
		case 3:
			System.out.println("Março");
			if (d<=20)
				System.out.println("Peixes");
			else
				System.out.println("Áries");
			break;
		case 4:
			System.out.println("Abril");
			if (d<=20)
				System.out.println("Áries");
			else
				System.out.println("Touro");
			break;
			
		case 5:
			System.out.println("Maio");
			if (d<=20)
				System.out.println("Touro");
			else
				System.out.println("Gêmeos");
			break;
		case 6:
			System.out.println("Junho");
			if (d<=20)
				System.out.println("Gêmeos");
			else
				System.out.println("Câncer");
			break;
		case 7:
			System.out.println("Julho");
			if (d<=22)
				System.out.println("Câncer");
			else
				System.out.println("Leão");
			break;
		case 8:
			System.out.println("Agosto");
			if (d<=22)
				System.out.println("Leão");
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
				System.out.println("Escorpião");
			break;
		case 11:
			System.out.println("Novembro");
			if (d<=20)
				System.out.println("Escorpião");
			else
				System.out.println("Sagitário");
			break;
			
		case 12:
			System.out.println("Dezembro");
			if (d<=20)
				System.out.println("Sagitário");
			else
				System.out.println("Capricórnio");
			break;
		default:
			System.out.println("Mês inválido");
		}
		ler.close();
	}

}