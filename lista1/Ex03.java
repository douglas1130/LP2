import java.util.Scanner;

public class Ex03
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Salario fixo: ");
		double salario = input.nextDouble();
		
		System.out.print("Percentual de comissao: ");
		double comissao = input.nextDouble();
		
		double salarioTotal = salario * (1 + (comissao/100));
		
		System.out.println("Salario total: " + salarioTotal + " reais.");
	}
}
