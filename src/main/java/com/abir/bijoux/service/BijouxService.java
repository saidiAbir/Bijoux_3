package com.abir.bijoux.service;

import java.util.List;

import com.abir.bijoux.entities.Bijoux;

public interface BijouxService {
		  
		  Bijoux saveBijoux(Bijoux b); 
		  Bijoux updateBijoux(Bijoux b); 
		  void deleteBijoux(Bijoux b); 
		  void deleteBijouxById(Long id); 
		  Bijoux getBijoux(Long id); 
		  List<Bijoux> getAllBijoux(); 
		} 


