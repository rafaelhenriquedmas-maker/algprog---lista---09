import java.util.Scanner;

public class atividade5 {

    public static double somaImposto(double taxaImposto, double custo) {
        custo = custo + (custo * taxaImposto / 100);
        return custo;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a taxa de imposto (%): ");
        double taxaImposto = entrada.nextDouble();

        System.out.print("Digite o custo do item: ");
        double custo = entrada.nextDouble();

        custo = somaImposto(taxaImposto, custo);

        System.out.printf("Custo com imposto: R$ %.2f%n", custo);

        entrada.close();
    }
}