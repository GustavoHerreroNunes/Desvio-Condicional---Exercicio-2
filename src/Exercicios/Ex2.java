package Exercicios;

import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Vamos descobri se seu valor pertence ao conjunto 1,99 <= X <=  5,99");
		float N = Float.parseFloat(JOptionPane.showInputDialog("Insira um valor"));
		if (N>= 1.99 && N<=5.99)JOptionPane.showMessageDialog(null, "Seu número esta nesse conjunto... :-D");
		else JOptionPane.showMessageDialog(null, "Seu número não pertence ao conjunto em questão");
	}

}
