import java.util.Scanner;

//Exceção customizada.
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro (Número inteiro)");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro (Número inteiro)");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        /*
        Adicionei a lógica OU para casos onde o usuário entre com os valores zero para ambos os parametros.
        Tratando esse cenário alternativo também
        */
        if (parametroUm > parametroDois || parametroUm == parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        for (int i=0; i<contagem; i++){
            System.out.println("Imprimindo número: " + (i+1));
        }
    }
}
