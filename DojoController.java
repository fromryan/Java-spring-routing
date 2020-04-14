package com.ryankim.javarouting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{place}")
	public String showDojo(@PathVariable(value="place", required=false) String place) {
		String result = "";
		if(place == "dojo") {
			result = "The " + place + "is awesome!";
		}
		else if(place == "burbank-dojo"){
			result = "Burbank Dojo is located in Southern CA.";
		}
		else if(place == "san-jose") {
			result = "SJ dojo is the headquarters";
		}
		else {
			result =  "No error occurs but undefined path";
		}
		return result;		
	}
}
