package com.mgl.chr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgl.chr.entities.HospitalRecord;
import com.mgl.chr.repositories.HospitalRecordRepository;

@Service
public class ReadDetailsService {

	@Autowired
	HospitalRecordRepository repository;

	// Get all HospitalRecord
	public List<HospitalRecord> getAll() {
		return repository.findAll();
	}

}
