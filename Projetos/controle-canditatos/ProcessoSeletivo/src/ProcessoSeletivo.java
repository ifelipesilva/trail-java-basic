import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
   public static void main(String[] args) {
    String[] candidatos = {"FELIPE", "JOSE", "BRUNO", "JULIA", "VITORIA"};

    for (String candidato : candidatos) {
        entrandoEmContato(candidato);
    }
   }

   static void entrandoEmContato(String candidato){
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;
    
    do {
        atendeu = atender();
        continuarTentando = !atendeu;
        if(continuarTentando)
            tentativasRealizadas++;
        else 
            System.out.println("Contato realizado com sucesso");            
    } while(continuarTentando && tentativasRealizadas < 3);

    if(atendeu)
        System.out.println("Conseguimos contato com " + candidato + " NA " + tentativasRealizadas + " tentativa");
    else 
        System.out.println("Nao conseguimos contato com " + candidato + " Numero maximo de tentativas " + tentativasRealizadas + " realizada");

   }


   //metodo auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE", "JOSE", "BRUNO", "JULIA", "VITORIA"};
        System.out.println("Imprimindo a lista de candidatos selecionados: ");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("candidato de numero " + (i+1) + " é o " + candidatos[i]);
        }

        System.out.println("For each abrediado");

        for (String candidato : candidatos) {
            System.out.println("Candidato selecionado: " + candidato);
        }

    }
    static void selecaoCandidatos( ) {
        String[] candidatos = {"FELIPE", "JOSE", "BRUNO", "JULIA", "VITORIA", "MARIA", "LUCAS", "ANA", "PEDRO", "ISABELA"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido =  ValorPretendido();


            System.out.println("O Candidato: " + candidato + " Solicitou esse valor de salario: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("Candidato selecionado: " + candidato);
                candidatosSelecionados++;
            }

            candidatoAtual++;
        }
    }

    static double ValorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

   static void analisarCanditato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) { 
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){ 
            System.out.println("Ligar para o canditato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
   }
}
