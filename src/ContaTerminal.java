import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor digite o número da conta: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Por favor digite o número da agência: ");
        String agency = sc.nextLine();

        System.out.print("Por favor digite seu nome: ");
        String name = sc.nextLine();

        System.out.println("Por favor digite seu saldo: ");
        double balance = sc.nextDouble();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque");

        sc.close();
    }

}
