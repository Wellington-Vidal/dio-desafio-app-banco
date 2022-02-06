import java.util.ArrayList;

public class Banco {
    
    private String nome;
    private int[] agencias = {1010, 1011, 1012, 1013, 1014};
    ArrayList<Conta> contas = new ArrayList<>();

    public Banco(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int[] getAgencias(){
        return this.agencias;
    }
}
