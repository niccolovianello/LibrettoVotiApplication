package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.libretto.db.VotoDAO;

public class Libretto {
	
	private List<Voto> voti ;
	
	public Libretto() {
		this.voti = new ArrayList<Voto>() ;
	}
	
	/**
	 * Aggiunge un nuovo voto al libretto
	 * 
	 * @param v il {@link Voto} da aggiungere
	 */
	public void add(Voto v) {
		voti.add(v) ;
	}
	
	/**
	 * Seleziona il sottoinsieme di voti che hanno il punteggio specificato
	 *  
	 * @param punti punteggio da ricerca
	 * @return lista di {@link Voto} aventi quel punteggio (eventualmente vuota)
	 */
	public List<Voto> cercaVoti(String c, int punti) {
		VotoDAO dao = new VotoDAO();
		
		//Soluzione 1
		/*List<Corso> corsi = dao.listAll();
		List<Corso> result = new ArrayList<Corso>();
				
		for(Corso c : corsi) {
			if(c.getPd() == periodo) {
				result.add(c);
			}
		}*/
		
		// Soluzione 2
		return dao.listVotiCfr(c, punti);
	}

	/**
	 * Ricerca un {@link Voto} relativo al corso di cui è specificato il nome
	 * 
	 * @param nomeEsame nome del corso da ricercare
	 * @return il {@link Voto} corrispondente, oppure {@code null} se non esistente
	 */
	public Voto cercaEsame(String nomeEsame) {
		for(Voto v: this.voti) {
			if(v.getCorso().equals(nomeEsame)) {
				return v ;
			}
		}
		
		return null ;
	}
	
}
