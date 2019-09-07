import javax.swing.JOptionPane;

public class ExemploTratamentosExcessao {

    public void solicitarIdade() {
        try {

            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

            JOptionPane.showMessageDialog(null, "Idade: " + idade);

        } catch (Exception e) {
            // cai aqui
            JOptionPane.showMessageDialog(null, "idade invalida");

        }
        JOptionPane.showMessageDialog(null, "Oi,Claro,vivo,TIM");

    }

    public double solicitarSalario(){
        boolean informacaoCorreta = false;
        double salario = 0;

        while (informacaoCorreta == false){

            try {
                String salarioTexto = JOptionPane.showInputDialog("Digite salario")
                .replace("R$","").replace(".","").replace(",","").replace(" ","");
                 salario = Double.parseDouble(salarioTexto);
                if (salario > 0){
                informacaoCorreta = true;
                }else{
                    JOptionPane.showMessageDialog(null,"Salario deve ser positivo");
                }

            } catch (Exception e) {
               JOptionPane.showMessageDialog(null, " salario deve conter numeros reais");
            }
        }
        return salario;
    }

    public void menu() {
        //solicitarIdade();
       double salario = solicitarSalario();
    }
}// IDENTAR PROGRAMA = ALT + SHIFT + F