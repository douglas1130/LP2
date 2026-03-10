import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Digite um número:");
        a = input.nextInt();
        System.out.println("Digite outro número");
        b = input.nextInt();
            
        if (a == b) {
            System.out.println("Ambos são iguais.");
        } else {
            int maior = (a > b) ? a : b;
            System.out.println("O maior número é: " + maior);
        }
    }
}
