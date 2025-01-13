package com.gearing.queriesandjoins.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.gearing.queriesandjoins.models.City;
import com.gearing.queriesandjoins.models.Country;
import com.gearing.queriesandjoins.services.WorldService;

@Controller
public class WorldController {
	@Autowired
	private WorldService worldServ;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Object[]> sloveneCountries = worldServ.getSloveneCountries();
		List<Object[]> cityCountCountries = worldServ.getCityCountByCountry();
		List<Object[]> mexicoCities = worldServ.getMexicoCitiesGreaterThan();
		List<Object[]> majorityLanguages = worldServ.getLanguageGreaterThan();
		List<Country> smallCountries = worldServ.getSmallCountryHeavilyPopulated();
		List<Country> monarchies = worldServ.getStrongMonarchies();
		List<Object[]> argentinaSpecs = worldServ.getArgentinaSpecs();
		List<Object[]> regionCount = worldServ.getCountriesPerRegion();
		
		model.addAttribute("sloveneCountries", sloveneCountries);
		model.addAttribute("cityCountCountries", cityCountCountries);
		model.addAttribute("mexicoCities", mexicoCities);
		model.addAttribute("majorityLanguages", majorityLanguages);
		model.addAttribute("smallCountries", smallCountries);
		model.addAttribute("monarchies", monarchies);
		model.addAttribute("argentinaSpecs", argentinaSpecs);
		model.addAttribute("regionCount", regionCount);
		
		return "index.jsp";
	}
}
