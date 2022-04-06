package Carnaval;

import java.io.PrintStream;

public class Camarote extends Ingresso {

    private double valor;
    private String setor;

    public Camarote(double valor, double valorAd, String local) {
        super(valor);
        this.valor = valorAd;
        this.setor=setor;
    }
    public void ingressoCamarote (){
      double valorCamarote = valor + getValor();
      System.out.printf("O setor do camarote e o valor do ingresso é: %.2f R$ \n", setor, valorCamarote);
    }
}
