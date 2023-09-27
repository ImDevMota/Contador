import java.util.Scanner;
import java.util.Locale;
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira um número: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Insira outro número: ");
        int parametroDois = terminal.nextInt(); 
        

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
           System.out.println("O Segundo parametro deve ser maior que o primeiro!");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for(int num = 1; num <= contagem; num++) {
            System.out.println("Imprimindo o número " + num);
        }
    }
}
