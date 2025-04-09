/*Programa que adivinha número*/

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("======================================");

        // Aleatórios de 0 até 9
        int numeroAleatorio = random.nextInt(10);
        boolean tentarNovamente = true;

        System.out.println("Aperte CTRL+C, a qualquer momento, para parar");

        // Enquanto tentarNovamente for verdadeiro, continua tentando
        while (tentarNovamente) {
            System.out.print("Tente adivinhar o número: ");
            int numero = scanner.nextInt();

            if (numero == numeroAleatorio) {
                System.out.println("Parabéns! Você adivinhou. Era o número " + numeroAleatorio + " mesmo.");
                tentarNovamente = false;
            } else {
                System.out.println("ERRADO! Tente novamente.");
            }
        }

        System.out.println("FIM!");
        System.out.println("==================================================================");

        scanner.close();
    }
}
