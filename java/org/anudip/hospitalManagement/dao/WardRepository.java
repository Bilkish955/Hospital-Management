package org.anudip.hospitalManagement.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.anudip.hospitalManagement.bean.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface WardRepository extends JpaRepository<Ward, String> {
	@Query("select count(wardId) from Ward")
	 public Integer getCountId();
	
}
