import java.util.Scanner;

public class Ex09 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = 1, i = 1, soma = 0;
        
        while (num != 0) {
            System.out.print(i + "º número:");
            num = input.nextInt();
            
            if (num != 0) {
                soma += num;  
            }
            
            i++;
        }
        
        System.out.println("Soma: " + soma);
        input.close();
    }
}
