public class Ex01 {
    public static void main (String [] args) {
        int soma = 0;
        
        for (int i = 1; i <= 100; i++) {
            if (i != 100) {
                System.out.print(i + " + ");
            } else {
                System.out.print(i);
            }
            
            soma += i;
        }
        
        System.out.print("\nSoma = " + soma);
    }
}
