package com.virtures.agenda.controller;

import com.virtures.agenda.dao.CompromissoDAO;
import com.virtures.agenda.model.Compromisso;

public class Controller {
	private CompromissoDAO dao;

	public void salvarCompromisso(String text, String text2, String text3) {
		// TODO Auto-generated method stub
		dao = new CompromissoDAO();
		
		dao.inserirCompromisso(new Compromisso(0, text, text2, text3));
		
	}

}
