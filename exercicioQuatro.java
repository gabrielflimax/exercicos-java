import java.util.Locale;
import java.util.Scanner;

public class exercicioQuatro {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhada;
        double valorHora, salario;

        numeroFuncionario = sc.nextInt();
        horasTrabalhada = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = valorHora * horasTrabalhada;
        System.out.printf("NUMBER = %d%n", numeroFuncionario);
        System.out.printf("SALARY = %.2f", salario);

        sc.close();
    }
}
