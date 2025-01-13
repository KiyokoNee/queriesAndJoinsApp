package com.gearing.queriesandjoins.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gearing.queriesandjoins.models.City;
import com.gearing.queriesandjoins.models.Country;

@Repository
public interface WorldRepository extends CrudRepository<Country, Long> {
	List<Country> findAll();
	
	@Query(nativeQuery = true, value = "SELECT name, language, percentage " 
			+ "FROM countries INNER JOIN languages "
			+ "ON countries.id = languages.country_id "
			+ "WHERE languages.language = 'Slovene' "
			+ "ORDER BY percentage DESC")
	List<Object[]> allSpeakSlovene();
	
	@Query(nativeQuery = true, value = "SELECT name, COUNT(*) as count " 
			+ "FROM countries INNER JOIN languages "
			+ "ON countries.id = languages.country_id "
			+ "GROUP BY name "
			+ "ORDER BY count DESC")
	List<Object[]> countOfCitiesByCountry();
	
	@Query(nativeQuery = true, value = "SELECT cities.name, cities.population " 
			+ "FROM cities INNER JOIN countries "
			+ "ON cities.country_id = countries.id " 
			+ "WHERE (cities.population > 500000 AND countries.name = 'Mexico') "
			+ "ORDER BY cities.population DESC")
	List<Object[]> mexicoCitiesGreaterThan();

	@Query(nativeQuery = true, value = "SELECT countries.name, languages.language, languages.percentage "
			+ "FROM countries INNER JOIN languages "
			+ "ON countries.id = languages.country_id "
			+ "WHERE languages.percentage > 89 "
			+ "ORDER BY languages.percentage DESC")
	List<Object[]> languagesPerCountryMajority();

	@Query(nativeQuery = true, value = "SELECT * FROM countries "
			+ "WHERE (countries.surface_area < 501 AND countries.population > 100000)")
	List<Country> surfaceAreaPopulationSpecifics();

	@Query(nativeQuery = true, value = "SELECT * FROM countries "
			+ "WHERE (countries.surface_area > 200 " 
			+ "AND countries.life_expectancy > 75 " 
			+ "AND countries.government_form = 'Constitutional Monarchy')")
	List<Country> certainConstitutionalMonarchies();

	
	@Query(nativeQuery = true, value = "SELECT countries.name, cities.name, cities.district, cities.population " 
			+ "FROM countries INNER JOIN cities "
			+ "ON countries.id = cities.country_id "
			+ "WHERE (countries.name = 'Argentina' " 
			+ "AND cities.district = 'Buenos Aires' " 
			+ "AND cities.population > 500000)")
	List<Object[]> argentinaSpecificDistrict();

	// TODO
	@Query(nativeQuery = true, value = "SELECT region, COUNT(*) as count "
			+ "FROM countries "
			+ "GROUP BY region "
			+ "ORDER BY count DESC")
	List<Object[]> countriesPerRegion();
}
