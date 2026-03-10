import java.util.Scanner;

public class Ex08 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        int soma = 0;
        
        for (int i=1; i<=5; i++) {
            System.out.print(i + "º número: ");
            int num = input.nextInt();
            
            soma += num;
        }
        
        System.out.println("A soma é " + soma);
    }
}
