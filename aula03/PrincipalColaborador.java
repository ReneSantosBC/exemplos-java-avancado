import javax.swing.JOptionPane;

public class PrincipalColaborador {

    public static void main(String[] args) {

        Colaborador colaborador = new Colaborador();
        colaborador.setCodigo ( 1);

        colaborador.setNome("Giudéziu");

        colaborador.setValorHora (100);

        colaborador.setQuantidadeHora (300);

        JOptionPane.showMessageDialog(null,
                "Codigo:  " + colaborador.getCodigo() + "\n\n Nome: " + colaborador.getNome() + "\n valor por hora: "
                        + colaborador.getValorHora() + "\n quantidade de horas: " + colaborador.getQuantidadeHora());

    }

}