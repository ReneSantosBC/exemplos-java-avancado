import javax.swing.JOptionPane;

public class ProdutoPrincipoal {

    public static void main(String[] args) {

        Produto xbox = new Produto();
        xbox.setNome(" Xbox ");
         xbox.setQuantidade(3);

        JOptionPane.showMessageDialog(null, "Nome" + xbox.getNome() 
        + "\nQuantidade: " + xbox.getQuantidade()
        );

    }
}