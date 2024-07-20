public class Main {
  public static void main(String[] args) {

    Cliente felipe = new Cliente();
    felipe.setNome("Felipe");

    IConta cc = new ContaCorrente(felipe);
    cc.depositar(100);
    IConta cp = new ContaPoupanca(felipe);
    cc.transferir(100, cp);


   cc.imprimirExtrato();
   cp.imprimirExtrato();


  }
}
