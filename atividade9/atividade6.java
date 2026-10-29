import java.util.Scanner;

public class atividade6 {

    public static int converter(int hora, char[] periodo) {
        if (hora == 0) {
            periodo[0] = 'A';
            return 12;
        } else if (hora < 12) {
            periodo[0] = 'A';
            return hora;
        } else if (hora == 12) {
            periodo[0] = 'P';
            return 12;
        } else {
            periodo[0] = 'P';
            return hora - 12;
        }
    }

    public static void saida(int hora, int minuto, char periodo) {
        System.out.printf("%d:%02d %s.M.%n",
                hora, minuto, periodo);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite a hora (0 a 23): ");
            int hora = entrada.nextInt();

            System.out.print("Digite os minutos (0 a 59): ");
            int minuto = entrada.nextInt();

            if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59) {
                System.out.println("Horario invalido!");
            } else {
                char[] periodo = new char[1];
                int horaConvertida = converter(hora, periodo);

                saida(horaConvertida, minuto, periodo[0]);
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = entrada.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        entrada.close();
    }
}