package com.abir.bijoux;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.abir.bijoux.entities.Bijoux;
import com.abir.bijoux.repos.BijouxRepository;

@SpringBootTest
class Bijoux3ApplicationTests {

	@Autowired 
	private BijouxRepository bijouxRepository; 
	//@Test 
	//public void testCreateBijoux() { 
	//Bijoux bjx = new Bijoux("Boucle",22.500,new Date()); 
	//bijouxRepository.save(bjx); 
	//} 
	@Test 
	public void testFindBijoux() 
	{ 
	Bijoux b = bijouxRepository.findById(1L).get();     
	System.out.println(b); 
	} 
	@Test 
	public void testUpdateBijoux() 
	{ 
	Bijoux b = bijouxRepository.findById(1L).get(); 
	b.setPrixBijoux(1000.0); 
	bijouxRepository.save(b); 
	} 
	@Test 
	 public void testDeleteBijoux() 
	  { 
	   bijouxRepository.deleteById(1L);; 
	    
	  } 
	 
	    
	@Test 
	 public void testListerTousBijouxs() 
	  { 
	   List<Bijoux>  bijx = bijouxRepository.findAll();   
	   for (Bijoux b : bijx) 
	   { 
	    System.out.println(b); 
	   }   
	  }
}
