
import java.lang.Thread;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Coutdown {
    public static void main(String[] args) throws InterruptedException {
        LocalDateTime dataHoje = LocalDateTime.now();
        LocalDateTime aniver = LocalDateTime.of(2023, 01, 8, 00, 00, 00);
        System.out.println("Faltam " + ChronoUnit.HOURS.between(dataHoje, aniver) + " horas para o seu niver");
        while (ChronoUnit.MINUTES.between(dataHoje, aniver) > 0){
                dataHoje = LocalDateTime.now();
                Thread.sleep(1000*60);
                System.out.println("Faltam " + ChronoUnit.MINUTES.between(dataHoje, aniver) + " minutos para o seu aniver");
            }
        }
    }

