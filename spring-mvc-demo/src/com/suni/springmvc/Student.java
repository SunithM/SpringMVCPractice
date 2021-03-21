package com.suni.springmvc;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	String firstName;
	String lastName;
	String country;
	String favoriteLanguage;
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;
	//LinkedHashMap<String,String> contryOptions;
	
	public Student(){
//		contryOptions=new LinkedHashMap<>();
//		contryOptions.put("BR", "Brazil");
//		contryOptions.put("DE", "Germany");
//		contryOptions.put("FR", "France");
//		contryOptions.put("USA", "United states of America");
//		contryOptions.put("UK", "United Kingdom");
//		contryOptions.put("RSA", "South Africa");
		
	}

//	public M<String, String> getContryOptions() {
//		return contryOptions;
//	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}
