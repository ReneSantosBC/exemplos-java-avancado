import javax.swing.JOptionPane;

/**
 * Aluno
 */
public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public int frequancia;

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String obterStatus() {
        if (frequancia >= 75 && calcularMedia() >= 7) {
            return "Aprovado";
        } else if (frequancia < 75 && calcularMedia() < 7) {
            return "REPROVADAÇO!";
        } else if (frequancia < 75) {
            return "Reprovado por frequancia!";
        } else {
            return "Reprovado por nota";
        }
    }
}