package com.idsd.patients.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nom;
private Date dataNaissance;
private boolean malade;
private int score;
public Patient( String nom, Date dataNaissance, boolean malade, int score) {
	
	this.nom = nom;
	this.dataNaissance = dataNaissance;
	this.malade = malade;
	this.score = score;
}
public Patient() {}
public Patient(Long id, String nom, Date dataNaissance, boolean malade, int score) {
	super();
	this.id = id;
	this.nom = nom;
	this.dataNaissance = dataNaissance;
	this.malade = malade;
	this.score = score;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public Date getDataNaissance() {
	return dataNaissance;
}

public void setDataNaissance(Date dataNaissance) {
	this.dataNaissance = dataNaissance;
}

public boolean isMalade() {
	return malade;
}

public void setMalade(boolean malade) {
	this.malade = malade;
}

public int getScore() {
	return score;
}

public void setScore(int score) {
	this.score = score;
}


}
