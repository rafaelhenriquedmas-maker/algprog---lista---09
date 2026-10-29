import java.util.Scanner;

public class atividade3 {


    public static int soma(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int a = entrada.nextInt();

        System.out.print("Digite o segundo numero: ");
        int b = entrada.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int c = entrada.nextInt();

        System.out.println("Soma: " + soma(a, b, c));

        entrada.close();
    }
}