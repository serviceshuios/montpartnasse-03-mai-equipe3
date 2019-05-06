package com.infotel.MavenSpringDataMvc.metier;

import java.util.Date;

import javax.persistence.Entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Component
@Scope(value="prototype")
public class SocieteTransport {

	private int idSociete;
	private String nomSociete;
	private String numSiret;
	private Date dateCreation;
	
	public int getIdSociete() {
		return idSociete;
	}
	public void setIdSociete(int idSociete) {
		this.idSociete = idSociete;
	}
	public String getNomSociete() {
		return nomSociete;
	}
	public void setNomSociete(String nomSociete) {
		this.nomSociete = nomSociete;
	}
	public String getNumSiret() {
		return numSiret;
	}
	public void setNumSiret(String numSiret) {
		this.numSiret = numSiret;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	@Override
	public String toString() {
		return "SocieteTransport [idSociete=" + idSociete + ", nomSociete=" + nomSociete + ", numSiret=" + numSiret
				+ ", dateCreation=" + dateCreation + "]";
	}
	
	
}
