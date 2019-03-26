package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class Voto {
	private int id;
	private String esame;
	private int punteggio;
	private String data;
	
	public Voto(int id, String esame, int punteggio, String data) {
		this.id = id;
		this.punteggio = punteggio;
		this.esame = esame;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPunti() {
		return punteggio;
	}

	public void setPunti(int voto) {
		this.punteggio = voto;
	}

	public String getCorso() {
		return esame;
	}

	public void setCorso(String corso) {
		this.esame = corso;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return String.format("Voto [punti=%s, corso=%s, data=%s]", punteggio, esame, data);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
