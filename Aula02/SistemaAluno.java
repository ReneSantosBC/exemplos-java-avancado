import javax.swing.JOptionPane;

public class SistemaAluno {

    public void adicionar() {
        Aluno aluno = new Aluno();
        aluno.nome = solicitarNome();
        aluno.nota1 = solicitarNota1();
        aluno.nota2 = solicitarNota2();
        aluno.nota3 = solicitarNota3();
        aluno.frequancia = frequanciaAluno();
        double media = aluno.calcularMedia();
        JOptionPane.showMessageDialog(null, "media:" + media);
        String status = aluno.obterStatus();
        JOptionPane.showMessageDialog(null, "Estatus do aluno: " + status);

    }

    public double solicitarNota1() {
        double nota1 = 0;
        boolean valido = false;
        do {
            try {
                nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota").trim());
                if (nota1 >= 0 && nota1 <= 10) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(null, " Nota deve ser de 0 até 10 Cavaclo! ");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digitar numeros e não Letras Calavo!");
            }

        } while (valido == false);
        return nota1;
    }

    public double solicitarNota2() {
        double nota2 = 0;
        boolean valido2 = false;
        do {
            try {
                nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota").trim());
                if (nota2 >= 0 && nota2 <= 10) {
                    valido2 = true;
                } else {
                    JOptionPane.showMessageDialog(null, " Nota deve ser de 0 até 10 Cavalo! ");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digitar numeros e não Letras Calavo!");
            }

        } while (valido2 == false);
        return nota2;
    }

    public double solicitarNota3() {
        double nota3 = 0;
        boolean valido3 = false;
        do {
            try {
                nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota").trim());
                if (nota3 >= 0 && nota3 <= 10) {
                    valido3 = true;
                } else {
                    JOptionPane.showMessageDialog(null, " Nota deve ser de 0 até 10 Cavaclo! ");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digitar numeros e não Letras Calavo!");
            }

        } while (valido3 == false);
        return nota3;
    }

    public String solicitarNome() {
        boolean valido = false;
        String nome = "";
        while (valido == false) {
            nome = JOptionPane.showInputDialog("Digite o nome").trim();
            if (nome.length() >= 3 && nome.length() <= 40) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "nome deve conter no minimo 3 caracteres e no maximo 40");
            }

        }
        return nome;
    }

    public int frequanciaAluno() {
        int frequencia = 0;
        boolean valido = false;
        do {
            try {
                frequencia = Integer
                        .parseInt(JOptionPane.showInputDialog("Digite sua quandidade de frequancia").trim());
                if (frequencia > -1 && frequencia < 101) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Sua Frequancia deve ficar entre 0 e 100 animal!!!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Frequancia deve ser um numero Interiro! KCT!!!");
            }

        } while (valido == false);
        return frequencia;

    }
}
