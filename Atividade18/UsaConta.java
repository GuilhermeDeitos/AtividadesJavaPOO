public class UsaConta{

    public static void main(String[] args){
        ContaPoupanca conta1 = new ContaPoupanca();

        conta1.setContaBancaria(1,450.50);
        conta1.setTaxa(10);
        conta1.getContaBancaria();
        conta1.sacar(100);
        conta1.getContaBancaria();
        conta1.depositar(100);
        conta1.getContaBancaria();
        conta1.sacar(1000);
        conta1.getContaBancaria();


        ContaCorrente conta2 = new ContaCorrente();
        conta2.setContaBancaria(2,200.00);
        conta2.getContaBancaria();
        conta2.setLimite(100);
        conta2.sacar(200);
        conta2.getContaBancaria();
        conta2.depositar(50);
        conta2.getContaBancaria();
        conta2.sacar(1000);
        conta2.getContaBancaria();




    }

}