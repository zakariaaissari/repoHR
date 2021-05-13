package com.HRPlus.space.repositories;

import com.HRPlus.space.entities.Conge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICongeRepo extends JpaRepository<Conge, Long> {
	
	@Query("select c from Conge c where c.statusOfDemand like 'Waiting'")
	List<Conge> getCongeByStatus();
	
	@Query("select count(c.duree) from Conge c where c.user.idUser = :id")
	int countDuree(Long id);

}
