import java.util.Scanner;

public class Ex06
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    int idade;
	    
	    System.out.print("Digite sua idade:");
	    idade = input.nextInt();
	    
	    if (idade >= 16) {
	        System.out.println("Pode votar!");
	    } else {
	        System.out.println("Não pode votar.");
	    }
	}
}
