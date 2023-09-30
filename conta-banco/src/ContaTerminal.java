import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TOdo:Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela classe scanner os valores digitados no terminal

        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência!");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o saldo que irá depositar:");
        double saldo = scanner.nextDouble();


        //Exibir a mensagem final da conta

        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", o número da sua conta é " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque. ");
        scanner.close();   
        } 
        catch (java.util.InputMismatchException e) {
        System.out.println("O número da conta deve conter apenas números// O saldo deve ser descrito com ponto ao invés de vírgula. Ex.: (500,40) ");
        }
    }
}
