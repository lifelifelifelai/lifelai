package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.account;
import com.example.demo.entity.playplannlist;
import com.example.demo.entity.playstatus;

@Repository
public interface repositoryplaystatus extends JpaRepository<playstatus, String> {

	
	@Modifying
	@Transactional
	 @Query(value="update playstatus set status1=:status1 where name1='shulife'",nativeQuery = true)
     void updates1(@Param("status1") String status1);
	
	@Modifying
	@Transactional
	 @Query(value="update playstatus set status2=:status2 where name1='shulife'",nativeQuery = true)
     void updates2(@Param("status2") String status2);
	
	@Modifying
	@Transactional
	 @Query(value="update playstatus set status3=:status3 where name1='shulife'",nativeQuery = true)
     void updates3(@Param("status3") String status3);
	
	@Modifying
	@Transactional
	 @Query(value="update playstatus set status1=:status1,status2=:status2,status3=:status3 where name1='shulife'",nativeQuery = true)
     void updatesall(@Param("status1") String status1,@Param("status2") String status2,@Param("status3") String status3);
	
	
	 @Query(value="select * from playstatus with(nolock) ",nativeQuery = true)
	 playstatus getstatus();
 	
	 
     
}
