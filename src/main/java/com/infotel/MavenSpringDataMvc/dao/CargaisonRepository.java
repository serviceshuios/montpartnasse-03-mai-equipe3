package com.infotel.MavenSpringDataMvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infotel.MavenSpringDataMvc.metier.Cargaison;

public interface CargaisonRepository extends JpaRepository<Cargaison, Integer> {

	@Modifying
	@Query("UPDATE Cargaison set societe.idSociete=:x where idCargaison=:y")
	public void linkCargToComp(@Param("y") int idCargaison, @Param("x") int idSociete);
	
}
