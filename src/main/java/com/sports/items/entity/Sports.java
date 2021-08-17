package com.sports.items.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="sports_names")
public class Sports {
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long sportId;
	private String sportName;
	private String sportType;
	private String sportBoard;
	private Long numberOfPlayers;
	private String sportsDepartmentId;
	public Long getSportId() {
		return sportId;
	}
	public void setSportId(Long sportId) {
		this.sportId = sportId;
	}
	public String getSportName() {
		return sportName;
	}
	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
	public String getSportType() {
		return sportType;
	}
	public void setSportType(String sportType) {
		this.sportType = sportType;
	}
	public String getSportBoard() {
		return sportBoard;
	}
	public void setSportBoard(String sportBoard) {
		this.sportBoard = sportBoard;
	}
	public Long getNumberOfPlayers() {
		return numberOfPlayers;
	}
	public void setNumberOfPlayers(Long numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	public String getDepartmentId() {
		return sportsDepartmentId;
	}
	public void setDepartmentId(String sportsDepartmentId) {
		this.sportsDepartmentId = sportsDepartmentId;
	}

}
