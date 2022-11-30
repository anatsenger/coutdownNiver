package DesafioBodas;

import DesafioBodas.EnumBodas;

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
            case 1:  return "DesafioBodas.Bodas de Papel";
            case 5: return "DesafioBodas.Bodas de Madeira ou Ferro";
            case 10: return "DesafioBodas.Bodas de Estanho";
            case 15: return "DesafioBodas.Bodas de Cristal";
            case 30: return "DesafioBodas.Bodas de Pérola";
            case 40: return "DesafioBodas.Bodas de Esmeralda";
            case 50: return "DesafioBodas.Bodas de Ouro";
            default: return "Não é ano de bodas, mas continue firme";
        }
    }
}
