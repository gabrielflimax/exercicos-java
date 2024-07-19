import java.util.Locale;
import java.util.Scanner;

public class exercicioDois {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double calculaArea = Math.PI * Math.pow(raio, 2);

        System.out.printf("A= %.4f", calculaArea);

        sc.close();
    }
}
