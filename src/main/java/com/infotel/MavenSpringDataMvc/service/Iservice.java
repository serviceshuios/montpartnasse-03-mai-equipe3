package com.infotel.MavenSpringDataMvc.service;

import java.util.List;
import com.infotel.MavenSpringDataMvc.metier.Aerienne;
import com.infotel.MavenSpringDataMvc.metier.Routiere;
import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;


/** 
 * Ces methodes qui suivent permettent de faire le CRUD des 3 classes concretes. On les déclare ici, on les instancie dans ServiceImmpl, on les appelle dans les JSP
 * @since 11
 * */

public interface Iservice {

	/** 
	 * @param r la valeur à traiter
	 * @return void cette methode ne retourne rien
	 * public void addRoad(Routiere r);
	 * */
	public void addRoad(Routiere r);
	public void deleteRoad(int id);
	public Routiere getRoad(int id);
	public void editRoad(Routiere r);
	public List<Routiere> findAllRoads();
	
	public void addAir(Aerienne a);
	public void deleteAir(int id);
	public Aerienne getAir(int id);
	public void editAir(Aerienne a);
	public List<Aerienne> findAllAirs();
	
	public void addCompany(SocieteTransport s);
	public void deleteCompany(int id);
	public SocieteTransport getCompany(int id);
	public void editCompany(SocieteTransport s);
	public List<SocieteTransport> findAllCompanies();

	/**
	 * Methode pour attribuer une societe a une cargaison, pas encore implementee
	 * @param idCarg
	 * @param idComp
	 */
	public void linkCargToComp(int idCarg, int idComp);
	
}



