package com.optimus.harvey.business.service;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordCountService {
	
	private static final Logger logger = Logger.getLogger(WordCountService.class.getName());
	
	@Autowired
	public WordCountService() {
		// ener something that will be an alternate constructor
	}
	
	public HashMap<String,Integer> countWords(String sourceString){
		HashMap<String, Integer> wordMap = new HashMap<>();
		try {
		//write some logic here
		String[] arrayOfStrings = sourceString.split("\\s");
		if(arrayOfStrings!=null){
		for(int i = 0; i<arrayOfStrings.length; i++) {
				if(wordMap.containsKey((arrayOfStrings[i]).toLowerCase())) {
					wordMap.put(arrayOfStrings[i].toLowerCase(), wordMap.get(arrayOfStrings[i])+1);
				}else {
					wordMap.put(arrayOfStrings[i].toLowerCase(), 1);
				}
			}
		}
		}catch(Exception e) {
			logger.log(Level.SEVERE, "WTF !!!!", e);
		}
		return wordMap;
	}

}
