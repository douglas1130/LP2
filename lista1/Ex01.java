import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma temperatura em grau Celsius: ");
		double c = input.nextDouble();
		
		double f = (1.8 * c) + 32;
		
		System.out.println("Fahrenheit: " + f + " graus.");
	}
}
