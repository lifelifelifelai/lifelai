package com.example.demo.repository;

import java.util.List;

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
	
	
	
	 @Query(value="select status from status where id='id' ",nativeQuery = true)
      String status();
	 
	 @Query(value="select * from status ",nativeQuery = true)
     List<status> ww1();
	 
	 
	
}