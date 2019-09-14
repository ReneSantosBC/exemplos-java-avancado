public class Colaborador {

    private int codigo;
    private String nome;
    private double valorHora;
    private int quantidadeHora;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setQuantidadeHora(int quantidadeHora) {
        this.quantidadeHora = quantidadeHora;
    }

    public int getQuantidadeHora() {
        return quantidadeHora;
    }
}