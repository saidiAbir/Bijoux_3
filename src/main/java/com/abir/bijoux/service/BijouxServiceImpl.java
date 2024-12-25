package com.abir.bijoux.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abir.bijoux.entities.Bijoux;
import com.abir.bijoux.repos.BijouxRepository;

@Service 
	public class BijouxServiceImpl implements BijouxService { 
	 
	 @Autowired 
	 BijouxRepository bijouxRepository; 
	  
	 @Override 
	 public Bijoux saveBijoux(Bijoux b) {return bijouxRepository.save(b); 
	   
	 } 
	 
	 @Override 
	 public Bijoux updateBijoux(Bijoux b) { 
	  return bijouxRepository.save(b); 
	   
	 } 
	 
	 @Override 
	 public void deleteBijoux(Bijoux b) { 
	  bijouxRepository.delete(b); 
	 
	 } 
	 
	   @Override 
	 public void deleteBijouxById(Long id) { 
	  bijouxRepository.deleteById(id); 
	   
	 } 
	 
	 @Override 
	 public Bijoux getBijoux(Long id) { 
	  return  bijouxRepository.findById(id).get(); 
	  
	 } 
	 
	 @Override 
	 public List<Bijoux> getAllBijoux() { 
	  return bijouxRepository.findAll(); 
	 }

	

}