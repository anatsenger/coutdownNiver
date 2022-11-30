package DesafioBodas;

import java.util.Arrays;

public enum EnumBodas {
    Papel(1,"DesafioBodas.Bodas de Papel"),
    Madeira_ou_Ferro(5, "DesafioBodas.Bodas de Madeira ou Ferro"),
    Estanho(10, "DesafioBodas.Bodas de Estanho"),
    Cristal(15, "DesafioBodas.Bodas de Cristal"),
    Perola(30, "DesafioBodas.Bodas de Pérola"),
    Esmeralda(40, "DesafioBodas.Bodas de Esmeralda"),
    Ouro(50, "DesafioBodas.Bodas de Ouro");

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
