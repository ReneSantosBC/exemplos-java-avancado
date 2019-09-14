public class Produto {

    private String nome;
    private int quantidade;


//set ===>>> DEFINIR
    public void setNome(String nome) {
        this.nome = nome;
    }

// get -> Obter
    public String getNome() {
        return nome;
    }

    public void setQuantida(int quantidade){
        this.quantidade = quantidade;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
}