public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, int agencia) {
        super(cliente, agencia);
        super.numero = SEQUENCIAL++;
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("SALDO DA CONTA CORRENTE");
        super.imprimirExtrato();
    }
}
