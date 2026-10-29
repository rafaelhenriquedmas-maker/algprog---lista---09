import java.util.Scanner;

public class atividade4 {

    public static char verificar(int n) {
        if (n > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = entrada.nextInt();

        System.out.println(verificar(n));

        entrada.close();
    }
}