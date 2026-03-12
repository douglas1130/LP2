import java.util.Scanner;

public class Ex01 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] listamaior = new int[8];
        int maior = Integer.MIN_VALUE;
        
        for (int i = 0; i < listamaior.length; i++) {
            System.out.print(i+1 + "º número:");
            listamaior[i] = input.nextInt();
            
            if (listamaior[i] > maior) {
                maior = listamaior[i];
            }
        }
        
        System.out.println("Maior número: " + maior);
        
        input.close();  
    }
}
