package controller;

import model.Professor;

public class ProfessorController {
	
	public void testaProfessor() {
		Professor p1 = new Professor();
		
		p1.setNome("João");
		p1.setCpf("123.456.789-01");
		p1.setSalario(30.000);
		p1.setMateria("Análise de sistemas");
		
		p1.exibe();
	}

}
