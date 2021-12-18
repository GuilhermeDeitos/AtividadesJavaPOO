public abstract class ContaBancaria {
    public int numero;
    public double saldo;

    public void setContaBancaria(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void getContaBancaria() {
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
    }




    public abstract void sacar(double valor);
    public abstract void depositar(double valor);

}
