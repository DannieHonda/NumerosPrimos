import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        EhPrimo primos = new EhPrimo();

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {

            System.out.println("Digite um número para saber se ele é primo: ");
            int numero = Integer.parseInt(reader.readLine());

            if (primos.ehPrimo(numero)) {
                System.out.println(numero + " é um número primo!");
            } else {
                System.out.println(numero + " não é um número primo.");
            }

            System.out.println("Deseja verificar outro número? (S/N): ");
            continuar = reader.readLine();
        }
            System.out.println("Encerrado.");
        }
    }
