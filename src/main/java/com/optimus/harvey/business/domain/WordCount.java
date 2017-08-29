package com.optimus.harvey.business.domain;

import java.util.HashMap;

public class WordCount {
	private String sourceString;
	private HashMap<String,Integer> wordMap;
	public String getSourceString() {
		return sourceString;
	}
	public void setSourceString(String sourceString) {
		this.sourceString = sourceString;
	}
	public HashMap<String, Integer> getWordMap() {
		return wordMap;
	}
	public void setWordMap(HashMap<String, Integer> wordMap) {
		this.wordMap = wordMap;
	}
	
	
}
