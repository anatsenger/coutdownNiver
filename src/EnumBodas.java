import java.util.Arrays;

public enum EnumBodas {
    Papel(1,"Bodas de Papel"),
    Madeira_ou_Ferro(5, "Bodas de Madeira ou Ferro"),
    Estanho(10, "Bodas de Estanho"),
    Cristal(15, "Bodas de Cristal"),
    Perola(30, "Bodas de Pérola"),
    Esmeralda(40, "Bodas de Esmeralda"),
    Ouro(50, "Bodas de Ouro");

    int numero;
    String bodas;

    EnumBodas(int numero, String bodas) {
        this.numero = numero;
        this.bodas = bodas;
    }

    public static EnumBodas getByNumero(int anos){
        return Arrays.stream(values()).filter(bodas->bodas.numero==anos).findFirst().orElse(null);
    }
}
