package com.mgl.chr.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mgl.chr.entities.HospitalRecord;
import com.mgl.chr.services.ReadDetailsService;

@RestController
@RequestMapping("/chr/rest/")
public class RestAPI {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ReadDetailsService readDetailsService;

	@GetMapping(value = "/getall")
	public List<HospitalRecord> getAll() {
		log.info("Getting list of all Items from database.");
		return readDetailsService.getAll();
	}

}
