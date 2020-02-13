package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.account;
import com.example.demo.entity.status;

@Repository
public interface repositorystatus extends JpaRepository<status, String> {

	
	@Modifying
	@Transactional
	 @Query(value="update status set status=:sta ",nativeQuery = true)
     void sett(@Param("sta") String status);
	
	
}