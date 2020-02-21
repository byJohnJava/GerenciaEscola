package model;

public class Faxineira extends Funcionario {
	
	private String turno;
	
	public Faxineira() {
		
	}

	public Faxineira(String turno) {
		this.turno = turno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	

}
