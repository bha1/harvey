package com.optimus.harvey.web.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
	
	private static String infoText = "This application will try to analyse the text you have provided. It wil be a good tool for evaluvation your writing patterns once fully completed.";

	@RequestMapping(method=RequestMethod.GET,value="/information")
	public String info() {
		return infoText;
	}
}
