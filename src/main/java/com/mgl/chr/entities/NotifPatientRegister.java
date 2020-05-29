package com.mgl.chr.entities;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Entity
@Table
public class NotifPatientRegister {

	@Id
	@Column(name = "notifuser_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private long id;
	@Column
	private String email;
	@Column
	private Boolean isnotifed;
	@Column
	private LocalDateTime notifiedAt;

	@ManyToMany(mappedBy = "notifPatients")
	private Set<HospitalRecord> hospitalRecords = new HashSet<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIsnotifed() {
		return isnotifed;
	}

	public void setIsnotifed(Boolean isnotifed) {
		this.isnotifed = isnotifed;
	}

	public LocalDateTime getNotifiedAt() {
		return notifiedAt;
	}

	public void setNotifiedAt(LocalDateTime notifiedAt) {
		this.notifiedAt = notifiedAt;
	}

	public Set<HospitalRecord> getHospitalRecords() {
		return hospitalRecords;
	}

	public void setHospitalRecords(Set<HospitalRecord> hospitalRecords) {
		this.hospitalRecords = hospitalRecords;
	}

	@Override
	public String toString() {
		Gson gson = new GsonBuilder().serializeNulls().create();
		return gson.toJson(this);
	}
}
