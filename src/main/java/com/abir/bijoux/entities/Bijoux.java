package com.abir.bijoux.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bijoux {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idBijoux;
  private String nomBijoux;
  private Double prixBijoux;
  private Date dateCreation;

  public Bijoux() {
    super();
  }

public Bijoux(String nomBijoux, Double prixBijoux, Date dateCreation) { 
super(); 
this.nomBijoux = nomBijoux; 
this.prixBijoux = prixBijoux; 
this.dateCreation = dateCreation; 
}
public Long getIdBijoux() { 
  return idBijoux; 
 } 
 
 public void setIdBijoux(Long idBijoux) { 
  this.idBijoux = idBijoux; 
 } 
 
 public String getNomBijoux() { 
  return nomBijoux; 
 } 
 
 public void setNomBijoux(String nomBijoux) { 
  this.nomBijoux = nomBijoux; 
 } 
 
 public Double getPrixBijoux() { 
  return prixBijoux; 
 } 
 
 public void setPrixBijoux(Double prixBijoux) { 
  this.prixBijoux = prixBijoux; 
 } 
 
 public Date getDateCreation() { 
  return dateCreation; 
 } 
 
 public void setDateCreation(Date dateCreation) { 
  this.dateCreation = dateCreation; 
 } 
 
 @Override 
 public String toString() { 
  return "Bijoux [idBijoux=" + idBijoux + ", nomBijoux=" + 
nomBijoux + ", prixBijoux=" + prixBijoux 
    + ", dateCreation=" + dateCreation + "]"; 
 } 
}