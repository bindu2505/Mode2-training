package com.hcl.hotel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Room")
public class Room {
	
	private String roomID;
	private String type;
	private String status;
	private int costPerDay;
	
	
	@Id
	@Column(name="RoomID")
	public String getRoomID() {
		return roomID;
	}
	public void setRoomID(String roomID) {
		this.roomID = roomID;
	}
	
	@Column(name="Type")
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Column(name="Status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Column(name="CostPerDay")
	public int getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(int costPerDay) {
		this.costPerDay = costPerDay;
	}
	
	
}
