package com.mgl.chr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.mgl.chr.entities.HospitalRecord;

public interface HospitalRecordRepository extends JpaRepository<HospitalRecord, Long> {

//	@Modifying
//	@Transactional
//	@Query("UPDATE HospitalRecord SET isavailable:isavailable WHERE record_id:id")
//	int updateAvailablility(@Param("id") Long id, @Param("isavailable") Boolean isavailable);
}
