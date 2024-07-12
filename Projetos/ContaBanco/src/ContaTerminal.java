import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);


       System.out.println("Qual seu nome?");
       String nome = sc.nextLine();


       System.out.println("Qual seu sobrenome?");
       String sobrenome = sc.nextLine();

       System.out.println("Por favor, digite o número da conta !");

       int conta = sc.nextInt();

       System.out.println("Por favor, digite o número da Agência !");
       int agencia = sc.nextInt();
        
       System.out.println("Por favor, digite o saldo da conta !");
       double saldo = sc.nextDouble();




        System.out.println("Ola, " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua conta criada foi: " + conta + ", agencia: " + agencia + ", e seu saldo inicial foi: " + saldo + " Reais");

        sc.close();



    }
}
