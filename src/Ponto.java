
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Ponto {
    public static void main(String[] args) {

        String[] horarios = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com seus horarios de entrada e saida do dia: ");
        String horariosString = sc.nextLine();
        horarios = horariosString.split("\\||\\s");


        long jornadaManha = ChronoUnit.MINUTES.between(LocalTime.parse(horarios[0]), LocalTime.parse(horarios[1]));
        long jornadaTarde = ChronoUnit.MINUTES.between(LocalTime.parse(horarios[4]), LocalTime.parse(horarios[5]));
        long jornadaTotal = jornadaManha + jornadaTarde;

        System.out.println(jornadaTotal);

        if(jornadaTotal >= 475 && jornadaTotal <= 485){
            System.out.println("Não abusou");
        }else {
           System.out.println("Abusou");
        }
    }
}
