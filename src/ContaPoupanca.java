public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, int agencia) {
        super(cliente, agencia);
        super.numero = SEQUENCIAL++;
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("SALDO DA CONTA POUPANÇA");
        super.imprimirExtrato();
    }
}
