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

@Repository
public interface repositoryplay extends JpaRepository<playplannlist, String> {

	
	@Modifying
	@Transactional
	 @Query(value="insert into playplannlist VALUES (:ctime,:date,:go2,:how,:memo)",nativeQuery = true)
     void sett(@Param("ctime") String ctime,@Param("date") String date,@Param("go2") String go2
    		 ,@Param("how") String how,@Param("memo") String memo);
	
	
	
	 @Query(value="select * from playplannlist order by date ",nativeQuery = true)
     List<playplannlist> ww();
 	
	 @Query(value="select * from account order by date ",nativeQuery = true)
     List<playplannlist> ww1();
     
}
