package com.optimus.harvey.business.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordCountService {
	
	@Autowired
	public WordCountService() {
		// ener something that will be an alternate constructor
	}
	
	public HashMap<String,Integer> countWords(String sourceString){
		HashMap<String, Integer> wordMap = new HashMap<>();
		//write some logic here
		wordMap.put("a", 2);
		wordMap.put("b", 7);
		wordMap.put("h", 1);
		
		return wordMap;
	}

}
