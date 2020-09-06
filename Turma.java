package atividade02_05;

import java.util.ArrayList;

public class Turma extends Aluno {

	private String cod;
	private Integer turno;
	private Integer sala;
	private ArrayList<Aluno> alunos;

	/**
	 * Construtor lista criada
	 */
	public Turma() {
		alunos = new ArrayList<Aluno>();
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Turma(String cod, Integer turno, Integer sala) {

	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public Integer getTurno() {
		return turno;
	}

	public void setTurno(Integer turno) {
		this.turno = turno;
	}

	public Integer getSala() {
		return sala;
	}

	public void setSala(Integer sala) {
		this.sala = sala;
	}

}
