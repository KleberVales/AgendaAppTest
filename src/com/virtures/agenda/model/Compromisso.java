package com.virtures.agenda.model;

public class Compromisso {

	private int id;
	private String data;
	private String hora;
	private String descricao;

	public Compromisso(int i, String text, String text2, String text3) {
		// TODO Auto-generated constructor stub

		this.id = i;
		this.data = text;
		this.hora = text2;
		this.descricao = text3;

	}

	public String getData() {
		// TODO Auto-generated method stub
		return this.data;
	}

	public String getHora() {
		// TODO Auto-generated method stub
		return this.hora;
	}

	public String getDescricao() {
		// TODO Auto-generated method stub
		return this.descricao;
	}

}
