import java.lang.Thread;
import java.util.Arrays;

public class Desafio {
    public static void main(String[] args) throws InterruptedException{
        String comeco = "                            ";
        String[] carregando2 = comeco.split("");
        for (int i = 0; i < carregando2.length; i++){
            Thread.sleep(100);
                carregando2[i] = carregando2[i].replace(" ", "=");
            System.out.printf("\r"+Arrays.toString(carregando2).replace(", ", ""));
        }
    }
}
