package model;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {

	List<String> materia = new ArrayList<String>();

//	public void exibe() {
//		super.exibe();
//		System.out.println("Matéria do professor: " + materia);
//	}

	public Professor() {
		System.out.println("Professor criado");
	}

	public Professor(List<String> materia) {
		this.materia = materia;
	}

	public List<String> getMateria() {
		return materia;
	}

	public void setMateria(List<String> materia) {
		this.materia = materia;
	}

}
