package com.jonfriend.java18hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// jrf add 
import org.springframework.web.bind.annotation.RequestParam;
// jrf end 

@RestController

public class HomeController {

	@RequestMapping("/")
	
//	public String welcome() {
//		return "Welcome!"; 
//	}
	
	public String index(
		@RequestParam(value="firstName", required=false) String firstName 
		, @RequestParam(value="lastName", required=false) String lastName
		, @RequestParam(value="times", required=false) Integer times
		
	) 
	
	
	{
		String searchedForTextFormatted ; 
		String nameMultiplicity = ""; 

		if (firstName != null && lastName != null) {
			searchedForTextFormatted = firstName + " " + lastName;        	
		} else if (firstName == null && lastName == null) {
			searchedForTextFormatted = "big nada!"; 
		} else {
			searchedForTextFormatted = firstName == null ? 
					"only last name: " + lastName : 
					"only firstName: " + firstName; 
        }
		
		if (times == null || times == 0) {
			nameMultiplicity = searchedForTextFormatted; 
		} else {
			int i = 1; 
			while (i <= times) 
			{ 
				nameMultiplicity += String.format(" " + searchedForTextFormatted, " "); 
				i++; 
			}
		}
		
		return 
				String.format(
				"<h1> HELLO!</h1>" +
				"<h2>You searched for... <h2>" + 
				"<h3>" + nameMultiplicity + "</h3>"
				);
							
//				"multiply above by " + times; 
		}
	}


//		String finalDisplayText; 
//		int i = 1; 
//		finalDisplayText = 
//		while (i <= countOfPrintOuts)
//		{
//			String.format(
//					"<h1> HELLO, HELLS YEAH!</h1>" +
//					"<h2>You searched for... <h2>" + 
//					"<h3>" + searchedForText + "</h3>"
//					); 	
//			i ++; 
//		}
//		return finalDisplayText; 
	// JRF: put this into the URL as a test: http://localhost:8080/human/?q=yes+no
	
//	@RequestMapping("/someday")
//	public String today() {
//		return "You got this"; 
//	}
//	
//	@RequestMapping("/oohsomeday")
//	public String tommy() {
//		return "can't stop, won't stop"; 
//	}

// end of methods

