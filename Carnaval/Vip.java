package Carnaval;

public class Vip extends Ingresso {

    private double valor;
    public Vip(double valor, double valorAd) {
        super(valor);
        this.valor=valorAd;
    }

    public void ingressoVip(){
        double valorVip = valor + getValor();
         System.out.printf("O valor do ingresso vip é: %.2f R$ \n", valorVip) ;

    }



}





