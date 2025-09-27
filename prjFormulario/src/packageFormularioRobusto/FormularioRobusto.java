/**
 * 
 */
package packageFormularioRobusto;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 * 
 */
public class FormularioRobusto extends JFrame {
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
	private JLabel lbCurso;
	private JLabel lbTurma;
	private JLabel lbCorPreferida;
	private JLabel lbModulo;
	
	private JTextField tfNome;
	private JTextField tfDataNascimento;
	private JTextField tfRg;
	private JTextField tfCpf;
	private JTextField tfEmail;
	private JTextField tfTelefoneResidencial;
	private JTextField tfCelular;
	private JTextField tfEndereco;
	private JTextField tfNumero;
	private JTextField tfCep;
	private JTextField tfCidade;
	
	private JComboBox<String> cbGenero;
	private JComboBox<String> cbUf;
	private JComboBox<String> cbCurso;
	
	private JCheckBox cbxCorPreferida1;
	private JCheckBox cbxCorPreferida2;
	private JCheckBox cbxCorPreferida3;
	private JCheckBox cbxCorPreferida4;
	
	private JRadioButton rbModulo1;
	private JRadioButton rbModulo2;
	private JRadioButton rbModulo3;
	
	private JButton btnEscolherImagem;
	
	private boolean validar = false;
	
	public FormularioRobusto() {
		
		Color cor = new Color(204, 204, 204);
		
		this.setResizable(false);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		
		setTitle("Formulário de Cadastro de Aluno");
		setSize(612, 500);
		setLocationRelativeTo(null);
		setLayout(null);
		
		lbNome = new JLabel();
		tfNome = new JTextField();
		
		lbDataNascimento = new JLabel();
		tfDataNascimento = new JTextField(10);
		
		lbGenero = new JLabel();
		cbGenero = new JComboBox<String>();
		
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
		tfEndereco = new JTextField();
		
		lbNumero = new JLabel();
		tfNumero = new JTextField(4);
		
		lbCep = new JLabel();
		tfCep = new JTextField(9);
		
		lbUf = new JLabel();
		cbUf = new JComboBox<String>();
		
		lbCidade = new JLabel();
		tfCidade = new JTextField();
		
		lbCurso = new JLabel();
		cbCurso = new JComboBox<String>();
		
		lbTurma = new JLabel();
		
		lbCorPreferida = new JLabel();
		cbxCorPreferida1 = new JCheckBox();
		cbxCorPreferida2 = new JCheckBox();
		cbxCorPreferida3 = new JCheckBox();
		cbxCorPreferida4 = new JCheckBox();
		
		lbModulo = new JLabel();
		rbModulo1 = new JRadioButton();
		rbModulo2 = new JRadioButton();
		rbModulo3 = new JRadioButton();

		
		lbNome.setText("Nome:");
		lbNome.setBounds(20, 15, 80, 25);
		tfNome.setBounds(70, 15, 350, 25);
		add(lbNome);
		add(tfNome);
		
		lbDataNascimento.setText("Data de nascimento:");
		lbDataNascimento.setBounds(20, 45, 185, 25);
		tfDataNascimento.setBounds(175, 45, 80, 25);
		add(lbDataNascimento);
		add(tfDataNascimento);
		
		lbGenero.setText("Gênero:");
		lbGenero.setBounds(260, 45, 75, 25);
		cbGenero.setBounds(320, 45, 100, 25);
		cbGenero.addItem("-");
		cbGenero.addItem("Masculino");
		cbGenero.addItem("Feminino");
		add(lbGenero);
		add(cbGenero);
		
		lbRg.setText("RG:");
		lbRg.setBounds(20, 75, 50, 25);
		tfRg.setBounds(50, 75, 150, 25);
		add(lbRg);
		add(tfRg);
		
		lbCpf.setText("CPF:");
		lbCpf.setBounds(215, 75, 55, 25 );
		tfCpf.setBounds(250, 75, 170, 25);
		add(lbCpf);
		add(tfCpf);
		
		lbEmail.setText("E-mail:");
		lbEmail.setBounds(20, 105, 80, 25);
		tfEmail.setBounds(75, 105, 345, 25);
		add(lbEmail);
		add(tfEmail);
		
		lbTelefoneResidencial.setText("Telefone:");
		lbTelefoneResidencial.setBounds(20, 135, 85, 25);
		tfTelefoneResidencial.setBounds(95, 135, 125, 25);
		add(lbTelefoneResidencial);
		add(tfTelefoneResidencial);
		
		lbCelular.setText("Celular:");
		lbCelular.setBounds(225, 135, 85, 25);
		tfCelular.setBounds(285, 135, 135, 25);
		add(lbCelular);
		add(tfCelular);
		
		lbEndereco.setText("Endereço:");
		lbEndereco.setBounds(20, 165, 90, 25);
		tfEndereco.setBounds(95, 165, 255, 25);
		add(lbEndereco);
		add(tfEndereco);
		
		lbNumero.setText("Nº:");
		lbNumero.setBounds(355, 165, 40, 25);
		tfNumero.setBounds(380, 165, 40, 25);
		add(lbNumero);
		add(tfNumero);
		
		lbCep.setText("CEP:");
		lbCep.setBounds(20, 195, 40, 25);
		tfCep.setBounds(55, 195, 80, 25);
		add(lbCep);
		add(tfCep);
		
		String[] UF = {
				"Acre (AC)", "Alagoas (AL)", "Amapá (AP)", 
				"Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", 
				"Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)",
				"Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", 
				"Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", 
				"Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)",
				"Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul",
				"Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)",
				"São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)"
			};
		
		lbUf.setText("UF:");
		lbUf.setBounds(145, 195, 40, 25);
		cbUf.setBounds(175, 195, 245, 25);
		cbUf.addItem("-");
		cbUf.addItem(UF[0]);
		cbUf.addItem(UF[1]);
		cbUf.addItem(UF[2]);
		cbUf.addItem(UF[3]);
		cbUf.addItem(UF[4]);
		cbUf.addItem(UF[5]);
		cbUf.addItem(UF[6]);
		cbUf.addItem(UF[7]);
		cbUf.addItem(UF[8]);
		cbUf.addItem(UF[9]);
		cbUf.addItem(UF[10]);
		cbUf.addItem(UF[11]);
		cbUf.addItem(UF[12]);
		cbUf.addItem(UF[13]);
		cbUf.addItem(UF[14]);
		cbUf.addItem(UF[15]);
		cbUf.addItem(UF[16]);
		cbUf.addItem(UF[17]);
		cbUf.addItem(UF[18]);
		cbUf.addItem(UF[19]);
		cbUf.addItem(UF[20]);
		cbUf.addItem(UF[21]);
		cbUf.addItem(UF[22]);
		cbUf.addItem(UF[23]);
		cbUf.addItem(UF[24]);
		cbUf.addItem(UF[25]);
		cbUf.addItem(UF[26]);
		add(lbUf);
		add(cbUf);
		
		lbCidade.setText("Cidade:");
		lbCidade.setBounds(20, 225, 80, 25);
		tfCidade.setBounds(80, 225, 340, 25);
		add(lbCidade);
		add(tfCidade);
		
		JSeparator separador = new JSeparator();
		separador.setBounds(20, 260, 550, 25);
		add(separador);
		
		String[] curso = {
				"Desenvolvimento de Sistemas", 
				"Nutrição e Dietética", 
				"Administração", 
				"Eletrotécnica"
			};
		
		lbCurso.setText("Curso:");
		lbCurso.setBounds(20, 270, 80, 25);
		cbCurso.setBounds(70, 270, 230, 25);
		cbCurso.addItem("-");
		cbCurso.addItem(curso[0]);
		cbCurso.addItem(curso[1]);
		cbCurso.addItem(curso[2]);
		cbCurso.addItem(curso[3]);
		add(cbCurso);
		add(lbCurso);
		
		lbCorPreferida.setText("Cor preferida: ");
		lbCorPreferida.setBounds(315, 270, 150, 25);
		add(lbCorPreferida);
		
		String[] cores = {"Verde", "Amarelo", "Azul", "Branco"};
		
		cbxCorPreferida1.setText(cores[0]);
		cbxCorPreferida1.setBounds(420, 270, 70, 25);
		add(cbxCorPreferida1);
		
		cbxCorPreferida2.setText(cores[1]);
		cbxCorPreferida2.setBounds(490, 270, 100, 25);
		add(cbxCorPreferida2);
		
		cbxCorPreferida3.setText(cores[2]);
		cbxCorPreferida3.setBounds(420, 300, 70, 25);
		add(cbxCorPreferida3);
		
		cbxCorPreferida4.setText(cores[3]);
		cbxCorPreferida4.setBounds(490, 300, 100, 25);
		add(cbxCorPreferida4);
		
		lbModulo.setText("Módulo: ");
		lbModulo.setBounds(20, 330, 100, 25);
		add(lbModulo);
		
		String[] modulos = {"1º Módulo", "2º Módulo", "3º Módulo"};
		
		rbModulo1.setText(modulos[0]);
		rbModulo1.setBounds(80, 330, 100, 25);
		add(rbModulo1);
		
		rbModulo2.setText(modulos[1]);
		rbModulo2.setBounds(180, 330, 100, 25);
		add(rbModulo2);
		
		rbModulo3.setText(modulos[2]);
		rbModulo3.setBounds(280, 330, 100, 25);
		add(rbModulo3);
		
		ButtonGroup groupModulo;
		groupModulo = new ButtonGroup();
		groupModulo.add(rbModulo1);
		groupModulo.add(rbModulo2);
		groupModulo.add(rbModulo3);
		
		ButtonGroup groupCor;
		groupCor = new ButtonGroup();
		groupCor.add(cbxCorPreferida1);
		groupCor.add(cbxCorPreferida2);
		groupCor.add(cbxCorPreferida3);
		groupCor.add(cbxCorPreferida4);
		
		btnEscolherImagem = new JButton();
		btnEscolherImagem.setText("Esc. imagem");
		btnEscolherImagem.setBounds(450, 150, 120, 23);
		add(btnEscolherImagem);

		final JLabel imagemEstatica = new JLabel();
		final String[] imgPath = { "../prjFormulario/src/packageFormularioRobusto/pessoa.png" };

		ImageIcon icon = new ImageIcon(imgPath[0]);
		Image fundoImagem = icon.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
		ImageIcon imagemRedimensionada = new ImageIcon(fundoImagem);
		imagemEstatica.setIcon(imagemRedimensionada);
		imagemEstatica.setBorder(BorderFactory.createLineBorder(cor, 1));
		imagemEstatica.setBounds(450, 15, 120, 120);

		add(imagemEstatica);

		btnEscolherImagem.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent k) {
		        JFileChooser fileChooser = new JFileChooser();
		        int result = fileChooser.showOpenDialog(null);

		        if (result == JFileChooser.APPROVE_OPTION) {
		            File selectedFile = fileChooser.getSelectedFile();
		            String filePath = selectedFile.getAbsolutePath();
		            
		            imgPath[0] = filePath;
		            
		            ImageIcon newIcon = new ImageIcon(imgPath[0]);
		            Image newImage = newIcon.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
		            imagemEstatica.setIcon(new ImageIcon(newImage));
		        }
		    }
		});

		JButton btnValidarCampos;
		btnValidarCampos = new JButton();
		btnValidarCampos.setText("Validar Campos");
		btnValidarCampos.setBounds(20, 420, 150, 25);
		add(btnValidarCampos);
		
		JButton btnLimparCampos;
		btnLimparCampos = new JButton();
		btnLimparCampos.setText("Limpar Campos");
		btnLimparCampos.setBounds(180, 420, 150, 25);
		add(btnLimparCampos);
		
		JButton btnExibirInformações;
		btnExibirInformações = new JButton();
		btnExibirInformações.setText("Exibir informações");
		btnExibirInformações.setBounds(340, 420, 150, 25);
		add(btnExibirInformações);
		
		
		btnExibirInformações.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (validar == true) {
					String nome = tfNome.getText();
					String dataNascimento = tfDataNascimento.getText();
					Object selectedGenero = cbGenero.getSelectedItem();
					String genero = (selectedGenero != null) ? selectedGenero.toString() : "";
					String rg = tfRg.getText();
					String cpf = tfCpf.getText();
					String email = tfEmail.getText();
					String telefone = tfTelefoneResidencial.getText();
					String celular = tfCelular.getText();
					String endereco = tfEndereco.getText();
					String numero = tfNumero.getText();
					String cep = tfCep.getText();
					Object selectedUf = cbUf.getSelectedItem();
					String uf = (selectedUf != null) ? selectedUf.toString() : "";
					String cidade = tfCidade.getText();
					
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
					
					JOptionPane.showMessageDialog(null, mensagem, "Informações do cadastro", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Você precisa validar as informações!");
				}
			}
		});
		
		btnLimparCampos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tfNome.setText(null);
				tfDataNascimento.setText(null);
				cbGenero.removeAllItems();
				tfRg.setText(null);
				tfCpf.setText(null);
				tfEmail.setText(null);
				tfTelefoneResidencial.setText(null);
				tfCelular.setText(null);
				tfEndereco.setText(null);
				tfNumero.setText(null);
				tfCep.setText(null);
				cbUf.removeAllItems();
				tfCidade.setText(null);
				cbCurso.removeAllItems();
				groupCor.setSelected(null, false);
				groupModulo.setSelected(null, false);
				JOptionPane.showMessageDialog(null, "Os campos do formulário foram restaurados!");
			}
		});
		
		btnValidarCampos.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent v) {
		        // Valide os campos aqui
		        if (tfNome.getText().isEmpty() || 
		            tfDataNascimento.getText().isEmpty() || 
		            cbGenero.getSelectedItem() == null || 
		            tfRg.getText().isEmpty() || 
		            tfCpf.getText().isEmpty() || 
		            tfEmail.getText().isEmpty() || 
		            tfTelefoneResidencial.getText().isEmpty() || 
		            tfCelular.getText().isEmpty() || 
		            tfEndereco.getText().isEmpty() || 
		            tfNumero.getText().isEmpty() || 
		            tfCep.getText().isEmpty() || 
		            cbUf.getSelectedItem() == null ||
		            tfCidade.getText().isEmpty() || 
		            cbCurso.getSelectedItem() == null) { 
		            
		        	JOptionPane.showMessageDialog(null, "Há campos em branco!");
		        } else {
		            JOptionPane.showMessageDialog(null, "Campos validados!");
		            validar = true;
		        }
		    }
		});
		
		setVisible(true);
	}
}
