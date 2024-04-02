package principal;

import javax.swing.JOptionPane;
import model.Triangulo;
import model.Quadrado;
import model.Circulo;
import model.Retangulo;

public class Principal {

    public static void main(String[] args) {

        String[] options = {"Quadrado", "Triangulo", "Circulo", "Retangulo"};
        int forma = JOptionPane.showOptionDialog(null, "Qual forma voce deseja calcular a area?", "Selecione uma:",
                0, 3, null, options, options[0]);

        //Calcula a area do QUADRADO
        if (forma == 0) {
            Quadrado qua1 = new Quadrado();

            qua1.setLado(Double.parseDouble(JOptionPane.showInputDialog("Qual o lado do quadrado?")));

            JOptionPane.showMessageDialog(null, "A Área do quadrado é "
                    + qua1.getArea());

        }
        //Calcula a area do TRIANGULO
        if (forma == 1) {
            Triangulo tri1 = new Triangulo();

            tri1.setBase(Double.parseDouble(JOptionPane.
                    showInputDialog("Qual a base do triangulo?")));

            tri1.setAltura(Double.parseDouble(JOptionPane.
                    showInputDialog("Qual a altura do triangulo?")));

            JOptionPane.showMessageDialog(null, "A Área do triangulo é "
                    + tri1.getArea());
        }
        //Calcula a area do CIRCULO
        if (forma == 2) {
            Circulo cir1 = new Circulo();

            cir1.setRaio(Double.parseDouble(JOptionPane.
                    showInputDialog("Qual o raio do circulo?")));
            
            JOptionPane.showMessageDialog(null, "A Área do circulo é "
                    + cir1.getArea());
        }
        //Calcula a area do RETANGULO
        if (forma == 3) {
            Retangulo ret1 = new Retangulo();

            ret1.setBase(Double.parseDouble(JOptionPane.
                    showInputDialog("Qual a base do retangulo?")));

            ret1.setAltura(Double.parseDouble(JOptionPane.
                    showInputDialog("Qual a altura do retangulo?")));

            JOptionPane.showMessageDialog(null, "A Área do triangulo é "
                    + ret1.getArea());
        }

    }
}
