public class CaixaEletronico {
    
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 10.0;

       if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("O seu novo saldo é: " + saldo);
       }
       else 
            System.out.println("Saldo insuficiente");

    }
}
