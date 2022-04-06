package Carnaval;

public class Normal extends Ingresso {


    public Normal(double valor) {
        super(valor);
    }
     public void ingressoNormal(){
        System.out.printf("O valor do do ingreso normal é %.2f R$ \n" , getValor());
     }
}







