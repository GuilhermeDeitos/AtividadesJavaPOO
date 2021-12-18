public class ContaCorrente extends ContaBancaria {
    private double limite;

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > this.saldo + this.limite) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }
        
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso");

    }
    
}
