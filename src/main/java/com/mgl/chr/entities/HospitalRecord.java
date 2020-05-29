package com.mgl.chr.entities;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Entity
@Table
public class HospitalRecord {

	@Id
	@Column(name = "record_id")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
	@GenericGenerator(name = "native", strategy = "native")
	private Long id;
	@Column
	private String hospitalId;
	@Column
	private String name;
	@Column
	private String phone;
	@Column
	private String email;
	@Column
	private Boolean notifyWhenUserSubscribe;
	@Column(columnDefinition = "TEXT")
	private String address;
	@Column
	private String floor;
	@Column
	private String section;
	@Column
	private String room;
	@Column
	private String itemType;
	@Column
	private String itemName;
	@Column
	private String itemId;
	@Column(columnDefinition = "TEXT")
	private String note;
	@Column
	private Boolean isavailable;
	@Column
	private LocalDateTime availableFrom;
	@Column
	private LocalDateTime availableTill;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "HospitalRecord_NotifPatientRegister", joinColumns = {
			@JoinColumn(name = "record_id") }, inverseJoinColumns = { @JoinColumn(name = "notifuser_id") })
	private Set<NotifPatientRegister> notifPatients = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getNotifyWhenUserSubscribe() {
		return notifyWhenUserSubscribe;
	}

	public void setNotifyWhenUserSubscribe(Boolean notifyWhenUserSubscribe) {
		this.notifyWhenUserSubscribe = notifyWhenUserSubscribe;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Boolean getIsavailable() {
		return isavailable;
	}

	public void setIsavailable(Boolean isavailable) {
		this.isavailable = isavailable;
	}

	public LocalDateTime getAvailableFrom() {
		return availableFrom;
	}

	public void setAvailableFrom(LocalDateTime availableFrom) {
		this.availableFrom = availableFrom;
	}

	public LocalDateTime getAvailableTill() {
		return availableTill;
	}

	public void setAvailableTill(LocalDateTime availableTill) {
		this.availableTill = availableTill;
	}

	public Set<NotifPatientRegister> getNotifPatients() {
		return notifPatients;
	}

	public void setNotifPatients(Set<NotifPatientRegister> notifPatients) {
		this.notifPatients = notifPatients;
	}

	@Override
	public String toString() {
		Gson gson = new GsonBuilder().serializeNulls().create();
		return gson.toJson(this);
	}
}
