import java.util.Scanner;

public class ContaTerminal {
    public static void main (String []args){
        Double salarioUsuario= 27522.50;

        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite sua conta: ");
        int contaUsuario= teclado.nextInt();

        System.out.println("Digite sua agencia: ");
        String agenciaUsuario = teclado.next();

        System.out.println("Digite seu nome: ");
        String nomeUsuario = teclado.next();

        System.out.println("olá " + nomeUsuario + " somos da agencia " + agenciaUsuario + " conta " + contaUsuario + " seu saldo é de: " + salarioUsuario) ;

    }
}
