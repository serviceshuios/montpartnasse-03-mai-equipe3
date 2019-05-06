package com.infotel.MavenSpringDataMvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.MavenSpringDataMvc.dao.AirRepository;
import com.infotel.MavenSpringDataMvc.dao.CompanyRepository;
import com.infotel.MavenSpringDataMvc.dao.RoadRepository;
import com.infotel.MavenSpringDataMvc.metier.Aerienne;
import com.infotel.MavenSpringDataMvc.metier.Routiere;
import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;

/**
 * Implementation des methodes de la couches service
 * @author elsa gouzhy
 *
 */
@Service
public class ServiceImpl implements Iservice {

	
	@Autowired
	RoadRepository roadRepository;
	@Autowired
	AirRepository airRepository;
	@Autowired
	CompanyRepository companyRepository;
	
	
	@Override
	public void addRoad(Routiere r) {
		roadRepository.save(r);
	}

	@Override
	public void deleteRoad(int id) {
		roadRepository.deleteById(id);
	}

	@Override
	public Routiere getRoad(int id) {
		return roadRepository.findById(id).get();
	}

	@Override
	public void editRoad(Routiere r) {
		roadRepository.save(r);
	}

	@Override
	public List<Routiere> findAllRoads() {
		return roadRepository.findAll();
	}

	@Override
	public void addAir(Aerienne a) {
		airRepository.save(a);
	}

	@Override
	public void deleteAir(int id) {
		airRepository.deleteById(id);
	}

	@Override
	public Aerienne getAir(int id) {
		return airRepository.findById(id).get();
	}

	@Override
	public void editAir(Aerienne a) {
		airRepository.save(a);
	}

	@Override
	public List<Aerienne> findAllAirs() {
		return airRepository.findAll();
	}

	@Override
	public void addCompany(SocieteTransport s) {
		companyRepository.save(s);
	}

	@Override
	public void deleteCompany(int id) {
		companyRepository.deleteById(id);
	}

	@Override
	public SocieteTransport getCompany(int id) {
		return companyRepository.findById(id).get();
	}

	@Override
	public void editCompany(SocieteTransport s) {
		companyRepository.save(s);
	}

	@Override
	public List<SocieteTransport> findAllCompanies() {
		return companyRepository.findAll();
	}

	@Override
	public void linkCargToComp(int idCarg, int idComp) {
		
	}

}

//@Override
//public void attribuerStagiairePromo(int idStagiaire, int idPromo) {
//	try {
//		con = GestionConnexion.getInstance();
//		st = con.prepareStatement("UPDATE Stagiaire SET fpromo=? WHERE idStagiaire=?");
//		st.setInt(1, idPromo);
//		st.setInt(2, idStagiaire);
//		st.executeUpdate();
//		System.out.printf("\nstagiaire %d ajoute a la promo %d \n", idStagiaire, idPromo);
//		
//	} catch (Exception e) {
//		System.out.println("error during attribution");
//		e.printStackTrace();
//	}

