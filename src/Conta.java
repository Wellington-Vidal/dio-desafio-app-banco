public class Conta {
    
    public static int SEQUENCIAL = 10000;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente, int agencia) {
        this.cliente = cliente;
        this.agencia = agencia;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        this.agencia = agencia;
    }

    public int getNumero(){
        return this.numero;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public void creditar(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean debitar(double valor){
        boolean debitado = false;

        if (this.getSaldo() >= valor){
            this.saldo = this.saldo - valor;
            debitado = true;
        }

        return debitado;
    }

    public void transferir(double valor, Conta contaDestino){
        boolean debitado = debitar(valor);
        if (debitado){
            contaDestino.creditar(valor);
        }
    }

    protected void imprimirExtrato(){
        System.out.println(String.format("Agência / Conta: %d / %d",  this.getAgencia(), this.getNumero()));
        System.out.println(String.format("Cliente: %s | %s",  this.getCliente().getCpf(), this.getCliente().getNome()));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
        System.out.println("");
    }
}
