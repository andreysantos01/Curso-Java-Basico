
import java.util.Scanner;
import  java.util.Locale;

public class aboutMe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome ");
        String nome = scanner.next();

        System.out.println("Digite sua Altura ");
        double altura = scanner.nextDouble();

        System.out.println("Digite sua idade ");
        int idade = scanner.nextInt();


        System.out.println("Olá, me chamo " + nome);
        System.out.println("Tenho "+ idade + " AndreyAnos");
        System.out.println("Minha altura " + altura);

    }
    
}
