import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int par = 0, impar = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            int num = input.nextInt();
            
            if (num % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }
        }
        
        System.out.println("Pares: " + par + "\nÍmpares: " + impar);
	}
}
