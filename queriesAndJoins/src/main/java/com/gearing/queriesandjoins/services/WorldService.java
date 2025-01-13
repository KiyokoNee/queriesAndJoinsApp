package com.gearing.queriesandjoins.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gearing.queriesandjoins.models.City;
import com.gearing.queriesandjoins.models.Country;
import com.gearing.queriesandjoins.repositories.WorldRepository;

@Service
public class WorldService {
	@Autowired
	private WorldRepository worldRepo;
	
	public List<Country> getAllCountries(){
		return worldRepo.findAll();
	}
	
	public List<Object[]> getSloveneCountries()
	{
		return worldRepo.allSpeakSlovene();
	}
	
	public List<Object[]> getCityCountByCountry(){
		return worldRepo.countOfCitiesByCountry();
	}
	
	public List<Object[]> getMexicoCitiesGreaterThan() {
		return worldRepo.mexicoCitiesGreaterThan();
	}
	
	public List<Object[]> getLanguageGreaterThan() {
		return worldRepo.languagesPerCountryMajority();
	}
	
	public List<Country> getSmallCountryHeavilyPopulated() {
		return worldRepo.surfaceAreaPopulationSpecifics();
	}
	
	public List<Country> getStrongMonarchies() {
		return worldRepo.certainConstitutionalMonarchies();
	}
	
	public List<Object[]> getArgentinaSpecs() {
		return worldRepo.argentinaSpecificDistrict();
	}
	
	public List<Object[]> getCountriesPerRegion(){
		return worldRepo.countriesPerRegion();
	}
}
