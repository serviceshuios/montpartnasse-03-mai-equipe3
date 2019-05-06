package com.infotel.MavenSpringDataMvc.metier;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Description de la classe SocieteTransport.
 * 
 * @author Benjamin Clarenc, Elsa Gouzhy
 * @version 0.1
 */

@Entity
@Component
@Scope(value="prototype")
public class SocieteTransport {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSociete;
	private String nomSociete;
	private String numSiret;
	private Date dateCreation;
	@OneToMany(mappedBy="societe")
	private List<Cargaison> cargaisons;
	
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
