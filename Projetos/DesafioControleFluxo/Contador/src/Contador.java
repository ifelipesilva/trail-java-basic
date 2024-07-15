import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro valor: ");
        int parametroUm = sc.nextInt();
        System.out.println("digite o segundo valor: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch(Exception e){
            ParametrosInvalidosExeption();
        }

        sc.close();
    }

    static void contar(int parametroUm, int parametroDois) throws Exception {

        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois) {
            throw new Exception();
        }
                
        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for(int i = 1; i <= contagem; i++){
            System.out.println("numeros: "+i);
        }


    }

    static void ParametrosInvalidosExeption(){
        System.out.println("O segundo valor deve ser maior que o primeiro");
    }
}
