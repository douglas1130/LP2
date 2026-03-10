import java.util.Scanner;

public class Ex05 {
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Digite um número inteiro:");
        num = input.nextInt();
        
        if (num > 0) {
            System.out.println("Número positivo.");        
        } else if (num == 0) {
            System.out.println("Número nulo.");
        } else {
            System.out.println("Número negativo.");
        }
    }
}
