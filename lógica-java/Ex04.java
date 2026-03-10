import java.util.Scanner;

public class Ex04 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        
        String nome;
        int idade;
        double altura;

        System.out.println("Qual o seu nome?");
        nome = input.nextLine();
        
        System.out.println("Qual a sua idade?");
        idade = input.nextInt();

        System.out.println("Qual a sua altura?");
        altura = input.nextDouble();

        System.out.print("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura);
    }
}
