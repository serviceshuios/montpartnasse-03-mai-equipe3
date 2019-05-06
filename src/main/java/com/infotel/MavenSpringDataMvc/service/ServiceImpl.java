package com.infotel.MavenSpringDataMvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.infotel.MavenSpringDataMvc.dao.AirRepository;
import com.infotel.MavenSpringDataMvc.dao.CompanyRepository;
import com.infotel.MavenSpringDataMvc.dao.RoadRepository;
import com.infotel.MavenSpringDataMvc.metier.Aerienne;
import com.infotel.MavenSpringDataMvc.metier.Routiere;
import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;

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

}
