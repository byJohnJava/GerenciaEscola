package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Classe para gravar e ler arquivos da Classe Aluno
 * @author jaraujo
 * @since 14/02/2020
 * @version 0.1
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import javax.swing.JOptionPane;

import model.Aluno;
import model.Data;
import model.Endereco;

public class AlunoController {

	public void consistirDados(String matricula, String nome, Data dataNascimento, String sexo, String rg, String cpf,
			String telefone, String senha) {

	/*	
		
		boolean verificaRegistros = false;

		try {
			
			int contCaracteresMatricula = matricula.length();
			
			if (contCaracteresMatricula >= 0) {
				verificaRegistros = true;
			}

			 int contCaracteresNome = nome.length();
			 if (contCaracteresNome >= 2 && contCaracteresNome <= 50 && nome != null) {
				
			}
			 
			

			char auxSexo = sexo.charAt(0);
			a1.setSexo(auxSexo);

			String auxMatricula = a1.getMatricula().trim();
			String auxNome = a1.getNome().trim();

			
			int contCaracteresNome = a1.getNome().length();

			// String datas[] = data.split("/");

//			int dia = Integer.parseInt(datas[0]);
//			int mes = Integer.parseInt(datas[1]);
//			int ano = Integer.parseInt(datas[2]);

			Data datas2 = new Data(dia, mes, ano);
			a1.setDataNascimento(datas2);

			if ((dia >= 1 && dia <= 31) || (mes >= 1 && mes <= 12) || (ano >= 1940 && ano <= 2000)) {
				verificaRegistros = true;
			} else {
				JOptionPane.showMessageDialog(null, "Erro, digite a data no formato dd/MM/yyyy");
			}

			if (c  contCaracteresNome  auxNome != null) {
				verificaRegistros = true;
			} else {
				JOptionPane.showMessageDialog(null, "Erro, revalidade o campo nome");
			}

			if (auxMatricula != null) {
				verificaRegistros = true;
			} else {
				JOptionPane.showMessageDialog(null, "Erro, revalidade o campo matrícula");
			}

			if (auxSexo == 'M' || auxSexo == 'F') {
				verificaRegistros = true;
			} else {
				JOptionPane.showMessageDialog(null, "Sexo inválido, Digite apenas (M ou F)");
			}

			if (verificaRegistros) {
				a1.inserirAluno(a1.getMatricula(), a1.getNome(), a1.getDataNascimento(), a1.getSexo());
				JOptionPane.showMessageDialog(null, "Aluno(a) cadastrado com sucesso");
			} else {
				JOptionPane.showMessageDialog(null, "Existe algum campo inválido, verifique e tente novamente");
			}

			campoMatricula.setText("");
			campoNome.setText("");
			campoDataNascimento.setText("");
			campoSexo.setText("");

		} catch (NumberFormatException e2) {
			JOptionPane.showMessageDialog(null, "Algum campo está inválido, verifique e tente novamente");
		} catch (java.lang.StringIndexOutOfBoundsException e3) {
			JOptionPane.showMessageDialog(null, "\"Algum campo está inválido, verifique e tente novamente\"");
		} catch (java.lang.ArrayIndexOutOfBoundsException e4) {
			JOptionPane.showMessageDialog(null, "\"Algum campo está inválido, verifique e tente novamente\"");
		}

	}

	}
	*/

	public void inserirAluno(Aluno aluno) {

		try {
			File arquivo = new File("Aluno.txt");
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
			PrintStream gravador = new PrintStream(arquivoOutput);
			gravador.print(aluno.getMatricula());
			gravador.print(";");
			gravador.print(aluno.getNome());
			gravador.print(";");
			gravador.print(aluno.getDataNascimento());
			gravador.print(";");
			gravador.println(aluno.getSexo());
			gravador.print(";");
			gravador.println(aluno.getRg());
			gravador.print(";");
			gravador.println(aluno.getCpf());
			gravador.print(";");
			gravador.println(aluno.getEndereco());
			gravador.print(";");
			gravador.println(aluno.getTelefone());
			gravador.print(";");
			gravador.println(aluno.getSenha());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void listarTodos() {

		try {
			InputStream is = new FileInputStream("aluno.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);
			String texto = leitor.readLine();
			while (texto != null) {
				String dados[] = texto.split(";");
				System.out.println("Matricula do aluno: " + dados[0]);
				System.out.println("Nome do aluno: " + dados[1]);
				System.out.println("Data de nascimento: " + dados[2]);
				System.out.println("Sexo do aluno: " + dados[3] + "\n");
				texto = leitor.readLine();

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Arquivo de entrada não encontrado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void listarAniversariantes(int mes) {

		try {
			InputStream is = new FileInputStream("aluno.txt");
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader leitor = new BufferedReader(isr);
			String texto = leitor.readLine();

			while (texto != null) {
				String dados[] = texto.split(";");
				String data[] = dados[2].split("/");

				int mesAniversario = Integer.parseInt(data[1]);

				if (mesAniversario == mes) {

					System.out.println("Matricula do aluno: " + dados[0]);
					System.out.println("Nome do aluno: " + dados[1]);
					System.out.println("Data de nascimento: " + dados[2]);
					System.out.println("Sexo do aluno: " + dados[3] + "\n");

				}

				texto = leitor.readLine();

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Arquivo de entrada não encontrado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
