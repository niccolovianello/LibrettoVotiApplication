package it.polito.tdp.libretto.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.libretto.model.Voto;

public class VotoDAO {

	public List<Voto> listAll() {
		String sql = "SELECT * FROM voto";
		List<Voto> result = new LinkedList<Voto>();
		
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
		
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				Voto v = new Voto(rs.getInt("id"),
						rs.getString("esame"),
						rs.getInt("punteggio"),
						rs.getString("data"));
				
				result.add(v);
			}
			
			conn.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	
		return result;
	}
	
	public List<Voto> listVotiCfr(String c, int p){
		String sql = "SELECT * FROM voto WHERE punteggio "+c+" "+p+"";
		List<Voto> result = new LinkedList<Voto>();
		
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
		
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				Voto v = new Voto(rs.getInt("id"),
						rs.getString("esame"),
						rs.getInt("punteggio"),
						rs.getString("data"));
				
				result.add(v);
			}
			
			conn.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	
		return result;
	}
	
	public List<Voto> listVotiData(String data){
		String sql = "SELECT * FROM voto WHERE data = '"+data+"'";
		List<Voto> result = new LinkedList<Voto>();
		
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
		
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				Voto v = new Voto(rs.getInt("id"),
						rs.getString("esame"),
						rs.getInt("punteggio"),
						rs.getString("data"));
				
				result.add(v);
			}
			
			conn.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	
		return result;
	}
}
