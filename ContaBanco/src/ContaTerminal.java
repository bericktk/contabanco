import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String [] args){
        try(Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){

            System.out.println("Digite o numero da conta: ");
            int numero = scanner.nextInt();

            System.out.println("Digite o agência da conta: ");
            String agencia = scanner.next();

            scanner.nextLine();

            System.out.println("Digite o titular da conta: ");
            String titular = scanner.nextLine();

            System.out.println("Digite o saldo da conta: ");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + titular+", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+", conta "+numero+" e seu saldo " +saldo+" já está disponível para saque.");

        }
    }
}
