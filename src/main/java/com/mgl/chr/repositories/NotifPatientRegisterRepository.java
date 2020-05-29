package com.mgl.chr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.mgl.chr.entities.NotifPatientRegister;

public interface NotifPatientRegisterRepository extends JpaRepository<NotifPatientRegister, Long> {

//	@Modifying
//	@Transactional
//	@Query("UPDATE NotifPatientRegister SET isnotifed:isnotifed WHERE notifuser_id:id")
//	int updateAvailablility(@Param("id") Long id, @Param("isnotifed") Boolean isnotifed);
}
