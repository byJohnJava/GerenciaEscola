package view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class FuncionarioView {

	private JFrame janela;
	private JPanel painelDaJanela;
	private JPanel painelDoFuncionario;
	private JPanel painelDoEndereco;
	private JButton botaoSalvar;
	private JButton botaoCancelar;
	private JLabel lblMatricula;
	private JLabel lblNome;
	private JLabel lblDataNascimento;
	private JLabel lblSexo;
	private JLabel lblTelefone;
	private JLabel lblRg;
	private JLabel lblCpf;
	private JLabel lblSenha;
	private JLabel lblLogradouro;
	private JLabel lblComplemento;
	private JLabel lblNumero;
	private JLabel lblBairro;
	private JLabel lblCidade;
	private JLabel lblEstado;
	private JLabel lblCep;
	private JTextField campoMatricula;
	private JTextField campoNome;
	private JTextField campoDataNascimento;
	private JTextField campoTelefone;
	private JTextField campoRg;
	private JTextField campoCpf;
	private JTextField campoLogradouro;
	private JTextField campoComplemento;
	private JTextField campoNumero;
	private JTextField campoBairro;
	private JTextField campoCidade;
	private JTextField campoEstado;
	private JTextField campoCep;
	private JPasswordField jpwSenha;
	private JRadioButton rbtMasculino;
	private JRadioButton rbtFeminino;
	private ButtonGroup grpRadio;
	private JComboBox cbCidade;
	private JComboBox cbEstado;

	public FuncionarioView() {

	}
		
	public void iniciaGui() {

		// Criar instâncias
		janela = new JFrame();
		painelDaJanela = (JPanel) janela.getContentPane();
		painelDoFuncionario = new JPanel();
		painelDoEndereco = new JPanel();
		botaoSalvar = new JButton();
		botaoCancelar = new JButton();
		lblMatricula = new JLabel();
		lblNome = new JLabel();
		lblDataNascimento = new JLabel();
		lblSexo = new JLabel();
		lblTelefone = new JLabel();
		lblRg = new JLabel();
		lblCpf = new JLabel();
		lblSenha = new JLabel();
		lblLogradouro = new JLabel();
		lblComplemento = new JLabel();
		lblNumero = new JLabel();
		lblBairro = new JLabel();
		lblCidade = new JLabel();
		lblEstado = new JLabel();
		lblCep = new JLabel();
		campoMatricula = new JTextField();
		campoNome = new JTextField();
		campoDataNascimento = new JTextField();
		campoTelefone = new JTextField();
		campoRg = new JTextField();
		campoCpf = new JTextField();
		campoLogradouro = new JTextField();
		campoComplemento = new JTextField();
		campoNumero = new JTextField();
		campoBairro = new JTextField();
		campoCidade = new JTextField();
		campoEstado = new JTextField();
		campoCep = new JTextField();
		jpwSenha = new JPasswordField();
		rbtMasculino = new JRadioButton();
		rbtFeminino = new JRadioButton();
		grpRadio = new ButtonGroup();
		cbCidade = new JComboBox();
		cbEstado = new JComboBox();

		// Características da Matricula
		lblMatricula.setText("Matrícula: ");
		lblMatricula.setBounds(10, -20, 100, 100);
		campoMatricula.setBounds(70, 20, 100, 20);

		// Características do Nome
		lblNome.setText("Nome: ");
		lblNome.setBounds(10, -20, 100, 100);
		campoNome.setBounds(70, 20, 350, 20);

		// Características da Data de nascimento
		lblDataNascimento.setText("Data de nascimento: ");
		lblDataNascimento.setBounds(10, 32, 200, 100);
		try {
			javax.swing.text.MaskFormatter dt = new javax.swing.text.MaskFormatter("##/##/####");
			campoDataNascimento = new javax.swing.JFormattedTextField(dt);
		} catch (Exception e) {

		}
		campoDataNascimento.setBounds(130, 72, 80, 20);

		
		// Características de Sexo
		lblSexo.setText("Sexo: ");
		lblSexo.setBounds(220, 32, 100, 100);

		// Características do Radio Button Masculino
		rbtMasculino = new JRadioButton();
		rbtMasculino.setText("Masculino" + "   /");
		rbtMasculino.setBounds(272, 72, 100, 22);

		// Características do Radio Button Feminino
		rbtFeminino = new JRadioButton();
		rbtFeminino.setText("Feminino");
		rbtFeminino.setBounds(370, 72, 100, 22);

		// Características do RG
		lblRg.setText("RG: ");
		lblRg.setBounds(10, 61, 200, 100);
		try {
			javax.swing.text.MaskFormatter rg = new javax.swing.text.MaskFormatter("##.###.###-A");
			campoRg = new javax.swing.JFormattedTextField(rg);
		} catch (Exception e2) {	
		}
		campoRg.setBounds(35, 103, 100, 20);

		// Características do CPF
		lblCpf.setText("CPF: ");
		lblCpf.setBounds(170, 61, 200, 100);
		try {
			javax.swing.text.MaskFormatter cpf = new javax.swing.text.MaskFormatter("###.###.###-##");
			campoCpf = new javax.swing.JFormattedTextField(cpf);
		} catch (Exception e2) {	
		}
		campoCpf.setBounds(200, 103, 120, 20);

		// Características do Telefone
		lblTelefone.setText("Telefone: ");
		lblTelefone.setBounds(340, 103, 100, 20);
		try {
			javax.swing.text.MaskFormatter tel = new javax.swing.text.MaskFormatter("(##) #####-####");
			campoTelefone = new javax.swing.JFormattedTextField(tel);
		} catch (Exception e3) {	
		}
		campoTelefone.setBounds(400, 103, 120, 20);

		// Caraceterísticas do Logradouro
		lblLogradouro.setText("Logradouro: ");
		lblLogradouro.setBounds(10, 20, 200, 20);
		campoLogradouro.setBounds(87, 20, 270, 20);

		// Características do Complemento
		lblComplemento.setText("Complemento: ");
		lblComplemento.setBounds(170, 70, 100, 20);
		campoComplemento.setBounds(260, 70, 100, 20);
		
		//Características do Numero
		lblNumero.setText("Número: ");
		lblNumero.setBounds(370, 20, 100, 20);
		
		try {
			javax.swing.text.MaskFormatter num = new javax.swing.text.MaskFormatter("#####");
			campoNumero = new javax.swing.JFormattedTextField(num);
		} catch (Exception e4) {	
		}
		campoNumero.setBounds(425, 20, 50, 20);

		//Características do Bairro
		lblBairro.setText("Bairro: ");
		lblBairro.setBounds(10, 44, 100, 20);
		campoBairro.setBounds(60, 45, 200, 20);
		
		//Características do Cidade
		lblCidade.setText("Cidade: ");
		lblCidade.setBounds(270, 45, 200, 20);
		cbCidade.setSelectedIndex(-1);
		cbCidade.setBounds(320, 45, 250, 20);
		cbCidade.setMaximumRowCount(200);

		//Características do Estado
		lblEstado.setText("Estado: ");
		lblEstado.setBounds(380, 70, 70, 20);
		cbEstado.setSelectedIndex(-1);
		cbEstado.setBounds(430, 70, 80, 20);
		cbEstado.setMaximumRowCount(200);
		
		//Características do CEP
		lblCep.setText("CEP: ");
		lblCep.setBounds(10, 68, 100, 20);
		try {
			javax.swing.text.MaskFormatter cep = new javax.swing.text.MaskFormatter("#####-###");
			campoCep = new javax.swing.JFormattedTextField(cep);
		} catch (Exception e5) {	
		}
		campoCep.setBounds(60, 70, 100, 20);
		
		//configurar a label senha
		lblSenha.setText("Senha: ");
		lblSenha.setBounds(9, 90, 200, 100);
		jpwSenha.setBounds(58, 130, 150, 20);
		
		// Adiciona o Radio Button ao grupo
		grpRadio.add(rbtMasculino);
		grpRadio.add(rbtFeminino);
		
		//Características do botao Salvar
		botaoSalvar.setText("SALVAR");
		botaoSalvar.setBounds(180, 270, 100, 20);
		
		//Características do botao Cancelar
		botaoCancelar.setText("CANCELAR");
		botaoCancelar.setBounds(290, 270, 100, 20);
		
		
		//Características do Painel 
		painelDoFuncionario.setBounds(0, 0, 580, 160);
		painelDoFuncionario.setLayout(null);
		painelDoFuncionario.setBorder(new TitledBorder("Informações do Funcionario"));
		
		//Características do Painel Endereço
		painelDoEndereco.setBounds(0, 160, 580, 100);
		painelDoEndereco.setLayout(null);
		painelDoEndereco.setBorder(new TitledBorder("Endereço"));
		
		//adicionar componentes do Funcionario ao painel do Funcionario
		painelDoFuncionario.add(lblNome);
		painelDoFuncionario.add(lblDataNascimento);
		painelDoFuncionario.add(lblSexo);
		painelDoFuncionario.add(lblTelefone);
		painelDoFuncionario.add(lblRg);
		painelDoFuncionario.add(lblCpf);
		painelDoFuncionario.add(lblSenha);
		painelDoFuncionario.add(campoMatricula);
		painelDoFuncionario.add(campoNome);
		painelDoFuncionario.add(campoDataNascimento);
		painelDoFuncionario.add(campoTelefone);
		painelDoFuncionario.add(campoRg);
		painelDoFuncionario.add(campoCpf);
		painelDoFuncionario.add(jpwSenha);
		painelDoFuncionario.add(rbtMasculino);
		painelDoFuncionario.add(rbtFeminino);
		
		//adiciona componentes do endereço no painel endereço
		painelDoEndereco.add(lblLogradouro);
		painelDoEndereco.add(lblComplemento);
		painelDoEndereco.add(lblNumero);
		painelDoEndereco.add(lblBairro);
		painelDoEndereco.add(lblCidade);
		painelDoEndereco.add(lblEstado);
		painelDoEndereco.add(lblCep);
		painelDoEndereco.add(campoLogradouro);
		painelDoEndereco.add(campoComplemento);
		painelDoEndereco.add(campoBairro);
		painelDoEndereco.add(campoNumero);
		painelDoEndereco.add(campoCep);
		painelDoEndereco.add(cbCidade);
		painelDoEndereco.add(cbEstado);
		
		
		//adiciona painel Funcionario e painel endereço no painelDaJanela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(painelDoFuncionario);
		painelDaJanela.add(painelDoEndereco);
		painelDaJanela.add(botaoCancelar);
		painelDaJanela.add(botaoSalvar);

		// Características da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(600, 500);
		janela.setTitle("Cadastro de Funcionários");
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);

	}
	

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		new FuncionarioView().iniciaGui();
	}

}

	

