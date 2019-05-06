package com.infotel.MavenSpringDataMvc.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;


@Entity  // JPA
@Component
public abstract class Cargaison {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCargaison;
	protected String nomCargaison;
	protected String depart;
	protected String destination;
	public int getIdCargaison() {
		return idCargaison;
	}
	public void setIdCargaison(int idCargaison) {
		this.idCargaison = idCargaison;
	}
	public String getNomCargaison() {
		return nomCargaison;
	}
	public void setNomCargaison(String nomCargaison) {
		this.nomCargaison = nomCargaison;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	@Override
	public String toString() {
		return "Cargaison [idCargaison=" + idCargaison + ", nomCargaison=" + nomCargaison + ", depart=" + depart
				+ ", destination=" + destination + "]";
	}
	
	
}

