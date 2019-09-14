import javax.swing.JOptionPane;

public class AlunoSistema {
    public void adicionar() {
        Aluno aluno = new Aluno();

        boolean valido = false;
        do {
            try {
                aluno.setNome(JOptionPane.showInputDialog("Digite o Nome: "));
                valido = true;
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "AVISO", JOptionPane.ERROR_MESSAGE);
            }
        } while (valido == false);
        valido = false;
        do {
            try {
                aluno.setSobrenome(JOptionPane.showInputDialog("Digite o Sobre Nome: "));
                valido = true;
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "AVISO", JOptionPane.ERROR_MESSAGE);
            }
        } while (valido == false);
        valido = false;
        do {
            try {
                aluno.setNota(Double.parseDouble(JOptionPane.showInputDialog("digite a nota")));
                valido = true;
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Aviso", JOptionPane.ERROR_MESSAGE);
            }

        } while (valido == false);
    }

}