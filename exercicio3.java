import java.util.Scanner;
public class exercicio3 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
 String  mb, b, r, i, opcao;
 double a, mbb, bb, rr, ii, p1, p2, p3, p4;
 
	System.out.println("Digite o número de alunos que tiraram MB:");
	mbb = ler.nextDouble();
 
	System.out.println("Digite o número de alunos que tiraram B:");
	bb = ler.nextDouble();
	
	System.out.println("Digite o número de alunos que tiraram R:");
	rr = ler.nextDouble();
	
	System.out.println("Digite o número de alunos que tiraram I:");
	ii = ler.nextDouble();
	
	a = mbb+bb+rr+ii;
	System.out.println("o número total de alunos é:" + a);
	
	p1 = mbb/a*100;
	
	p2 = bb/a*100;
	
	p3 = rr/a*100;
	
	p4 = ii/a*100;
	
	System.out.println("digite a menção que você quer ver a porcentagem:");
	 opcao = ler.next();
	
	switch(opcao) {
	case "mb":
		System.out.println("a porcentagem de alunos com mb é:" + p1);
		break;
	case "b":
		System.out.println("a porcentagem de alunos com b é:" + p2);
		break;
	case "r":
		System.out.println("a porcentagem de alunos com r é:" + p3);
		break;
	case "i":
		System.out.println("a porcentagem de alunos com i é:" + p4);
		break;
	default:
			System.out.println("inválido");
}
	ler.close();a
}}
