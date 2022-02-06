public class App {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco("Banco Pernambucano");
        int[] agencias = banco.getAgencias();
        
        try{
            Cliente cliente1 = new Cliente("Wellington", "111.222.333.44");
            banco.contas.add(new ContaCorrente(cliente1, agencias[0])); //Conta 0
            banco.contas.add(new ContaPoupanca(cliente1, agencias[0])); //Conta 1
    
            Cliente cliente2 = new Cliente("Klerys", "555.666.777.88");
            banco.contas.add(new ContaCorrente(cliente2, agencias[1])); //Conta 2
            banco.contas.add(new ContaPoupanca(cliente2, agencias[1])); //Conta 3

            banco.contas.get(0).creditar(1500); //Depositado na conta corrente (Cliente 1).
            banco.contas.get(2).creditar(3000); //Depositado na conta corrente (Cliente 2).

            banco.contas.get(0).transferir(500, banco.contas.get(1)); //De Conta Corrente para Conta Poupança (mesmo cliente)
            banco.contas.get(2).transferir(500, banco.contas.get(3)); //De Conta Corrente para Conta Poupança (mesmo cliente)
        }
        catch(Exception ex){
            System.out.println("Erro!!!");
        }

        for (Conta conta : banco.contas){
            conta.imprimirExtrato();
        }
    }
}
