/**
 * 
 */
package packageFormularioSimples;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 */
public class FormularioSimples extends JFrame {
	private JLabel lbNome;
	private JLabel lbDataNascimento;
	private JLabel lbGenero;
	private JLabel lbRg;
	private JLabel lbCpf;
	private JLabel lbEmail;
	private JLabel lbTelefoneResidencial;
	private JLabel lbCelular;
	private JLabel lbEndereco;
	private JLabel lbNumero;
	private JLabel lbCep;
	private JLabel lbCidade;
	private JLabel lbUf;
	
	private JLabel imagemEstatica;
	
	private JTextField tfNome;
	private JTextField tfDataNascimento;
	private JTextField tfGenero;
	private JTextField tfRg;
	private JTextField tfCpf;
	private JTextField tfEmail;
	private JTextField tfTelefoneResidencial;
	private JTextField tfCelular;
	private JTextField tfEndereco;
	private JTextField tfNumero;
	private JTextField tfCep;
	private JTextField tfCidade;
	private JTextField tfUf;
	
	private JButton btnExibirMaiusculas;
	private JButton btnValidarCampos;
	
	boolean validar = false;
	
	public FormularioSimples() {
		
		Color cor = new Color(204, 204, 204);
		
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		setTitle("Formulário de Cadastro Simples");
		setSize(612, 350);
		setLocationRelativeTo(null);
		setLayout(null);
		
		
		lbNome = new JLabel();
		tfNome = new JTextField();
		
		lbDataNascimento = new JLabel();
		tfDataNascimento = new JTextField();
		
		lbGenero = new JLabel();
		tfGenero = new JTextField();
		
		lbRg = new JLabel();
		tfRg = new JTextField();
		
		lbCpf = new JLabel();
		tfCpf = new JTextField();
		
		lbEmail = new JLabel();
		tfEmail = new JTextField();
		
		lbTelefoneResidencial = new JLabel();
		tfTelefoneResidencial = new JTextField();
		
		lbCelular = new JLabel();
		tfCelular = new JTextField();
		
		lbEndereco = new JLabel();
		tfEndereco  = new JTextField();
		
		lbNumero = new JLabel();
		tfNumero = new JTextField();
		
		lbCep = new JLabel();
		tfCep = new JTextField();
		
		lbCidade = new JLabel();
		tfCidade = new JTextField();
		
		lbUf = new JLabel();
		tfUf = new JTextField();
		
		
		lbNome.setText("Nome completo:");
		lbNome.setBounds(20, 15, 150, 25);
		tfNome.setBounds(140, 15, 260, 25);
		add(lbNome);
		add(tfNome);
		
		lbDataNascimento.setText("Data de nascimento:");
		lbDataNascimento.setBounds(20, 45, 185, 25);
		tfDataNascimento.setBounds(175, 45, 80, 25);
		add(lbDataNascimento);
		add(tfDataNascimento);
		
		lbGenero.setText("Gênero:");
		lbGenero.setBounds(260, 45, 75, 25);
		tfGenero.setBounds(320, 45, 80, 25);
		add(lbGenero);
		add(tfGenero);
		
		lbRg.setText("RG:");
		lbRg.setBounds(20, 75, 50, 25);
		tfRg.setBounds(50, 75, 150, 25);
		add(lbRg);
		add(tfRg);
		
		lbCpf.setText("CPF:");
		lbCpf.setBounds(215, 75, 55, 25 );
		tfCpf.setBounds(250, 75, 150, 25);
		add(lbCpf);
		add(tfCpf);
		
		lbEmail.setText("E-mail:");
		lbEmail.setBounds(20, 105, 80, 25);
		tfEmail.setBounds(75, 105, 325, 25);
		add(lbEmail);
		add(tfEmail);
		
		lbTelefoneResidencial.setText("Telefone:");
		lbTelefoneResidencial.setBounds(20, 135, 85, 25);
		tfTelefoneResidencial.setBounds(95, 135, 115, 25);
		add(lbTelefoneResidencial);
		add(tfTelefoneResidencial);
		
		lbCelular.setText("Celular:");
		lbCelular.setBounds(225, 135, 85, 25);
		tfCelular.setBounds(285, 135, 115, 25);
		add(lbCelular);
		add(tfCelular);
		
		lbEndereco.setText("Endereço:");
		lbEndereco.setBounds(20, 165, 90, 25);
		tfEndereco.setBounds(95, 165, 235, 25);
		add(lbEndereco);
		add(tfEndereco);
		
		lbNumero.setText("Nº:");
		lbNumero.setBounds(335, 165, 40, 25);
		tfNumero.setBounds(360, 165, 40, 25);
		add(lbNumero);
		add(tfNumero);
		
		lbCep.setText("CEP:");
		lbCep.setBounds(20, 195, 40, 25);
		tfCep.setBounds(55, 195, 80, 25);
		add(lbCep);
		add(tfCep);
		
		lbUf.setText("UF:");
		lbUf.setBounds(145, 195, 40, 25);
		tfUf.setBounds(175, 195, 50, 25);
		add(lbUf);
		add(tfUf);
		
		lbCidade.setText("Cidade:");
		lbCidade.setBounds(20, 225, 80, 25);
		tfCidade.setBounds(80, 225, 320, 25);
		add(lbCidade);
		add(tfCidade);
		
		
		btnValidarCampos = new JButton();
		btnValidarCampos.setText("Validar campos em branco");
		btnValidarCampos.setBounds(20, 260, 250, 25);
		add(btnValidarCampos);
		
		btnExibirMaiusculas = new JButton();
		btnExibirMaiusculas.setText("Exibir informações em maiúsculo");
		btnExibirMaiusculas.setBounds(280, 260, 280, 25);
		add(btnExibirMaiusculas);
		
		btnValidarCampos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent v) {
				// TODO Auto-generated method stub
				if (tfNome.getText().equals("") || 
						tfDataNascimento.getText().equals("") || 
						tfGenero.getText().equals("") || 
						tfRg.getText().equals("") || 
						tfCpf.getText().equals("") || 
						tfEmail.getText().equals("") || 
						tfTelefoneResidencial.getText().equals("") || 
						tfCelular.getText().equals("") || 
						tfEndereco.getText().equals("") || 
						tfNumero.getText().equals("") || 
						tfCep.getText().equals("") || 
						tfUf.getText().equals("") || 
						tfCidade.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Há campos em branco");
					
				} else {
					validar = true;
					JOptionPane.showMessageDialog(null, "Campos validados!");
				}
			}
		});
		
		btnExibirMaiusculas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (validar == true) {
					String nome = tfNome.getText().toUpperCase();
					String dataNascimento = tfDataNascimento.getText().toUpperCase();
					String genero = tfGenero.getText().toUpperCase();
					String rg = tfRg.getText().toUpperCase();
					String cpf = tfCpf.getText().toUpperCase();
					String email = tfEmail.getText().toUpperCase();
					String telefone = tfTelefoneResidencial.getText().toUpperCase();
					String celular = tfCelular.getText().toUpperCase();
					String endereco = tfEndereco.getText().toUpperCase();
					String numero = tfNumero.getText().toUpperCase();
					String cep = tfCep.getText().toUpperCase();
					String uf = tfUf.getText().toUpperCase();
					String cidade = tfCidade.getText().toUpperCase();
					
					String mensagem = "Nome: " + nome + "\n" + 
					"Data de nascimento: " + dataNascimento + "\n" + 
					"Gênero:" + genero + "\n" + 
					"RG: " + rg + "\n" + 
					"CPF: " + cpf + "\n" + 
					"E-mail: " + email + "\n" + 
					"Telefone: " + telefone + "\n" + 
					"Celular: " + celular + "\n" + 
					"Endereço: " + endereco + "\n" + 
					"Número: " +  numero + "\n" + 
					"CEP: " + cep + "\n" + 
					"UF: " + uf + "\n" + 
					"Cidade: " + cidade + "\n";
					
					JOptionPane.showMessageDialog(null, mensagem, "Informacoes em Maiusculas", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Você precisa validar as informações");
				}
				
			}
		});
		
		imagemEstatica = new JLabel();
		ImageIcon icon = new ImageIcon("../prjFormulario/src/packageFormularioSimples/pessoa.png");
		Image fundoImagem = icon.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
		ImageIcon imagemRedimensionada = new ImageIcon(fundoImagem);
		imagemEstatica.setIcon(imagemRedimensionada);
		imagemEstatica.setBorder(BorderFactory.createLineBorder(cor, 1));
		imagemEstatica.setBounds(450, 15, 120, 120);
		add(imagemEstatica);
		
		
		
		setVisible(true);
	}
	
}
