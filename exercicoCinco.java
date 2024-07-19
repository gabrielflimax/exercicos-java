import java.util.Locale;
import java.util.Scanner;

public class exercicoCinco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoUm, numeroPecaUm, codigoDois, numeroPecaDois;
        double valorUnitarioUm, valorUnitarioDois, valorPagar;

        codigoUm = sc.nextInt();
        numeroPecaUm = sc.nextInt();
        valorUnitarioUm = sc.nextDouble();
        codigoDois = sc.nextInt();
        numeroPecaDois = sc.nextInt();
        valorUnitarioDois = sc.nextDouble();

        valorPagar = (numeroPecaUm * valorUnitarioUm) + (numeroPecaDois * valorUnitarioDois);

        System.out.printf("VALOR A SER PAGO: R$ %.2f", valorPagar);

        sc.close();

    }
}
