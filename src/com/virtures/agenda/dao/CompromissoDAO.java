package com.virtures.agenda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.virtures.agenda.model.Compromisso;

public class CompromissoDAO {
	
	private Connection conn;
	
	public CompromissoDAO() {
		
		String url = "jdbc:mysql://localhost:3306/agenda_db";
		String nome = "root";
		String senha = "123456";
		
		try {
			conn = DriverManager.getConnection(url, nome, senha);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	public void inserirCompromisso(Compromisso compromisso) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO compromissos(data, hora, descricao) values(?, ?, ?)";
				
		try(PreparedStatement pstm = conn.prepareStatement(sql)){
			
			pstm.setString(1, compromisso.getData());
			pstm.setString(2, compromisso.getHora());
			pstm.setString(3, compromisso.getDescricao());
			pstm.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
