package com.HRPlus.space.repositories;

import com.HRPlus.space.entities.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUtilidateurRepo extends JpaRepository <UserInformation, Long> {
	
	Optional<UserInformation> findByUsername (String username);
	
	Boolean existsByUsername(String username);
	
	Boolean existsByEmail(String email);
	
	Optional<UserInformation> findByEmail(String email);
	
	@Query("select u from UserInformation u where u.archived = 1")
	List<UserInformation> getEmployes ();
	
	@Query("select u from UserInformation u where u.archived = 2")
	List<UserInformation> getArchivedEmployes ();
   
 

}
