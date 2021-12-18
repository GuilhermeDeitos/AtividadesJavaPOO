public class ContaPoupanca extends ContaBancaria {
    private double taxaDeOperacao;

    public void setTaxa(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }
    @Override
    public void sacar(double valor) {
        if(valor > this.saldo){
            System.out.println("Saldo insuficiente");
        }else{
            this.saldo = this.saldo - (valor + taxaDeOperacao);
            System.out.println("Saque realizado com sucesso");

        }
        
    }

    @Override
    public void depositar(double valor) {
        this.saldo = (this.saldo + valor) - taxaDeOperacao;
        System.out.println("Deposito realizado com sucesso");
    
    }
    
}
