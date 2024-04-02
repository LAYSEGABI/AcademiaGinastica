package principal;

import javax.swing.JOptionPane;
import model.Aluno;

public class Principal {

    public static void main(String[] args) {

        Aluno alu1 = new Aluno();

        alu1.setNome(JOptionPane.showInputDialog("Qual nome do aluno?"));
        alu1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Quantos anos ele possui?")));
        alu1.setCurso(JOptionPane.showInputDialog("Qual curso?"));
        alu1.setId(Integer.parseInt(JOptionPane.showInputDialog("Qual ID dele?")));

        JOptionPane.showMessageDialog(null, "Nome: " + alu1.getNome() +  "\nIdade: " + alu1.getIdade()
        + "\nCurso: " + alu1.getCurso() + "\nId: " + alu1.getId() );

    }
}
