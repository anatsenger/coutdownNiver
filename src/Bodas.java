import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Bodas {
    public static void main(String[] args) {
        LocalDate casamentoRomeu = LocalDate.of(2012, 01, 18);
        LocalDate hoje = LocalDate.now();
        long anos = ChronoUnit.YEARS.between(casamentoRomeu, hoje);
        System.out.println(getBodas(anos));
        System.out.println(getBodasEnum((int) anos));

    }

    public static String getBodasEnum(int anos){
        EnumBodas bodas = EnumBodas.getByNumero(anos);
        if(Objects.isNull(bodas)){
            return "Não é ano de bodas, mas continue firme";
        }else {
            return bodas.bodas;
        }
    }
    public static String getBodas(long anos){
        switch ((int) anos){
            case 1:  return "Bodas de Papel";
            case 5: return "Bodas de Madeira ou Ferro";
            case 10: return "Bodas de Estanho";
            case 15: return "Bodas de Cristal";
            case 30: return "Bodas de Pérola";
            case 40: return "Bodas de Esmeralda";
            case 50: return "Bodas de Ouro";
            default: return "Não é ano de bodas, mas continue firme";
        }
    }
}
