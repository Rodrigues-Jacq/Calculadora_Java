/* Nome: Calculadora em Java
 * Objetivo: Realizar as quatro operações básicas da matemática utilizando interface gráfica
 * Criado por: Jacqueline Rodrigues
 * Criado em: 30/08/2021 */

package lab03;

// importações para construção
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	
	public JPanel jp1 = new JPanel();  //painel
	public JTextField jtf1 = new JTextField(); //caixa de texto
	
	//botões de 0 - 9
	public JButton jb0 = new JButton("0");
	public JButton jb1 = new JButton("1");
	public JButton jb2 = new JButton("2");
	public JButton jb3 = new JButton("3");
	public JButton jb4 = new JButton("4");
	public JButton jb5 = new JButton("5");
	public JButton jb6 = new JButton("6");
	public JButton jb7 = new JButton("7");
	public JButton jb8 = new JButton("8");
	public JButton jb9 = new JButton("9");
	
	public JButton jc = new JButton("C");  // botão para apagar
	public JButton jMa = new JButton("+"); // botão para realizar a soma
	public JButton jMe = new JButton("-"); // botão para realizar a subtração
	public JButton jVe = new JButton("*"); // botão para realizar a multiplicação
	public JButton jDi = new JButton("/"); // botão para realizar a divisão
	public JButton jPo = new JButton("."); // botão para adicionar ponto flutuantes
	public JButton jIg = new JButton("="); // botão para trazer o resultado
	
	// variáveis para realizar qualquer cálculo
	private double valor1, valor2;
	
	// variável para verificar o sinal utilizado pelo usuário
	private String sinal;
	
	
	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();  // criação do objeto
	}
	
	public Calculadora() {
		this.montarTela(); // adicionando o montar tela a calculadora
	}
	
	public void montarTela() {   // montagem da tela da calculadora, botões e lógica
		// Título da tela
		this.setTitle("Calculadora");
		
		// Tamanho da tela
		this.setBounds(100, 100, 300, 400);
		
		// Layout do painel, do campo texto e do botão igual
		this.add(jtf1, BorderLayout.NORTH);
		this.add(jIg, BorderLayout.SOUTH);
		this.add(jp1, BorderLayout.CENTER);
		
		// Layout dos componentes do painel
		jp1.setLayout(new GridLayout(4,4));
		
		// "Ligando" os botões
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jc);
		jp1.add(jb4);
		jp1.add(jb5);
		jp1.add(jb6);
		jp1.add(jMa);
		jp1.add(jb7);
		jp1.add(jb8);
		jp1.add(jb9);
		jp1.add(jMe);
		jp1.add(jb0);
		jp1.add(jPo);
		jp1.add(jVe);
		jp1.add(jDi);
		
		// Adicionando o que cada botão precisa realizar
		jb0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf1.setText(jtf1.getText()+"0");  // adicionando o valor indicado na tela quantas vezes o usuário quiser
			}
			
		});
		
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf1.setText(jtf1.getText()+"1"); // adicionando o valor indicado na tela quantas vezes o usuário quiser
			}
			
		});
		
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf1.setText(jtf1.getText()+"2"); // adicionando o valor indicado na tela quantas vezes o usuário quiser
			}
			
		});
		
		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf1.setText(jtf1.getText()+"3"); // adicionando o valor indicado na tela quantas vezes o usuário quiser
			}
			
		});
		
		jb4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf1.setText(jtf1.getText()+"4"); // adicionando o valor indicado na tela quantas vezes o usuário quiser
			}
			
		});
		
		jb5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf1.setText(jtf1.getText()+"5"); // adicionando o valor indicado na tela quantas vezes o usuário quiser
			}
			
		});
		
		jb6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf1.setText(jtf1.getText()+"6"); // adicionando o valor indicado na tela quantas vezes o usuário quiser
			}
			
		});
		
		jb7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf1.setText(jtf1.getText()+"7"); // adicionando o valor indicado na tela quantas vezes o usuário quiser
			}
			
		});
		
		jb8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf1.setText(jtf1.getText()+"8"); // adicionando o valor indicado na tela quantas vezes o usuário quiser
			}
			
		});
		
		jb9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf1.setText(jtf1.getText()+"9"); // adicionando o valor indicado na tela quantas vezes o usuário quiser
			}
			
		});
		
		jc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf1.setText(" "); // apaga os valores que se encontram na tela
			}
			
		});
		
		jMa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(jtf1.getText()); // pegando valor informado pelo usuário e convertendo de String para Double
				jtf1.setText(""); // limpa os dados da tela para ser adicionado os próximos valores
				sinal = "soma"; // adicionado a informação do botão no qual foi clicado
				
			}
			
		});
		
		jMe.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(jtf1.getText()); // pegando valor informado pelo usuário e convertendo de String para Double
				jtf1.setText(""); // limpa os dados da tela para ser adicionado os próximos valores
				sinal = "menos"; // adicionado a informação do botão no qual foi clicado
				
			}
			
		});
		
		jVe.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(jtf1.getText()); // pegando valor informado pelo usuário e convertendo de String para Double
				jtf1.setText(""); // limpa os dados da tela para ser adicionado os próximos valores
				sinal = "vezes"; // adicionado a informação do botão no qual foi clicado
				
			}
			
		});
		
		jDi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(jtf1.getText()); // pegando valor informado pelo usuário e convertendo de String para Double
				jtf1.setText(""); // limpa os dados da tela para ser adicionado os próximos valores
				sinal = "divisão"; // adicionado a informação do botão no qual foi clicado
			}
			
		});
		
		jPo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf1.setText(jtf1.getText()+"."); // adicionando o valor como ponto flutuante
				
			}
			
		});
		
		// Lógica para o cálculo a partor do momento que o usuário clicar no botão de igual
		jIg.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(jtf1.getText());
				
				// soma
				if (sinal == "soma") {
					jtf1.setText(String.valueOf(valor1 + valor2));
				}
				
				// subtração
				if (sinal == "menos") {
					jtf1.setText(String.valueOf(valor1 - valor2));
				}
				
				// multiplicação
				if (sinal == "vezes") {
					jtf1.setText(String.valueOf(valor1 * valor2));
				}
				
				// divisão
				if (sinal == "divisão") {
					jtf1.setText(String.valueOf(valor1 / valor2));
				}
			}
			
		});
		
		// mostra todos os componentes e lógica na tela
		this.setVisible(true); // deixando visível
	}
}
