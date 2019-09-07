import javax.swing.JOptionPane;

/**
 * ExemoploString02
 */
public class ExemoploString02 {

    public static void main(String[] args) {
                        //      123456789
        String nomeCompleto  = "francisco Lucas Sens";

        String nome = nomeCompleto.substring (0,9);
        String sobrenome1 = nomeCompleto.substring (10,15);
        String sobrenome2 = nomeCompleto.substring(16,20);
        String sobrenome = nomeCompleto.substring(10);
        JOptionPane.showMessageDialog(null, sobrenome);

            //         123456789
        String data = "01/02/1999";
        String diaTexto = data.substring(0,2);
        String mesTexto = data.substring(3,5);
        String anoTexto = data.substring(6,10);
        JOptionPane.showMessageDialog(null, anoTexto);

    }
}