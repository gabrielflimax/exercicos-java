import java.util.Locale;
import java.util.Scanner;

public class exercicioUm {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroUm = sc.nextInt();
        int numeroDois = sc.nextInt();

        int resultado = numeroUm + numeroDois;
        System.out.println("Soma = " + resultado);

        sc.close();
    }
}
