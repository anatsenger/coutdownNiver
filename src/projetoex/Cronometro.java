package projetoex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Cronometro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inicie o cronometro com a letra A: ");
        char letra = sc.next().charAt(0);
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");


        LocalDateTime inicio = null;
        LocalDateTime finall;

        if(letra == 'A') {
            inicio = LocalDateTime.now();
            System.out.println(inicio.format(formatoData));
            System.out.print("Finalize o cronometro com a letra B: ");
            letra = sc.next().charAt(0);
        }

        if (letra == 'B') {
            finall = LocalDateTime.now();
            System.out.println(finall.format(formatoData));
            System.out.println(ChronoUnit.SECONDS.between(inicio, finall));
        }
    }

}
