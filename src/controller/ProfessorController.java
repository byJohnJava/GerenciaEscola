package controller;

import model.Professor;

public class ProfessorController {
	
	public void testaProfessor() {
		Professor p1 = new Professor();
		
		p1.setNome("Jo�o");
		p1.setCpf("123.456.789-01");
		p1.setSalario(30.000);
		p1.setMateria("An�lise de sistemas");
		
		p1.exibe();
	}

}
