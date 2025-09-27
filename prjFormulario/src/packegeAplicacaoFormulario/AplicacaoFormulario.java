package packegeAplicacaoFormulario;

import packageFormularioRobusto.FormularioRobusto;
import packageFormularioSimples.FormularioSimples;
import packageFormularioSimples.MainFormularioSimples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class AplicacaoFormulario extends JFrame {
	public AplicacaoFormulario() {
		this.setSize(800, 600);
		this.setTitle("Aplicação dos Formulários");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		JMenu arquivo = new JMenu("Arquivo");
		JMenu programas = new JMenu("Programas");
		JMenu ajuda = new JMenu("Ajuda");
		
		JMenuItem sair = new JMenuItem("Sair");
		JMenuItem formularioA = new JMenuItem("Formulário de Cadastro Simples");
		JMenuItem formularioB = new JMenuItem("Formulário de Cadastro de Aluno");
		JMenuItem sobre = new JMenuItem("Sobre");
		
		arquivo.add(sair);
		programas.add(formularioA);
		programas.add(formularioB);
		ajuda.add(sobre);
		
		JMenuBar barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		barraMenu.add(arquivo);
		barraMenu.add(programas);
		barraMenu.add(ajuda);
		
		sair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		sobre.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent q) {
				// TODO Auto-generated method stub
				String devs = "Equipe de desenvolvedores\n\n❖ Marley de Sousa Santos\nmarleysantos439@gmail.com\n@marleysantos4390\n"
						+ "\n❖ Renan de Castro Teixeira\ncastroteixeira@gmail.com\n@renan.teixx"
						+ "\n\nMuito obrigado por usar nossa aplicação de formulários!"
						+ "\nAgora, que tal um MB?";
				
				int choice = JOptionPane.showConfirmDialog(null, devs, "Sobre o Programa", JOptionPane.YES_NO_CANCEL_OPTION);
				
				if (choice == JOptionPane.YES_OPTION) {
		            JOptionPane.showMessageDialog(null, "Muito obrigado!");
		        } else if (choice == JOptionPane.NO_OPTION) {
		            JOptionPane.showMessageDialog(null, "Poxa!, Porquê?");
		        } else if (choice == JOptionPane.CANCEL_OPTION) {
		            JOptionPane.showMessageDialog(null, "Você escolheu cancelar...");
		        }
			}
		});
		
		formularioA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent p) {
				// TODO Auto-generated method stub
				MainFormularioSimples formularioSimples = new MainFormularioSimples();
			}
		});
		
		formularioB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent s) {
				// TODO Auto-generated method stub
				FormularioRobusto formularioRobusto = new FormularioRobusto();
			}
		});
		
		this.setVisible(true);
	}
}
